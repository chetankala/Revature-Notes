# CI/CD

## DevOps Lifecycle
The DevOps lifecycle is a software development proccess that involves planning, building, integrating, testing, deploying, monitoring, operating, and providing feedback. The DevOps lifecycle is a methodology that software development teams use to bring products to market more quickly and efficiently.

## CI
Continuous Integration (CI) is a software development practice that involves integrating code changes into a shared repository frequently. Developers should integrate their code daily, if not multiple times a day. Each integration can then be verified by an automated build and automated tests. The goal is to have no intervening window between commit and build, so that developers can notice and correct errors immediately.

# CD
Continuous Delivery/Deployment (CD) is a software development practice that involves building, testing, *and releasing* software in short cycles. CD uses automation to speed up the release of new code. The goal of CD is to ensure that software can be released reliably at any time.

CD is a DevOps practice that involves:
- Building and testing improvements to software code
- Delivering those improvements to user environments
- Using automated tools
- Ensuring that code is always in a deployable state
- An example of CD is updating software automatically on a mobile phone. This allows developers to tackle different situations before delivering anything to customers.

Continuous Deployment (CD) is a software development strategy that automatically releases code changes to a production environment. In CD, code changes are run through a pipeline of tests and inspections before being pushed into production. Once new updates pass the tests, the system pushes the updates directly to the software's users.
CD *eliminates the need for human safeguard* against unproven code in live software. It can result in many production deployments every day.
The five main phases of a continuous delivery pipeline are: Build/develop, Commit, Test, Stage, Deploy.
CD can serve as a second path to production. The final steps in the process are fully automated to install changes that correct a production problem as quickly as possible.


## DevOps Lifecycle Phases

### Planning
The planning phase involves identifying business requirements and gathering end-user feedback. The team creates a project roadmap to maximize business value and deliver the desired product. The vision of the project is decided during this phase, and developers begin developing the code for the application. The planning phase covers everything that happens before developers start writing code. It's where a product manager earns their keep.

### Building
The build phase is where the software development team continuously builds and compiles their code into executable software packages. Once a developer has finished a task, they commit their code to a shared repository. The team reviews the code and approves it. The build phase begins by using automation tools to build the release artifacts. These artifacts are isolated copies of the compiled code that can be deployed to the necessary environments for testing or production.

## Integration
The integration phase is a critical phase where developers integrate code changes into a shared repository. This phase involves:
- Frequent commits
- Testing at every step
- Compilation
- Unit testing
- Integration testing
- Code review
- Packaging the code
The goal of the continuous integration phase is to incorporate updated code and new functionalities into the existing codebase. The tools used in this phase include Jenkins and GitLab.

## Testing
The testing phase involves checking the developed code for bugs and errors. The DevOps team uses quality analysis (QA) to check the usability of the software. They look for bugs, errors, configuration, UX/UI problems, and other issues.
The testing phase uses automated, prescheduled, continued code tests. These tests can be written manually or in conjunction with continuous integration tool.
It allows for the detection of defects and errors at an early stage, which reduces the risk of production issues and enhances the overall quality of the software.

## Deploying
The deployment phase is where operators deploy an application to a production environment. They may also perform maintenance tasks on the application.
In the deployment phase, Infrastructure-as-a-Code helps build the production environment. Then, various tools are used to release the build. Tools used in this phase include AWS CodeDeploy, Octopus Deploy, Jenkins, and IBM Urban Code Deploy.
The deployment phase is a dynamic stage in the DevOps lifecycle. It ensures that code changes are rapidly and reliably deployed to production servers. This allows for frequent releases and continuous improvement.  

## Monitoring
The monitoring phase involves monitoring the health, performance, and reliability of the application or code, as well as the infrastructure. This phase ensures the smooth functioning and performance of the application.
During this phase, developers collect data, monitor each function, and spot errors like low memory or server connections are broken. For example, when users log in, they should access their account, and a failure to do so means there's a problem with the application.

## Operating
The operating phase is when the software is monitored, managed, and maintained in the production environment. The operations team is responsible for keeping the application online. This includes:
- Configuring and provisioning servers using tools like Chef
- Managing the service's stability and uptime
- Managing the infrastructure that hosts the code
- Monitoring the DevOps pipeline based on data collected from customer behavior and application performance
The operating phase is one of the most crucial phases of the DevOps lifecycle. It's when the operations team performs tasks to keep the application online. 

## Feedback
The continuous feedback phase involves evaluating the effect of each release on the user experience. The evaluation is reported back go the team to improve future releases. The feedback can be gathered in two methods: structured and unstructured. DevOps teams can collect feedback through various avenues, such as questionares, surveys, and social media. The continuous feedback phase is an integral part of the DevOps life cycle. It serves as a crucial link between the operations and development phases. It enables the ongoing analysis and improvement of the application throughout its lifecycle.

