# Stage 1: build
FROM maven:3.9.6-eclipse-temurin-17 AS build

WORKDIR /app
COPY . .

RUN mvn clean package

FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY --from=build /app/target/meu-projeto-jenkins-1.0-SNAPSHOT.jar ./app.jar

CMD ["java", "-jar", "app.jar"]
