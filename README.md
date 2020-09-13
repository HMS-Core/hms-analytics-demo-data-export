## Export_Data_Callback_CodeLab


## Table of Contents

 * [Introduction](#introduction)
 * [Installation](#installation)
 * [Configuration ](#configuration )
 * [Supported Environments](#supported-environments)
 * [Sample Code](# Sample Code)
 * [License](#license)
 
 
## Introduction
    The sample code introduces a demo for creating a service to get result of API for exporting data. 
    It provides a main class CallbackFunction to perofrm the process.
    The sample code is a java web project based on springboot launched by class DemoApplication.  

## Installation
    Before using sample code, check whether the JDK environment and Maven environment have been installed. 
    Decompress the sample code package called HAClientExample.
        
    Open the project with tools with IDEA and configure the settings of Maven environment for sample code to download packages of references.
    
## Supported Environments
    JDK 1.8 or a later version is recommended.
    Maven 3.6 or a later version is recommended.
	
## Configuration 
    To use the demo, you need to set related parameters in application.properties.
    
    spring.application.name: the name of the service.
    server.port: the port to lanuch the service.
	
## Sample Code
    Export_Data_Callback_CodeLab is a demo to introduce how to create a callback interface for exporting data.
    The following describes methods in the demo.
    
    DemoApplication.java: the entry class for perofrming the demo.
    CallbackFunction.java: the main class to process the result of exporting data.

##  License
    Export_Data_Callback_CodeLab is licensed under the [Apache License, version 2.0](http://www.apache.org/licenses/LICENSE-2.0).

