FROM maven:3.6.0-jdk-11-slim AS build
COPY src /usr/src/app/src 
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean package

FROM openjdk:11-jdk-slim
COPY --from=build /usr/src/app/target/eureka-server-0.0.1-SNAPSHOT.jar /usr/app/app.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","/usr/app/app.jar"]