FROM java:8
VOLUME /tmp
COPY target/myuser-0.0.1-SNAPSHOT.jar myuser.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/myuser.jar"]