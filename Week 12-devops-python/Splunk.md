# Splunk
- Tools that lets us upload logs and performs searches, reports, and generated files
- Splunk takes in a variety of different log formats
- As long as we have a log file and Docker to install, we are ready to use Splunk

## Installing Splunk
- As we know, Docker lets us package dependencies/applications into an image from which we can build containers
- Luckiy, there is a Splunk image, meaning if we just create a container from that image, we can use Splunk
- Open Docker Desktop
- Command: docker run -d -p 8000:8000 -e "SPLUNK_START_ARGS=--accept-license" -e "SPLUNK_PASSWORD=password" --name splunk splunk/splunk:latest
    - This command will run a Splunk instance, letting us connect and interact
    - Breaking down the command:
        - docker run - running a container (the instances that is based on is not specific until later on in the command) 
        - -p 8000:8000 - allows us to access port 8000 from host environemnt, mapping the port in the docker container to the port on our host environment
        - -d - detached mode, meaning when we run the container it won't occupy the terminal, running detached in the background
        - e "SPLUNK_START_ARGS=--accept-license" -e "SPLUNK_PASSWORD=password" - passing in some environment variable, notably the password needed to log in to Splunk
        - name --name splunk - gives a name to the container
        - splunk splunk:latest - image from which we are building the container
- After we run this docker command, wait a few minutes and then go to localhost:8000

## Accessing and using Splunk
- When you get to localhost:8000, sign in using admin as username and the password that we specified in the docker run command as the password
- First, go to the setings -> Add Data
    - Upload
    - Select File -> Upload the log file that we want to analyze
    - Click "Next" 
    - Set Source Type
        - Dropdown -> Appliction -> Log4j
    - Can leave Input Settings default
    - Review:
    ```
    Input Type Uploaded File
    File Name app.log
    Source Type log4j
    Host d122bf61c149
    Index Defualt
    ``` 
    - If everything looks good, click on "submit"
    - "Start Searching"

## Searching with Splunk
- On the seach page, we can enter in search terms under "New Search"
- At the right of this bar, we can also change the time-range by clicking the drop-down
- Export it - click the download button icon and select the format

## Generating a CSV with People's IDs and the Number of Pets They Own:
- We have log messages that loolk like this: ```2024-09-26 14:05:25 INFO [http-nio-8080-exec-5] AuthService:41 - Person (id: 2) now has 4 pets.```
- So, we need to extract just the person_id from these and the pet_count
- If all goes correctly, the CSV should look something like
```csv
1,3
2,4
```

## SPL - Search Proccessing Language
- Language dedicated to search through and process these data/logs
- [Cheatsheet](https://www.splunk.com/en_us/blog/learn/splunk-cheat-sheet-query-spl-regex-commands.html)
- [Index](https://docs.splunk.com/Splexicon:Index)
- SPL to analyze logs and generate a CSV with person id's and the count of pets they adopted:
```
index=<your_index> sourcetype=<your_source_type>
| rex field=_raw "Person \(id: (?<person_id>\d+)\) now has (?<pet_count>\d+) pets"
| stats latest(pet_count) as pet_count by person_id
| table person_id, pet_count
```

### Explanation of Query
#### Line 1 - Preliminary fields, indicating the type of logs, the source of the data
- Specify our index, where our data is stored on Splunk, in our case, we will use "main" because this is the default index
- Also specify our resource type, log4j
#### Line 2 - Regular Expressions - extracting fields from the log statements to be used in Splunk Processing
- rex field - indicates that we want to include a regular expression which helps us match patterns and extract out the data from the log
- In this case, we need 2 fields: person_id, pet_count
- ```(?<person_id>\d+)\)``` - this is a capture group, denoted by the ()
    - the ?<person_id> - gives a label to the captured value
    - the d+
        - \d stands for digits (0-9)
        - + stands for one or more
        - So, \d+ just means we're capturing 1 or more digits
            - Because we are capturing ids which are numerical and can have 1 or more digits
    - To test out the regular expression, go [here](https://regexr.com/)
#### Line 3 - Proccessing - grouping by person_id and returning the total count of pets they have adopted
- Now that we've extracted person_id and pet_count from the logs, now it's time to process those
- stats - Provides statistics, grouped optionally by fields
    - We want to group our data by the person_id field
- latest - returns the chronologically latest value of whatever argument (in this case, pet_count)
    - We want the latest because the pet count is going to change with every adoption
- as - like an alias in SQL, renaming the "latest" pet_count to be just pet_count to be used in the output table
- by - indicating the field by which we want to group our data
#### Line 4 - Dictating which fields should appear in the output table
- table - specify what we want in our output
    - Specify the names of the fields

### Exporting
- Once we have the table, can again click the download icon and select CSV as your format, download

```
index=main sourcetype=log4j
| rex field=_raw "Person \(id: (?<person_id>\d+)\) now has (?<pet_count>\d+) pets"
| stats latest(pet_count) as pet_count by person_id
| table person_id, pet_count
```

## Project
- If you want generate a CSV for amortization
- Think about what fields you want to extract
    - User id
    - Payment Amount
    - Remaining Balance
    - Interest Rate
    - Date of Payment
    - etc.
- Then, create a regular expression that targets all of the fields
- Finally, use SPL to run calculations, format output table as needed
    - Then, export to CSV