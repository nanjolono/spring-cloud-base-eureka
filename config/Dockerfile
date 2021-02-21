FROM hub.c.163.com/housan993/centos7_jdk8:8.0
VOLUME /tmp
ADD target/configServer-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 9999
ENTRYPOINT ["java","-jar","/app.jar"]