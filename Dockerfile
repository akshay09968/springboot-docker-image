# Use an official OpenJDK runtime as a base image
FROM openjdk:17-jdk

# Set the working directory inside the container
#WORKDIR /app

# Copy the packaged JAR file from the host to the container's working directory
ADD target/SpringDockerImge2-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that your Spring Boot application listens on
EXPOSE 8080

# Set the entry point to run the Spring Boot application when the container starts
ENTRYPOINT ["java", "-jar", "app.jar"]
		 