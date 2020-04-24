FROM openjdk:13
VOLUME /tmp
EXPOSE 8004
ADD ./target/services-bankaforo255-pagos-0.0.1-SNAPSHOT.jar service-pagos.jar
ENTRYPOINT ["java", "-jar","/service-pagos.jar"]