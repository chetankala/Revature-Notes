# Jenkins
Jenkins is an open-source automation tool that helps developers and DevOps engineers build and test software projects. It's used to manage and control several stages of the software delivery process, including: Build, Documentation, Automated testing, Packaging, Static code analysis. Jenkins is the most popular open source CI/CD tool on the market. It's used by thousands of development teams. Jenkins makes it easier for developers to integrate changes to a project. Before Jenkins, developers would need to wait until other developers finished coding to check their build. With Jenkins, the code is built immediately after any developer commits.


## Jenkins Controller
The Jenkins controller is the central control for a Jenkins cluster. It's a web server that schedules build jobs and dispatches them to worker nodes. The controller also manages other nodes running the Jenkins Agent. It can also execute builds, but it's not as scalable as Jenkins agents. The controller may run out of resources (CPU/memory) if the number or load of your projects increases.
The controller is responsible for:
- Scheduling build jobs
- Dispatching jobs to worker nodes
- Monitoring agents
- Deciding how, when, and where to run tasks
- Managing tasks such as configuration, authorization, and authentication


## Build Agent
A build agent is a machine or container that runs build tasks on behalf of a Jenkins controller. The controller, also known as the master node, manages the assets. The controller schedules jobs on the agents and monitors their work. The agents can be connected to the controller using local or cloud computers. The agents could be a virtual machine (VM), a Docker container, or bare metal.


## Pipelines
A continuous delivery pipeline is an automated process for getting software from version control to users and customers. A pipeline is a group of events ot tasks that are linked together in a sequence. A Jenkins pipeline includes all the tools you need to orchestrate testing, merging, packaging, shipping, and code deployment.
A Jenkins pipeline is typically divided into multiple stages and steps. Each stage groups together similar steps. Each step represents a single task.
A Jenkins pipeline has four discrete states: build, deploy, test, and release. Each task or event in a Jenkins pipeline depends on at least one other event.


## Tabula Rosa - Blank Slate
Every new environment (VM, container, etc) is a blank slate. When Jenkins follows the pipeline that a developer provides, it cannot make the decision to install a dependency of its own free will. The developer must remember that the environment may be unused, and will require the installation of all dependencies and resources required to complete any task.


## Groovy
Groovy is a powerful, dynamic, and agile programming language that can be used in Jenkins to orchestrate pipelines. Groovy can do almost anything Java can do, including:
- Creating sub-processes
- Executing commands on the Jenkins controller and agents
- Reading files that the Jenkins controller has access to

Groovy can be used in Jenkins files to build more complex pipelines. The Jenkins file is written and submitted to the project source repository. When a commit arrives, the Jenkins pipeline is triggered. Groovy has a Java-like syntax and uses dot-separated notation to simplify the authoring of code. It also has a concise, familiar, and easy-to-learn syntax. 

Groovy is not the only way to develop a process for Jenkins since the Jenkins UI will allow most common tasks to be built through the GUI. However, it is the most customizable, offering the full power of control flow logic and sub-processes (methods/functions) to help developers make more intelligent workflows.


