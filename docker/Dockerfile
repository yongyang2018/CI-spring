FROM openjdk:11.0.9.1-jre-buster

RUN mkdir /app
WORKDIR /app

ADD build/*.jar /app/app.jar

ENTRYPOINT java -jar ./app.jar

EXPOSE 8080