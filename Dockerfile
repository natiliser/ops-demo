FROM eclipse-temurin:11-jre
COPY target/ops-demo*.jar /usr/src/ops-demo.jar
COPY src/main/resources/application.properties /opt/conf/application.properties
CMD ["java", "-jar", "/usr/src/ops-demo.jar", "--spring.config.location=file:/opt/conf/application.properties"]