FROM maven:3.6.3-jdk-11 as builder
COPY ./src /usr/src/app/src
COPY ./pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean package

FROM openjdk:11-jre-slim
COPY --from=builder "/usr/src/app/target/metegol-project-0.0.1-SNAPSHOT.jar" "/usr/app/metegol-project-0.0.1-SNAPSHOT.jar"
EXPOSE 8080
CMD java -jar /usr/app/metegol-project-0.0.1-SNAPSHOT.jar
