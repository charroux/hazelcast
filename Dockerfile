FROM openjdk:8
VOLUME /tmp
ADD build/libs/caching-0.0.1-SNAPSHOT.jar caching-0.0.1-SNAPSHOT.jar
EXPOSE 8181
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/caching-0.0.1-SNAPSHOT.jar"]
