FROM openjdk:8-jdk-alpine

RUN apk add --no-cache bash \
                       nano \
                       curl \
                       tzdata
ENV TZ=Europe/Rome
ADD target/*.jar test-jenkins.jar

ARG CONFIG_FILE='test-jenkins-cfg/application-dev.yaml'
ENV CONFIG_FILE=${CONFIG_FILE}

EXPOSE 8880

ENTRYPOINT ["java","-Xms64m","-Xmx64m","-Djava.security.egd=file:/dev/./urandom","-jar","-Dspring.profiles.active=dev","/test-jenkins.jar","--spring.config.location=${CONFIG_FILE}"]