# Stage 1: Build the app using Maven with JDK 21
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /home/app

# Copy pom.xml and pre-download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the rest of the source code
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Stage 2: Run the built JAR with JDK 21
FROM eclipse-temurin:21-jdk
WORKDIR /home/app
EXPOSE 5000

# Copy the jar from the build stage
COPY --from=build /home/app/target/*.jar app.jar

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]