# Serverless Computing Introduction

## Overview

Serverless Computing is an application development model that allows developers to focus on building and running application code without the need to manage servers. In traditional server-based computing, the developer is responsible for writing application code as well as managing and provisioning servers, whether physical or through the cloud via a Cloud Service Provider (CSP).

In contrast, serverless architecture eliminates the need for developers to manage server infrastructure. Instead, server management is handled directly by a CSP, sush as Amazon Web Services (AWS) or Google Cloud Platform (GCP). While servers are still used in this model, they are managed and provisioned by the CSP, making them "invisible" to the developer. This approach allows developers to focus soley on writing application code and defining the events that trigger it, a model typically known as "Function-as-a-Service" or FaaS. This has numerous benefits, which are outlined below.


## Benefits of Serverless Computing
- Automatic Scaling
    - Serverless platforms automatically scale to handle various workloads
    - If your function suddenly experiences a splike in traffic, the platform can allocate more resources as needed

- Cost Efficiency 
    - In traditional server-based approach, you pay for idle server costs (charges for running the server with little to no traffic). Serverless computing eliminates these idle costs because server instances are spun up pay for your direct usage.

- No Server Management 
    - The most significant advantage of serverless computing is that developers no longer need to manage server provisioning, patching, or maintenance.
    - Developers can focus soley on writing application code and defining what events trigger that code.


# Serverless Computing Architecture

## Event-Driven Model

Serverless computing often follows on event-driven model, where the execution of code (functions) is triggered by specific events. These events can range from HTTP requests, file uploads, and database changes to scheduled tasks and more. This model allows for highly responsive applications that can scale dynamically based on demand.

## Serverless Does Not Mean No Servers

It's a common misconception that "serverless" means there are no servers involved. In reality, servers are still used to execute functions, but the management of these servers is abstracted away from the developer. Cloud Service Providers like AWS, Google Cloud, and Azure handle server provisioning, maintenence, and scaling, allowing developers to focus solely on writing code.


# Functions-as-a-Service (FaaS)

## What is it?
Function-as-a-Service (FaaS) is a serverless computing service that allows developers to run code in response to events without the complexity of building and maintaining the infrastructure typically associated with developing and launching an application. FaaS provides an efficient way to execute functions in a scalable, event-driven manner.