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

*A Kubernetes manifest is a configuration file that defines how an application runs on Kubernetes platform. It describes the desired state of Kubernetes objects, such as pods, services, and deployments. Manifests are written in YAML or JSON formats. Manifests are used to create, update, or delete resources in a Kubernetes cluster. They allow you to deploy, scale, and update appliations in a consistent and reproducible way. When a manifest is applied to a Kubernetes cluster, Kubernetes creates an object based on the configuration.*

Manifests can be applied to a K8s cluster, and are idempotent (they'll only modify the cluster if there is some difference between the current state of the cluster and the desired state declared in the manifest), so they provide a safe and repeatable way to manage a K8s environment.


## Kubernetes Abstraction
Kubernetes depends on the difference between the physical devices used to host the cluster, and the logical abstractions that can facilitate to provide resiliance and manage complex behaviors. Some of the abstractions that we can use inlude Namespaces to help organize resources...

*In Kubernetes, a namespace is a way to organize a cluster into virtual sub-clusters. Namespaces can be useful when multiple teams or projects share a cluster. They provide scope for Kubernetes resource names and can help isolate resources logically. Namespaces are logically separated from each other, but they can communicate with each other. Namespaces are an abstract resource that enable Kubernetes to set boundaries for other resources. Once you create a namespace, you can assign Kubernetes resources such as services, pods, secrets, and config maps to namespace. You can think of each namespace as a folder that holds a set of objects. By default, the kubectl command-line tool interacts with the default namespace. If you want to use a different namspace, you can pass kubectl the --namespace flag.*

Deployments to help manage sets of pods that share a purpose...

*A Kubernetes deployments is a resource object that allows administrators to describe the life cycle of an application. Deployments provide declarative updates to applications, including which images to use, the number of pods, and how you update them. Deployments also tell Kubernetes how to create or modify instances of the pods that hold a containerized application. Deployments can help to scale the number of replica pods, enable the rollout of updated code in a controlled manner, or roll back to an earlier deployment version if necessary. Deployments are very flexible. They can be used to create a Pod for an application, and to scale the application by creating multiple instances. Updating instances is done easily by updating one after another.*

Services to help organize networking for a deployment...

*In Kubernetes, a service is a network abstraction for a group of pods. A service is a logical collection of pods in a cluster. Services are often used to power a microservice architecture. A service defines a logical set of pods and a policy for accessing them. Services enable a loose coupling between dependent pods. Services are defined using YAML or JSON. When a network request is made to a service, it selects all pods in the cluster that match the service's selector. It then chooses one of the pods and forwards the request to it. Services can be used to load balance across pods, or expose an application deployed on a set of pods. Kubernetes supports four types of services: ClusterIP, NodePort, LoadBalancer, Ingress.*

While abstractions like Replica Sets and Daemon Sets can help developers manage the lifecycle of pods, or the environment that a pod runs in. 