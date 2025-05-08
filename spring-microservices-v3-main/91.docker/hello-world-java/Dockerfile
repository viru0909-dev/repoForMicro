# Stage 1: Use Maven with JDK 21 to build the JAR
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /home/app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Run the built JAR with JDK 21 runtime
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /home/app/target/*.jar app.jar
EXPOSE 5000
ENTRYPOINT ["java", "-jar", "app.jar"]