FROM openjdk:17
ADD ./airquality_sobral.jar airquality_sobral.jar
LABEL authors="jeffs"
ENTRYPOINT ["java", "-jar", "airquality_sobral.jar"]