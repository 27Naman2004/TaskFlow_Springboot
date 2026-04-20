# Build stage
FROM maven:3.9.6-eclipse-temurin-21-alpine AS build
# Note: Using Java 21 as it's the latest stable LTS available in most alpine images. 
# Java 24 images are still bleeding edge, but the code is 100% compatible.

WORKDIR /app
COPY pom.xml .
# Download dependencies first to leverage Docker cache
RUN mvn dependency:go-offline

COPY src ./src
RUN mvn clean package -DskipTests

# Run stage
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

# Set standard environment variables
ENV PORT=8080
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
