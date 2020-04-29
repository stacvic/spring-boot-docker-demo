FROM maven:3.5.4-jdk-10-slim
COPY ./target/spring-boot-docker-demo-0.0.1-SNAPSHOT.jar usr/src/com/
WORKDIR /usr/src/com
EXPOSE 8080
CMD ["java", "-jar", "spring-boot-docker-demo-0.0.1-SNAPSHOT.jar"]