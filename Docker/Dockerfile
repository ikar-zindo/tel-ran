##
# k-curry-jib-employee Build stage
##
FROM maven:3.8.7-eclipse-temurin-17-alpine AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package -Dmaven.test.skip=true


##
# Package stage
##
FROM openjdk:17-slim-buster
COPY --from=build /home/app/target/k-curry-jib-0.0.1-SNAPSHOT.jar /usr/local/lib/k-curry-jib.jar
EXPOSE 8888
ENTRYPOINT ["java","-Dspring.profiles.active=docker","-jar","/usr/local/lib/k-curry-jib.jar"]


##
# k-curry-jib-app + db
##
FROM mysql:latest

ENV MYSQL_DATABASE=k-curry-jib
ENV MYSQL_ROOT_PASSWORD=12345

COPY init-db.sql /docker-entrypoint-initdb.d/

EXPOSE 3306

##
# run .jar without maven build
##
FROM openjdk:17-jdk
ARG JAR_DILE=target/*.jar
COPY ./target/k-curry-jib.jar /usr/local/lib/k-curry-jib.jar
EXPOSE 8888
ENTRYPOINT ["java", "-jar", "/usr/local/lib/k-curry-jib.jar"]