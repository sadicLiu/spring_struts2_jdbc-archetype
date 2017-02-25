# spring 整合 struts2 的项目骨架

## 说明

- 这是一个用IntelliJ搭建的Maven多模块项目骨架
- `webmodule`是存放领域对象的子模块
- `webdao`是存放Dao层的子模块
- `webservice`是存放Service层的子模块
- `webapp`是存放View层的子模块

## web-model

- 其中存放领域对象

## web-dao

- 直接依赖web-model子模块
- 采用Spirng整合Jdbc的方式实现，如果要用hibernate或mybatis需要配置并替换实现
- 采用HikariCP作为数据库连接池

## web-service

- 直接依赖web-dao子模块
- spring的事务加在了这层的配置文件中，需要导入dao层的配置文件

## web-app

- 直接依赖web-service子模块
- struts2的配置文件放在了这层
- spring总的配置文件也在这层，需要把service层的配置文件导入

## 单元测试

- 每层的单元测试都是用sping-test写的
- 如果要用spring-test，spring的配置文件必须分开写，因为测试时需要指定配置文件的位置
