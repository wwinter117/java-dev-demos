FROM openjdk:17
MAINTAINER zhangdd 2067949563@qq.com
WORKDIR /app
ARG JAR_FILE
ADD ${JAR_FILE} /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
CMD ["spring.boot.admin.client.url=http://admin-ui-server:8081","--spring.boot.admin.client.instance.service-base-url=http://hello-world-application-client:8080"]
