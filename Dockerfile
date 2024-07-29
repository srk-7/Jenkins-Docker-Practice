FROM eclipse-temurin:17-jdk-focal
EXPOSE 2008
ADD target/springboot-docker-jenkins-0.0.1-SNAPSHOT.jar springboot-docker-jenkins-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/springboot-docker-jenkins-0.0.1-SNAPSHOT.jar"]