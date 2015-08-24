package com.webservice.jdk.wsimport.client;


/*
 *  客户端：在JDK的bin文件夹中，有一个wsimport.exe，这个工具依据wsdl文件生成相应的类文件，然后用这些类文件，就可以像调用本地的类一样调用WebService提供的方。该工具可以用于非Java的服务器，如：用C#编写的WebService，通过wsimport则生成Java的客户端实现。

　　在命令提示符中使用如下命令：wsimport  -d . -keep -p com.webservice.jdk.wsimport.client http://localhost:8080/axis2/services/HelloService?wsdl
　　命令参数说明：
　　-d:生成客户端执行类的class文件的存放目录
　　-s:生成客户端执行类的源文件的存放目录
　　-p:定义生成类的包名
　　其他命令参数请参照：http://download-llnw.oracle.com/javase/6/docs/technotes/tools/share/wsimport.html
 */
public class WSImportClient {
	
	public static void main(String[] args) {
		HelloService service = new HelloService();
		HelloServicePortType port=  service.getPort(HelloServicePortType.class);
		System.out.println(port.sayHelloToPersion("美女"));
	}

}
