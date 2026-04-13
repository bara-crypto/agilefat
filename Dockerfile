# STAGE 1: Build stage
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app

# Copy the pom.xml and source code
COPY pom.xml .
COPY src ./src

# Build the application - This creates the executable fat JAR
RUN mvn clean package -DskipTests

# STAGE 2: Runtime stage
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copy the JAR from the 'build' stage
# Note: Use a wildcard if the version changes, or set <finalName> in pom.xml
COPY --from=build /app/target/agilefat.jar agilefat.jar

EXPOSE 9090
ENTRYPOINT ["java", "-jar", "agilefat.jar"]


#FROM eclipse-temurin:17-jre-alpine
#WORKDIR /app

#COPY target/agilefat.jar agilefat.jar

#EXPOSE 9090
#ENTRYPOINT ["java", "-jar", "agilefat.jar"]
