# This Dockerfile sets up a container for a Java application using OpenJDK 17 on Alpine Linux.
# It copies the built JAR file into the container and specifies the command to run the application.

FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY build/libs todo-app.jar /app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "todo-app.jar"] 