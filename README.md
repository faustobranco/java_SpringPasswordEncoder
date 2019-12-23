# Java Password encoder using Spring Boot

[![Github All Releases](https://img.shields.io/github/downloads/faustobranco/java_WatchLogFile/total.svg)]()

Java example to how to code and verify passwords with Spring Boot, this is used for Spring Authenticator.

  ## Getting Started
  

The project, done in Java 8 using IntelliJ 2019.3 and Maven, simply shows examples of using BCryptPasswordEncoder passwords encode ** for reference only **:
Passwords are used, for example, to login using Spring Boot Authenticator.

### Maven:

        <dependencies>  
            <dependency> 
                <groupId>org.springframework.boot</groupId>  
                <artifactId>spring-boot-starter-security</artifactId>  
            </dependency> 
        </dependencies>
        <build>  
           <plugins> 
                <plugin> 
                    <groupId>org.apache.maven.plugins</groupId>  
                    <artifactId>maven-compiler-plugin</artifactId>  
                    <configuration> 
                        <source>1.8</source>  
                        <target>1.8</target>  
                    </configuration> 
                </plugin> 
            </plugins>
       </build>



## Authors

-   **Fausto Branco** - _Initial work_ - [Git faustobranco](https://github.com/faustobranco)
