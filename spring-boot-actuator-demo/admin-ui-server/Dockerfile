FROM openjdk:17
MAINTAINER zhangdd 2067949563@qq.com
WORKDIR /app
ARG JAR_FILE
ADD ${JAR_FILE} /app/app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]
