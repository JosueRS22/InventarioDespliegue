#Etapa 1 Build con Gradle
FROM gradle:8.10-jdk17 AS build
WORKDIR /app
COPY . .

# RUN sed -i 's/\r$//' gradlew && chmod +x gradlew
RUN chmod +x gradlew
RUN ./gradlew build -x test --no-daemon

#Etapa 2 Imagen ligera de runtime
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

#Copiamos el JAR generado en la etapa de build
COPY --from=build /app/build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]