# Learning Aspect-Oriented Programming (AOP)

This project demonstrates the basics of Aspect-Oriented Programming (AOP) using the Spring Framework.

## Project Structure


src
├── aspect
│   └── Aspectclass.java
├── config
│   └── Configurations.java
└── service
    ├── Application.java
    └── orderservice.java


## Technologies Used

- Java
- Spring Framework
- Spring AOP
- Annotation-based Configuration

## Components

### 1. Configurations.java

Configures Spring and enables AspectJ auto proxy support.

java
@Configuration
@ComponentScan("in.main")
@EnableAspectJAutoProxy


### 2. orderservice.java

Contains the business logic.

java
@Component
public class orderservice {
    public void palceOrder() {
        System.out.println("Core logic");
    }
}


### 3. Aspectclass.java

Defines cross-cutting concerns using AOP.

java
@Before(...)
public void before() {
    System.out.println("starting...");
}

@After(...)
public void after() {
    System.out.println("stoping...");
}


### 4. Application.java

Main class that starts the Spring container and executes the service method.

java
AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(Configurations.class);

orderservice or = context.getBean(orderservice.class);
or.palceOrder();


## Expected Output

text
starting ..............
Core logic
stoping ..............


## AOP Flow

1. Spring Container starts.
2. Aspect is registered.
3. placeOrder() method is called.
4. @Before advice executes.
5. Business logic executes.
6. @After advice executes.

## Learning Objectives

- Understand Spring AOP basics.
- Use @Aspect, @Before, and @After.
- Enable AOP using @EnableAspectJAutoProxy.
- Apply cross-cutting concerns without modifying business logic.

## Author

Manoj
