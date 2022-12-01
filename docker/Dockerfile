FROM docker.io/adoptopenjdk/openjdk11:alpine-jre

WORKDIR /app
COPY ./backend/build/libs/backend-*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-Xmx1024M","-Xms1024M","-Dspring.profiles.active=prod","-jar","app.jar"]