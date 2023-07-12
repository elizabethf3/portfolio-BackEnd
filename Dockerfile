FROM amazoncorretto:11
MAINTAINER elizabeth
COPY target/SpringBoot-0.0.1-SNAPSHOT.jar elizabeth-app.jar
ENTRYPOINT ["java","-jar","/elizabeth-app.jar"]
EXPOSE 8080