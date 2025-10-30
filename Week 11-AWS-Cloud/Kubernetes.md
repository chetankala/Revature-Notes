# Kubernetes

## What is Kubernetes (K8s)?
Kubernetes is an open-source platform for managing containerized workloads and services. It automates many of the manual processes involved in deploying, managing, and scaling containerized applications.
Kubernetes was developed by Google engineers and open sourced in 2014. It's also known as "k8s" or "kube".
Kubernetes runs programs in containers so they can be isolated from each other and be easy to develop and deploy. A complete application may comprise many containers, all needing to work together in specific ways.
Kubernetes has built-in commands to handle a lot of the heavy lifting that goes into application mangement. This allows you to automate day-to-day operations and make sure applications are always running the way you intend them to run.
Kubernetes supports numerous container runtime including Docker, containers, CRI-O, and any implementation of the Kubernetes CRI (Container Runtime Interface).


## Kubernetes Architecture
Kubernetes clusters are built from Nodes...

*A node represents a single machine in the cluster. A node can be a physical machine or a virtual machine. It can be hosted on-premises or in the cloud. A node can be made out of a bare metal server, VM, or container. It can host one or more pods. A Kubernetes cluster can have a large number of nodes. Recent versions support up to 5,000 nodes.*

The nodes offer resources (CPU and memory) to run Pods...

*Pods are the smallest and simplest unit in the Kubernetes object model. They represent a single instance of a running process in a cluster. Pods are ephermal by nature. If a pod or the node it executes on fails, Kubernetes can automatically create a new replica of that pod to continue operations.*

Which act as a wrapper for the containers that run inside of them. In most circumstances, the containers run individually inside of a pod, but when necessary a single pod may contain mutiple containers.


## Kubernetes Interaction
As a developer, we do not interact directly with a pod or node to create a new service/container. Instead, we interact with the Control Plane...

*Kubernetes control plane is a collection of processes that manage the state of a Kubernetes cluster. It receives information about cluster activity and requests, and uses this information to move cluster resources to the desired state. The control plane is responsible for:*

- *Maintaining the desired state of any object in the cluster*
- *Managing worker nodes and pods*
- *Making global decisions about the cluster*
- *Detecting and responding to cluster events*
*The control plane is made up of five components:*
- *Kube-api-server*
- *Kube-scheduler*
- *Kube-controller-manager*
- *Cloud-controller-manager*
*In production environments, the control plane usually runs across multiple computers. A cluster usually runs multiple nodes, providing fault-tolerance and high availability.*

By using `kubectl` (kube control) commands.

*Kubectl is a command-line tool for Kubernetes that allows you to interact with your Kubernetes cluster. It's the primary way for developers to interact with a Kubernetes cluster. Kubectl makes it easier to use the Kubernetes API.*

With the `kubectl` command, we can tell the K8s cluster to create a new resource, manage exisiting resources, or inspect a status to name just a few capabilities. `kubectl` allows developers to interact with the cluster directly, declaring a resource to create and defining it attributes in the terminal CLI, or through a script called a Manifest...

*A Kubernetes manifest is a configuration file that defines how an application runs on Kubernetes platform. It describes the desired state of Kubernetes objects, such as pods, services, and deployments. Manifests are written in YAML or JSON fomrats. Manifests are used to create, update, or delete resources in a Kubernetes cluster. They allow you to deploy, scale, and update appliations in a consistent and reproducible way. When a manifest is applied to a Kubernetes cluster, Kubernetes creates an object based on the configuration.*

Manifests can be applied to a K8s cluster, and are idempotent (they'll only modify the cluster if there is some difference between the current state of the cluster and the desired state declared in the manifest), so they provide a safe and repeatable way to manage a K8s environment.