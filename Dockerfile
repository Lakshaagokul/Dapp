FROM eclipse-temurin:17
COPY target/dapp-0.0.1-SNAPSHOT.jar dapp-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","dapp-0.0.1-SNAPSHOT.jar"]