# Bash
BASH - Bourne Again Shell
Scripting language for linux machines

WSL - Windows subsystem for Linux

## Bash Commands
- ```pwd``` - print the working directory
- ~ - the HOME directory
- ```cd <location/path>``` - change directory
- **absolute path** - a definitive location in the file system (begin /)
- **relative path** - define the relationship from the current directory to a target directory (begin .)
- . - indicates the current working directory
- .. - indicates the parent directory
- ```ls``` - list the contents of the current directory
- ```clear``` - clears the current terminal instance
- ```chmod``` - modifies the access rights of an object
- ```mkdir``` - create a directory
- ```touch``` - allows us to create a file (it also updates the last modified date/time)
- ```echo``` - returns the value provided
- ```grep``` - accepts an input data stream, and compares to a target with regex pattern matching
- ```cat``` - returns the contents of a file to the terminal (data stream)
- ```cp``` - copy a file
- ```mv``` - move a file
- ```rm``` - delete a file or directory (with the -r flag)

More information on Bash commands: [here](https://www.w3schools.com/bash/bash_commands.php)

Stream redirect
- ```>``` to overwrite a file
- ```>>``` - to append a file
- ```|``` pipe - redirects command outputs to command inputs (to chain results into a new command)


## Example
```Bash
#!/bin/bash
echo "Hello World"

echo "Please enter your name:"
read user_name

echo "Hello, $user_name! Welcome to the Bash scripting world."
```
