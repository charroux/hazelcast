# hazelcast

## Use Docker compose

will start Hazelcast and a rest web service in front of Hazelcast:

gradlew build or ./gradlew build (on Linux)

creates an executable jar file for the rest web service

docker-compose up --build

build is used to force the creation of a new image for the rest web service.

Test the rest web service in a web browser: 

http://localhost:8080/city/paris

http://localhost:8080/city

## Alternative to Docker Compose

Start Hazelcast: 

docker run --name hazelcastcaching -p 5701:5701 hazelcast/hazelcast:3.11.1

Build the rest web service:

gradlew build or ./gradlew build (on Linux)

Create the Docker image (cqrs as the image name):

docker build -t caching .

with this Docker image: https://github.com/charroux/hazelcast/blob/master/Dockerfile

docker run --link hazelcastcaching:hazelcast -p 8080:8181 caching

Test the app with: 

http://localhost:8080/city/paris

http://localhost:8080/city

## Tools for stopping and removing running containers

docker container ps

docker container stop containerID

docker container rm containerID
