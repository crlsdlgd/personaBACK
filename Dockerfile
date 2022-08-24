#Start with a base image containing java Runtime
FROM openjdk:8

#Make port available to the world outside this container 
EXPOSE 8080

ADD target/persona-back.jar persona-back.jar
# Run the jar file
ENTRYPOINT ["java","-jar","/persona-back.jar"]