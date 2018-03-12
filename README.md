Maven的多模块 Spring MVC + Spring + Mybatis 项目的搭建

项目整体目录  
# 项目结构
## 项目目录
```
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
```
各模块的依赖关系  
```
						ssm_multi_modules   
								|  
   -------------------------------------------------------------  
  |					|				|			|				|  
ssm-dao			ssm-service		ssm-web		ssm-common		ssm-pojo  
  |依赖				|依赖			|依赖  
  \/				\/				\/   
ssm-pojo		ssm-dao			ssm-service  				
```				