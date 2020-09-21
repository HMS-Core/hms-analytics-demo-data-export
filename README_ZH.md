## 华为分析服务数据导出样例

## 目录

 * [简介](#简介)
 * [安装](#安装)
 * [配置 ](#配置 )
 * [环境要求](#环境要求)
 * [示例代码](#示例代码)
 * [授权许可](#授权许可)
 
## 简介
    样例介绍如何创建服务获取端口的数据导出结果。
    示例代码中主类CallbackFunction用于执行该过程。
    本示例代码为基于springboot、由DemoApplication类启动的java web工程。

## 安装
    执行示例代码前，请确认JDK环境、Maven环境已安装。
    解压HAClientExample示例代码包。
    使用IDEA工具打开工程，配置Maven环境，下载参考包。

## 配置 
    使用本样例前在application.properties中设置相关参数。  
    spring.application.name：服务名。
    server.port：启动服务的端口。
   
## 环境要求
    JDK环境建议使用1.8及以上版本。
    Maven环境建议使用3.6及以上版本。
	
## 示例代码
    样例Export_Data_Callback_CodeLab介绍如何创建导出数据的回调接口。
    其中使用的方法如下：
    
    DemoApplication.java：执行样例的入口类。
    CallbackFunction.java：处理数据导出结果的主类。

##  授权许可
    华为分析服务数据导出样例经过[Apache License, version 2.0](http://www.apache.org/licenses/LICENSE-2.0)授权许可。

