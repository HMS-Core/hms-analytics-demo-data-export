# HMS Analytics Data Export Demo

[![hms](https://img.shields.io/badge/hms-analytics-brightgreen)](https://developer.huawei.com/consumer/en/doc/development/HMS-References/3021004) 

English | [中文](https://github.com/HMS-Core/hms-analytics-demo-data-export/blob/master/README_ZH.md)

## Table of Contents

 * [Introduction](#introduction)
 * [Installation](#installation)
 * [Configuration ](#configuration )
 * [Supported Environments](#supported-environments)
 * [Sample Code](#sample-code)
 * [License](#license)
 
 
## Introduction
The sample code introduces a demo for creating a service to get result of API for exporting data. 
It provides a main class CallbackFunction to perofrm the process.
The sample code is a java web project based on springboot launched by class DemoApplication.  

## Installation
Before using sample code, check whether the JDK environment and Maven environment have been installed. 
Decompress the sample code package called HAClientExample.
        
Open the project with tools with IDEA and configure the settings of Maven environment for sample code to download packages of references.

## Configuration 
To use the demo, you need to set related parameters in application.properties.
    
spring.application.name: the name of the service.
server.port: the port to lanuch the service.

## Supported Environments
JDK 1.8 or a later version is recommended.
Maven 3.6 or a later version is recommended.

## Sample Code
Export_Data_Callback_CodeLab is a demo to introduce how to create a callback interface for exporting data.
The following describes methods in the demo.
    
DemoApplication.java: the entry class for perofrming the demo.
CallbackFunction.java: the main class to process the result of exporting data.

## Question or issues
If you want to evaluate more about HMS Core,
[r/HMSCore on Reddit](https://www.reddit.com/r/HuaweiDevelopers/) is for you to keep up with latest news about HMS Core, and to exchange insights with other developers.

If you have questions about how to use HMS samples, try the following options:
- [Stack Overflow](https://stackoverflow.com/questions/tagged/huawei-mobile-services) is the best place for any programming questions. Be sure to tag your question with 
`huawei-mobile-services`.
- [Huawei Developer Forum](https://forums.developer.huawei.com/forumPortal/en/home?fid=0101187876626530001) HMS Core Module is great for general questions, or seeking recommendations and opinions.

If you run into a bug in our samples, please submit an [issue](https://github.com/HMS-Core/hms-analytics-demo-data-export/issues) to the Repository. Even better you can submit a [Pull Request](https://github.com/HMS-Core/hms-analytics-demo-data-export/pulls) with a fix.

##  License
HMS Analytics kit Data Export Demo is licensed under the [Apache License, version 2.0](http://www.apache.org/licenses/LICENSE-2.0).
