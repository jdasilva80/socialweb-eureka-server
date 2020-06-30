FROM openjdk:8
VOLUME /tmp
EXPOSE 8761
ADD ./target/socialweb-eureka-server-0.0.1-SNAPSHOT.jar socialweb-eureka-server.jar
ENTRYPOINT ["java","-jar","/socialweb-eureka-server.jar"]