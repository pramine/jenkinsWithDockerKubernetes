FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8086
ADD target/jenkinsWithDockerKubernetes-1.0.0-SNAPSHOT.jar jenkinsWithDockerKubernetes.jar
ENTRYPOINT ["java", "-jar", "jenkinsWithDockerKubernetes.jar"]