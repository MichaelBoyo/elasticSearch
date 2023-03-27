FROM eclipse-temurin:17-jdk-alpine
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","-Dserver.port=${PORT}","-Dspring.profiles.active=prod","/app.jar"]