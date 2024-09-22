FROM amazoncorretto:21.0.4-alpine
MAINTAINER ESMERALDA
COPY target/MedLearn-0.0.1-SNAPSHOT.jar MedLearnBackend.jar
ENTRYPOINT ["java", "-jar", "/MedLearnBackend.jar"]