FROM java:8
VOLUME /tmp
COPY myuser-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c "touch /app.jar"
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar","> /log/app.log"]