# AWS

## What is Cloud Computing?
Cloud computing is the on-demand delivery of compute power, database storage, applications and other IT resources through a cloud service platform via the Internet with pay-as-you-go pricing.

### Various Features of Cloud Computing
- Resource Pooling
- On-Demand Self-Sevice 
- Easy Maintenance
- Large Network Access
- Availability
- Automatic System
- Economical
- Security
- Pay-as-you-go
- Measured Service

## 3 Models of Cloud Computing
- Software as a Service (SaaS)
- Platform as a Service (PaaS)
- Infrastructure as a Service (IaaS)

<img src = "https://cms.webcreatify.com/gallery/1273-cloud-computing-2.png">

#### Pizza as a service

<img src = "https://miro.medium.com/max/1400/1*JacqOl2kjyTYzv31v0xITw.png">

## Regions and Availability Zones

### Regions
A highly available data center that houses Amazon cloud computing resources in different areas of the world (33 in total)

### Availability Zones
Each AWS Region contains multiple distinct locations called Availability Zones, or AZs. Each Availability Zone is engineered to be isolated from failures in other Availability Zones. (105 total in the world)

# RDS Overview

## What is Amazon Relational Database Service (Amazon RDS)?
Amazon Relational Database Service (Amazon RDS) is a web service that makes it easier to set up, operate, and scale a relational database in the cloud. It provides cost-efficient, resizable capacity for an industry-standard relational database and manages common database adminisration tasks.

* RDS **automates** expensive and time consuming tasks such as managing backups, software patching, automatic failure detection, and recovery.

* You can help control who can access your RDS databases by using **AWS Identity and Access Management (IAM)** to define users and permissions.

* RDS is available on several **database instance types**. **Instance types** comprise varying combinations of CPU, memory, storage, and networking capacity and give you the flexibility to choose the appropriate mix of resources for your database.
    * Examples of instance types include `T3`, `T2`, `M6g`, `M5`, etc... You can read more on instance types [here](https://aws.amazon.com/rds/instance-types/)

* RDS is **free to try** and you will be charged based on how much computational power you use per month (pay-as-you-go).

* RDS provides you with six familiar database engines to choose from, including Amazon Aurora, PostgreSQL, MySQL, MariaDB, Oracle Database, and SQL Server.

## Why Use RDS?
It's important to distinguish AWS RDS from *other database solutions offered through AWS*.

* AWS offers 15 database engines including *relational, key-value, document, in-memory, graph, time series, and ledger databases*.

* With **RDS**, you don't need to worry about database management tasks such as server provisioning, patching, setup, configuration, backups, or recovery. The RDS manages this for you.
