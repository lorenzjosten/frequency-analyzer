FROM docker.io/adoptopenjdk/openjdk11:alpine-jre

WORKDIR /app
COPY ./backend/build/libs/backend-[0-9].[0-9].jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-Xmx1024M","-Xms1024M","-Dspring.profiles.active=prod","-Dlogging.file.name=","-jar","app.jar"]