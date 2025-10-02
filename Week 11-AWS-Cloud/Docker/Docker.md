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