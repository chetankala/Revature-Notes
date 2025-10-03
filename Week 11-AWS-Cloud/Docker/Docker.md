# Intro to Docker
Docker is an open-source platform for developing, shipping, and running applications using containers.

# Containerization
Helps to ensure the application, or set of processes can run reliably regardless of the host environment. The container shouldn't be able to modify or interact with anything it doesn't need to, and on a whole, changes in the container should not effect the host or other containers.

Linux Conatiners are the foundation of most modern container systems.
- They started with cgroups and namespaces.
    - cgroups allowed control over the resources.
    - namespaces allowed for encapsulation of resources, and determined what is visible to particular processes.

- These containers are:
    - built from images (a template for the container)
    - run on engine (on the host OS) i.e Docker Engine
    - Are ideally stateless
        - any state that is needed for the application should be stored in a way that is detachable from the actual container
    - Virtualized and isolated

More benefits of containers:
    - Secure
    - Standardized and portable
    - Lightweight
    - Flexible and loosely coupled
    - Scalable

# Containers vs Virtual Machines (VMs)
Containers and VMs both provide the ability to isolate processes. However, each have their own pros and cons

## Virtual Machines: simulate a physical server/machine
- They virtualize entire Operating Systems
- Enabled by hypervisor: a software that coordinates between multiple VMs and interfaces with the underlying infrastructure 

VM Pros:
-   near total isolation
-   provides virtualization
-   ensures an application runs reliably regardless of the host

VM Cons:
-   considered bulky, expensive in context of resources

## Containers: bundle together applications with their supporting libraries and dependencies allowing them to run in isolation
-   The container will share the underlying OS kernel
-   Much lighter weight than a VM
-   Containerization is provided by an engine running on the host, i.e Docker

Container Pros:
-   considered lightweight because they don't require spinning a whole OS
-   they can enable layers of isolation
-   provide a virtualized view of certain resources
-   package an application is an isolated environment
-   ensure an application runs reliably regardless of the host

Container Cons:
-   having layers of isolation can make things difficult

In general, it is suggested to use containers over VMs because of the cost of resources

# Docker Architecture
Docker runs on a Client-Server Architecture

-   You run commands on a client, which interacts with the Docker Daemon

<img src="https://www.whizlabs.com/blog/wp-content/uploads/2019/08/Docker_Architecture.png">

## Docker CLI
The Docker Command Line Interface is the client in the client-server architecture
-   It is used to interact with the Daemon
-   Uses a Rest API to send command to the Docker Daemon

## Docker Daemon
The Docker Daemon is the long running process on the docker host that does all of the heavy lifting
-   manage docker objects
-   containers
-   images
-   the core of the running dockerized applications

## DockerHub Container Registry
Provides a centralized place to store images, allowing you to easily share images between docker hosts
-   Dockerhub is a public registry managed by docker that allows you to push and pull containers
-   https://hub.docker.com/search?q=


# Docker Objects
Are the building blocks that are managed by the docker daemon. The most fundemental objects are the images and containers

## Docker Images
Docker images are a blueprint for a container
-   Outlined in a dockerfile

## Docker Containers
Docker container is a runnable isolation instance of a set of processes and their dependencies
-   These are built from docker images, which lays out everything the processes that run in the container will need
-   Managed by the docker daemon as part of the docker engine


# Dockerfile
Defines everything needed for an image. It outlines the starting point, dependencies, and commands that make up all the processes for an image and in turn a container

-   Use these to create our images, contains a step-by-step instructions to create the image


# Dockerfile Keywords
`FROM image name`
-   Specifies the parent image from which the new image should be based

`RUN <command> / RUN ["executable", "param"]`
-   used to setup your image, the state of the image after each run command is committed forms of a new layer

`ADD <src> <dest>`
-   adds files from build context or URL to image

`COPY <src> <dest>`
-   adds files from build context or URL to image

`EXPOSE`
-   outline ports that being listened on by processes in the container

`WORKDIR`
-   set the working directory in the image and the eventual container of commands that follow

`CMD`
-   used to execute/run processes needed inside your container

For more information, view this cheat sheet: https://kapeli.com/cheat_sheets/Dockerfile.docset/Contents/Resources/Documents/index 


# Building an Image
There are two ways to create an image:

-   Using the `docker build anyflags PATH` command in the CLI
    -   This is how you can create an image with a dockerfile
-   Using `docker commit flags CONTAINER imagename` command in the CLI
    -   You are committing the changes from the container specified to the image specified
    -   You are creating an image based off of an existing docker container


# Creating a Container
There are two ways to create a Docker container
