# Java Spring
### Table of contents
- General info
- Technologies
- Setup
- Things learned
- Commands


------------

### General info

This repository contains files and explanations of things learned in the Platzi's Java Spring Course. The course taught about framwork spring, its different projects and how this tool helps to facilitate the creation of a project by writing less code. In this project,I use query methods to communicate with a database without having to create native queries and also did mapping to be able to easily change technologies in the future if required. In the files there is a project whose purpose is to be a shopping database in which we can interact by asking for, adding and deleting information. Security was also added to this project, so certain interactions require authentication. The project is divided into 3 layers, domain, persistence and web.

------------

### Technologies
- OpenJDK11 (requieres installation)
- IntelliJ IDEA (requieres installation)
- PostgreSQL
- SpringFramework

Dependencies:
- Spring Boot Starter Data JPA
- PostgreSQL JDBC Driver
- SpringFox Swagger2
- Springfox Swagger UI
- Spring Boot Starter Security
- JSON Web Token Support For The JVM

------------

### Setup

###### IntelliJ IDEA 
- Go to https://www.jetbrains.com/idea/download/ and download the Community version

###### OpenJDK
- Go to https://adoptopenjdk.net/ and download the following version:
    - OpenJDK 11

#####  PostgreSQL
- Go to https://www.enterprisedb.com/downloads/postgres-postgresql-downloads and click donwload PostgreSQL 11.12 for your OS.
- Complete installation process

#####  SpringFramework
- Go to https://start.spring.io/ and select Gradle project and then click the genetere button
- Decompress the downloaded folder
- Open Intellij IDEA and open the build.gradle file within the downloaded folder


**Within Intellij IDEA**

###### Spring Boot Starter Data JPA 
- Copy the next code and insert it into the build.graddle file in the dependencies part of the code.
-  `<!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
    <version>2.5.2</version>
</dependency>`


###### PostgreSQL JDBC Driver
- Copy the next code and insert it into the build.graddle file in the dependencies part of the code.
- `runtimeOnly 'org.postgresql:postgresql'`

###### SpringFox Swagger2
- Copy the next code and insert it into the build.graddle file in the dependencies part of the code.
- `implementation 'io.springfox:springfox-swagger2:2.9.2'`

###### SpringFox Swagger UI
- Copy the next code and insert it into the build.graddle file in the dependencies part of the code.
- `implementation 'io.springfox:springfox-swagger-ui:2.9.2''`

###### Spring Boot Starter Security
- Copy the next code and insert it into the build.graddle file in the dependencies part of the code.
- `implementation 'org.springframework.boot:spring-boot-starter-security:2.5.2'`

###### JSON Web Token Support For The JVM
- Copy the next code and insert it into the build.graddle file in the dependencies part of the code.
- `implementation 'io.jsonwebtoken:jjwt:0.9.1'`

------------
### Things learned
- What spring is.
- To use different app layers.
-  Spring annotations.
- To not use primitive type of data in Spring.
- To only create the required relationships between entities for better App performance.
- To save time using SpringData by performing databases operations without code.
- To use CrudRepository interface.
- Query methods.
- Data mapper pattern.
- Work with an existing table that is in another language using data mapper. 
- To inject dependencies.
- To make graphic documentatio for an API using Springfox Swagger.
- Make authentication required to certain API interactions.
- Manage certain level of security.



------------
### Commands
|  Command | Function  |
| ------------ | ------------ |
| @Springbootapplication | Tells Spring Boot that a class manages the app.   |
| @Entitiy | Tells a java class that it is representing a table in the database.   |
| @table  | Receives the name of the table to which our class is mapping.   |
| @column  | Used when the name of our column is different from the name of the attribute of our table.   |
| @id  | Represents the primary key of the table inside the class.  |
| @EmbededId  | Represents the primary key of the table inside the class when is a composite one.   |
| @GenerateValue  | Automatically generate values for the primary keys .   |
| @OneToMany @ManyToOne  | Represent existing relationships in tables but in classes.   |
| @Embeaddable   | Classes to embed other classes  |
| @Query    | Used to make native queries   |
| @Repository   | Tells the class that it interacts with the database |
| @Component   | Indicates that a class is a spring component  |
| @Mapper   |  Tells a class it is used to map  |
| @Mappings()   | Indicates how we want to do the mapping .  |
| @Mapping   | Indicates source and target to map if they have different names. It can also used to specify which elements don't need to be mapped.  |
| @InheritInverseConfiguration   | Indicates that the conversion we will perform is the inverse and we no longer have to define mappings.  |
| @Autowired   | Spring manages objects that we haven't initialized creating them by itself.  |
| @Service   | Indicates that a class is a business logic service.  |
| @RestController   | Tells spring that a class will be a controller of a rest API |
| @GetMapping    | To obtain information  |
| @Postmapping  | To save or update information  |
| @Deletemapping | To delete information |
| CrudRepository methods | save(), delete()|






