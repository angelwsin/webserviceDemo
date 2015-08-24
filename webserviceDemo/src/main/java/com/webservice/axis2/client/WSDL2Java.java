package com.webservice.axis2.client;

/*
 * Axis2提供了一个wsdl2java.bat命令可以根据WSDL文件自动产生调用WebService的代码。
  wsdl2java.bat命令可以在<Axis2安装目录>/bin目录中找到。
  在使用wsdl2java.bat命令之前需要设置AXIS2_HOME环境变量，该变量值是<Axis2安装目录>。
  在Windows控制台输出如下的命令行来生成调用WebService的代码：
  %AXIS2_HOME%\bin\wsdl2java -uri http://localhost:8080/axis2/services/HelloService?wsdl -p com.webservice.axis2.client -s -o axis2java
  其中-url参数指定了wsdl文件的路径，可以是本地路径，也可以是网络路径。
  -p参数指定了生成的Java类的包名，-o参数指定了生成的一系列文件保存的根目录。
  在执行完上面的命令后，就会发现在当前目录下多了个stub目录，
  在stub/src/client目录可以找到一个HelloServiceStub.java文件，
 */
public class WSDL2Java {
	public static void main(String[] args) throws Exception{
		  HelloServiceStub client = new HelloServiceStub();
		  HelloServiceStub.SayHelloToPersion say=     new HelloServiceStub.SayHelloToPersion();	 
		    say.setName("美女");
		    System.out.println(client.sayHelloToPersion(say).get_return());
	}

}
