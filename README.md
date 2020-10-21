#Maxwell-Daemon-Consumers

### How to run the code 
goto the project root directory and execute the below command

*mvn clean spring-boot:run*

This project needs Kafka and Mongodb. It will consume a message and from Kafka and dump in mongodb. You can set the ip address and port in application.properties. 
Also, the project needs a kafka queue *maxwell-events*

For the complete flow refer to 