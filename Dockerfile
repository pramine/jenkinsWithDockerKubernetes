FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/jenkinsWithDockerKubernetes-1.0.0-SNAPSHOT.jar trainpoc.jar
ENTRYPOINT ["java", "-jar", "/trainpoc.jar"]