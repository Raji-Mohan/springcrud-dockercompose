FROM java:8
VOLUME /tmp
EXPOSE 8080
ADD /build/libs/spring-people-1.0.jar spring-people-1.0.jar
ENTRYPOINT ["java","-jar","spring-people-1.0.jar"]