# springbootLearn
本项目是作者学习SpringBoot的项目
# 环境准备
SpringBootb版本：2.3.3.RELEASE
```shell script
java -version
java version "1.8.0_251"
Java(TM) SE Runtime Environment (build 1.8.0_251-b08)
Java HotSpot(TM) 64-Bit Server VM (build 25.251-b08, mixed mode)

mvn -v
Apache Maven 3.5.2 (138edd61fd100ec658bfa2d307c43b76940a5d7d; 2017-10-18T15:58:13+08:00)
Maven home: D:\developer\apache-maven-3.5.2\bin\..
Java version: 1.8.0_251, vendor: Oracle Corporation
Java home: D:\developer\JAVA8\jre-8u251
Default locale: zh_CN, platform encoding: GBK
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```
# Hello World
添加pom文件
```shell script
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.fgrapp</groupId>
    <artifactId>springBootLearn</artifactId>
    <version>0.0.1-SNAPSHOT</version>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.3.3.RELEASE</version>
    </parent>

    <!-- Additional lines to be added here... -->
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
    </dependencies>
</project>
```
添加启动类MainApplication
```java
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }
}
```
添加测试接口HelloController
```java
@RestController
public class HelloController {
    @RequestMapping("hello")
    public String hello(){
        return "Hello World";
    }
}
```
启动项目，访问local host:8080/hello
