# Java Spring
### Table of contents
- [General info](#general-info)
- [Technologies](#technologies)
- [Setup](#setup)
- [Things learned](#things-learned)
>- Spring.
>- Benefits of using spring.
>- Spring annotations.
>- MVC design.
>- Query methods.
>- Graphic documentation.
>- Data mapper.
>- Dependency injection.
- [Spring Annotations](#spring-annotations)


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

###### Dependencies
- Copy the next code and insert it into the build.graddle file in the dependencies part of the code.

```java
<!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
    <version>2.5.2</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.postgresql/postgresql -->
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.2.23</version>
</dependency>

<!-- https://mvnrepository.com/artifact/io.springfox/springfox-swagger2 -->
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.9.2</version>
</dependency>

<!-- https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui -->
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.9.2</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-security -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
    <version>2.5.2</version>
</dependency>

<!-- https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt -->
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt</artifactId>
    <version>0.9.1</version>
</dependency>
```

------------
### Things learned
- What spring is. Its an application framework and inversion of control container for the Java platform. The frameworks core features can be used by any Java application, but there are extensions for building web applications on top of the Java EE platform.

- Advantages of using spring: 
>- Develop enterprise-class applications using POJOs.
>- Testing an application written with Spring is simple because environment-dependent code is moved into this framework. 
>- MVC framework.
> Consistent transaction management interface that can scale down to a local transaction (using a single database) and scale up to global transactions.

- To use different app layers according to MVC pattern. MVC = model, view, controller.
>- Model - It directly manages the data, logic and rules of the application.
>- View - Any representation of information such as a chart, diagram or table.
>- Controller - Accepts input and converts it to commands for the model or view.

- Spring annotations. More details below in the annotations section.

- To not use primitive type of data in Spring. For example, instead of int use Integer.

- To only create the required relationships between entities for better App performance. It is not necessary to create all the relationships, only those that are goning to be actually used.

- To save time using SpringData by performing databases operations without code. Query methods.

- To use CrudRepository interface. It is an interface that provides CRUD methods, like save. 

- Query methods are methods that find information from the database and are declared on the repository interface. Example **findByDateOrderByNameDesc**. It is very importatnt to use correctly camelcase.

- Data mapper pattern. A layer of Mappers that moves data between objects and a database while keeping them independent of each other and the mapper itself. Mapper means an object that sets up communication between two independent object. An example:
```java
@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "category"),
            @Mapping(source = "estado", target = "active")
    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Categoria toCategoria(Category category);

}
```

- Work with an existing table that is in another language using data mapper. 

- To inject dependencies. Dependency Injection is merely one concrete example of Inversion of Control. When writing a complex Java application, application classes should be as independent as possible.  Dependency Injection helps in gluing these classes together and at the same time keeping them independent. For example, class A is dependent of class B. Class B will get injected into class A by the IoC.

- To make graphic documentation for an API using Springfox Swagger.

- Make authentication required to certain API interactions.

- Manage certain level of security.



------------
### Spring Annotations
|  Annotations | Function  |
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
| Not an annotation - CrudRepository methods | save(), delete()|






