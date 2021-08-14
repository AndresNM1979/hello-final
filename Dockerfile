# Build stage
FROM openjdk:11 AS base
WORKDIR /opt/hello-final
COPY ./ ./
RUN ./gradlew assemble

# Runtime stage
FROM amazoncorretto:11
WORKDIR /opt/hello-final
COPY --from=base /opt/hello-final/build/libs/hello-final-0.0.1-SNAPSHOT.jar ./
CMD java -jar hello-final-0.0.1-SNAPSHOT.jar
