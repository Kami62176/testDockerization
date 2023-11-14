FROM maven:3.8-openjdk-18 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:18-ea-8-jdk-slim
COPY --from=build /target/testingDockerization-0.0.1-SNAPSHOT.jar dockerization.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "dockerization.jar"]