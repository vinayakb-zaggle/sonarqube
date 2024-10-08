# the first stage of our build will use a maven 3.6.1 parent image
FROM maven:3.8.3-openjdk-17 AS MAVEN_BUILD

# copy the pom and src code to the container
COPY ./ ./

# package our application code
RUN mvn clean package -DskipTests

# the second stage of our build will use open jdk 11
FROM --platform=linux/amd64  openjdk:17 AS build

# copy only the artifacts we need from the first stage and discard the rest
COPY --from=MAVEN_BUILD ./target/sonarqube-0.0.${revision}-SNAPSHOT.jar /app.jar

# set the startup command to execute the jar
CMD ["java", "-jar", "/app.jar"]