# Runtime only - Jenkins has already performed the 'mvn package'
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copies the jar created by the Jenkins 'bat' step into the image
COPY target/agilefat.jar agilefat.jar

EXPOSE 9090
ENTRYPOINT ["java", "-jar", "agilefat.jar"]
