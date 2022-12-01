# Work sample

This work sample consists of a reactive Spring Boot backend application with a vue.js frontend. It can be used to upload and play a mp3 media file. Also, the power spectrum of the current track is calculated and shown. The uploaded media file is saved into a file based h2 database in your local app folder. It can be deleted safely once the app has shut down. 

Used technologies include:

- reactive programming
- data streaming 
- server sent events
- spring boot
- kotlin
- vue.js 3
- typescript
- bootstrap5
- gitlab pipelining
- liquibase

## Prerequisites

In order to run this app, please ensure these programs are installed on your platform:

- git
- java
- gradle

Or 

- docker

## Execution

### Docker

Create a container from the image int the gitlab registry and run it:

```
docker run -d --rm --name frequency-analyzer -p8080:8080 registry.gitlab.com/lj-work-sample/app:latest
```

Wait until the app started up. Visit [http://localhost:8080](http://localhost:8080) with your browser.

Stop the container:

```shell
docker stop frequency-analyzer
```

### Gradle

Clone the app into a folder of your choice:

```shell
git clone --recursive https://gitlab.com/lj-work-sample/app
```

Change into the app folder: 

```shell
cd ./app
```

Make the gradle wrapper script executable:

```shell
chmod +x gradlew  
```

Run the app:

```shell
./gradlew
```

Wait until the app started up. Visit [http://localhost:8080](http://localhost:8080) with your browser.
