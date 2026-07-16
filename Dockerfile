# Maven ile projeyi derleme 
FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package-DskipTests

# Sadece jar dosyasını alıp çalıştırma
FROM eclipse-temurin:17-jdk-alpine
COPY --from=build /target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "/app.jar"]

