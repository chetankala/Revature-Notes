## AWS Fundementals, CodeBuild/CodeCommit/CodeDeploy, Splunk, and other DevOps Concepts

### **Section 1: AWS Fundementals**

#### 1.1 **Amazon EC2 (Elastic Compute Cloud)**

- **What is EC2?**
    - EC2 is a web service that provides resizable compute capacity in the cloud, allowing you to run applications on virtual servers called instances.

- **Why would you choose to use and EC2 to host your DB?**
    - Full control over the database server, including operating system configurations and specific database software versions.
    - Ability to customize hardware specifications, security settings, and data backups.
    - EC2 is a good fit when the database requires special configurations not supported by managed services like RDS.

- **Key features of EC2**:
    - **Auto Scaling**: Automatically add or remove EC2 instances based on specified conditions like CPU utilization.
    - **Elastic Load Balancing (ELB)**: Distributes incoming application traffic across multiple EC2 instances.

- **Setting up EC2 Auto Scaling**:
    - Create a **Launch Configuration** or **Launch Template**.
    - Define an **Auto Scaling Group** and configure scaling policies to scale in and out based on metrics like CPU usage or memory consumption

- **Select the Correct Syntax for SSH Command**:
    - The correct syntax to connect to an EC2 instance is:
        ```bash
        ssh -i "your0-keyfile.pem" ec2-user@ec2-x-x-x-x.compute-1.amazonaws.com
        ```
        - `your-keyfile.pem`: The key pair file.
        - `ec2-user`: Default username for Amazon Linux AMIs.
        - `ec2-x-x-x-x.compute-1.amazonaws.com`: Public DNS of the EC2 instance.

- **It is impossible to reassign a new key to an EC2 instance after it is created.**
    - **False**: You can reassign a new key pair by creating a new image (AMI) of the instance or by mounting the EBS volume on another instance to change they key configuration.

- **How do you secure EC2?** (Select all valid options)
    - Use **Security Groups** and **Network ACLs** to control traffic.
    - Apply **IAM Roles** for permission management.
    - Enable **Encryption** for data at rest and in transit.
    - Regularly update the instance OS and software to patch security vulnerabilities.

- **Programmatic Access to AWS Services**:
    - Create an **IAM User** with programmatic access enabled and generate an **Access Key ID** and **Secret Access Key**

- **In AWS, Security Groups Allow All Traffic by Default.**
    - **False**: Security Groups deny all inbound traffic by default and allow all outbound trffic.

- **AWS Regions and Availability Zones**:
    - **Regions**: Geographical locations with multiple Availability Zones.
    - **Availability Zones**: Discrete data centers with redundant power, networking, and connectivity.

---

### 1.2 **Amazon RDS (Relational Database Service)**

- **What is Amazon RDS?**:
    - A managed relational database service that support multiple database engines, including MySQL, PostgreSQL, Oracle, and SQL Server.

- **Why choose RDS over Hosting on EC2?**
    - RDS handles database management tasks such as backups, patching, and replication, allowing you to focus on your application rather than database maintenance.

- **RDS Backup and Restore Options**:
    - Automatic daily snapshots.
    - Point-in-time recovery using transaction logs.

---

### 1.3 **Amazon S3 (Simple Storage Service)**

- **Amazon S3 is which type of Storage Service?**
    - Object Storage Service

- **Possible Uses of an S3 bucket?** (Select all of apply)
    - Storing application backups
    - Hosting static websites
    - Storing and retrieving data from web applications
    - Storing media files like images and videos

- **Rules for setting up an S3 bucket**:
    - Bucket names must be gloablly unique
    - Names must be DNS-complient (lowercase letters, number, and hyphens)

- **Controlling Access to S3 Objects**:
    - Use **Bucket Policies**, **IAM Policies**, or **Access Control List (ACLs)**.

- **S3 Buckets for Hosting Websites**:
    - S3 buckets host static websites without needing a web server. Enable **static website hosting** and set the bucket policy to allow public access.

- **You want to HOST a front-end website in AWS. What is the appropriate service?**
    - **Amazon S3**

- **How to make an S3 bucket public for webpage access?**
    - Configure the bucket policy to allow public read access.
    - Enable static website hosting in the bucket setting. 

---