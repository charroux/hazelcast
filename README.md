# hazelcast

docker run hazelcast/hazelcast:3.11.1

Members {size:1, ver:1} [
        Member [<host_ip>]:5701 - 798ee578-f1a9-452b-b1d6-c32e8a2ef1b7 this
]

get the container ID adress: <host_ip> and use it: 

docker run --name hazelcastcaching -e JAVA_OPTS="-Dhazelcast.local.publicAddress=<host_ip>:5701" -p 5701:5701 hazelcast/hazelcast:3.11.1

docker run --link hazelcastcaching:hazelcast -p 8080:8181 caching

http://localhost:8080/city/paris

docker container ps

docker container stop containerID

docker container rm containerID
