FROM openjdk:17-jdk-alpine

COPY . /app
WORKDIR /app

RUN ./mvnw clean package

ENTRYPOINT ["java","-jar","target/springboot-api-1.0.0.jar"]
