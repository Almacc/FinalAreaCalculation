FROM openjdk
EXPOSE 8080
ADD target/AreaCalculator.jar AreaCalculator.jar
ENTRYPOINT ["java", "-jar", "/AreaCalculator.jar"]