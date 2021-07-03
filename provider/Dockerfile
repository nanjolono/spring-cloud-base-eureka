FROM nanjolono/baseenvjdk8:0.1
VOLUME /tmp
ADD target/provider-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/app.jar"]