FROM hub.c.163.com/housan993/centos7_jdk8:8.0
VOLUME /tmp
ADD target/authentication-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 9001
ENTRYPOINT ["java","-jar","/app.jar"]