# ===== Stage 1: Build the Spring Boot application =====
# Use the official Maven image with OpenJDK 21 to build the project
FROM maven:3.9.11-eclipse-temurin-21-alpine AS build

# Set the working directory inside the container
WORKDIR /app

# Copy only the pom.xml first to leverage Docker cache for dependencies
COPY portfolio/pom.xml .

# Download all Maven dependencies without building the project yet
RUN mvn dependency:go-offline -B

# Copy the source code into the container
COPY portfolio/src ./src

# Package the Spring Boot application into a JAR file
# -DskipTests skips running unit tests to speed up the build
RUN mvn clean package -DskipTests


# ===== Stage 2: Create the runtime image =====
# Use a lightweight JDK 21 image to run the application
FROM eclipse-temurin:21-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR from the build stage into the runtime image
COPY --from=build /app/target/portfolio-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080 (Spring Boot default)
EXPOSE 8080

# Run the JAR file when the container starts
ENTRYPOINT ["java", "-jar", "app.jar"]
