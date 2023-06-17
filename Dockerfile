FROM openjdk
EXPOSE 8080
ADD target/AreaCalculator.jar areaCalculator.jar
ENTRYPOINT ["java", "-jar", "/areaCalculator.jar"]