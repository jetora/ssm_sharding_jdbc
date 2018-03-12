Maven的多模块 Spring MVC + Spring + Mybatis 项目的搭建
```
##项目目录  
ssm_multi_modules
├── ssm-common -- 公共模块，主要存放一些工具类
|    ├── src
|    ├── pom.xml -- 打包方式：jar
├── ssm-dao -- 存放mybatis相关的mapper接口
|    ├── src
|    ├── pom.xml -- 打包方式：jar
├── ssm-pojo -- 存放实体类
|    ├── src
|    ├── pom.xml -- 打包方式：jar
├── ssm-service -- 存放业务逻辑类
|    ├── src
|    ├── pom.xml -- 打包方式：jar
├── ssm-web -- 存放前台页面，客户端交互相关的controller
|    ├── src
|    ├── pom.xml -- 打包方式：war
├── pom.xml --打包方式为pom，一些公用的依赖

##各模块的依赖关系  
                    ssm_multi_modules   
                         |  
   ---------------------------------------------------------  
  |	            |               |           |           |  
ssm-dao     ssm-service     ssm-web     ssm-common      ssm-pojo  
  |依赖           |依赖         |依赖  
  \/             \/            \/   
ssm-pojo        ssm-dao     ssm-service  				
	
##SSM框架的整合 
开发环境是：  
    IntelliJ IDEA 2017.3.4  
    JDK 1.8.0_162  
    Tomcat 7  
    Maven 3.5.3  
    MySQL 5.7.21  
三大框架版本：  
    Spring 5.0.4.RELEASE  
    Spring MVC 5.0.4.RELEASE  
    MyBatis 3.4.5  
核心配置文件：  
文件名                     所属目录                            描述  
mybatis-config.xml  ssm-web/src/main/resources/spring   mybatis分页插件pagehelper配置文件  
spring-mvc.xml	    ssm-web/src/main/resources/spring   配置spring mvc，比如配置视图解析器、文件上传、spring mvc 注解等等。  
spring-mybatis.xml  ssm-web/src/main/resources/spring   spring与mybatis的整合文件，数据源、自动扫描、事务管理等都是在这里配置。  
xxxMapper.xml	    ssm-web/src/main/resources/mapper   通过mybatis-generator自动生成的mapper数据库映射文件。  
jdbc.properties	    ssm-web/src/main/resources/	        配置数据库连接信息  
log4j.properties    ssm-web/src/main/resources/         日志配置文件，方便调试bug，打印日志，需要配置此项  
```	

测试  
http://localhost:8080/ssm-demo/getUserById?userId=1  