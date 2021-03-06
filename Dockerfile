FROM openjdk:8-jre-alpine

COPY /target/spring-boot-starter-0.0.1-SNAPSHOT.jar /spring-boot-starter.jar

EXPOSE 8080

CMD ["java", "-jar", "spring-boot-starter.jar"]