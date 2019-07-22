FROM maven:3.6.1-jdk-8
WORKDIR /app
COPY . .
RUN mvn install
RUN mvn package
CMD ["mvn", "spring-boot:run"]