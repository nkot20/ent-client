FROM openjdk:8-jdk-alpine

#COPY JAR FILE
COPY target/ent-isj-client.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]