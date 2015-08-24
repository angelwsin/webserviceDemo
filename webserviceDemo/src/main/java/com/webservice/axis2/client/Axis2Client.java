package com.webservice.axis2.client;

import javax.xml.namespace.QName;

import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

/*
 * axis2 调用service
 */
public class Axis2Client {
	
	public static void main(String[] args) throws Exception{
	//  使用RPC方式调用WebService          
	    RPCServiceClient serviceClient = new RPCServiceClient();  
	    Options options = serviceClient.getOptions();  
	    //  指定调用WebService的URL  
	    EndpointReference targetEPR = new EndpointReference(  
	            "http://localhost:8080/axis2/services/HelloService");  
	    options.setTo(targetEPR);  
	    //  指定sayHelloToPerson方法的参数值  
	    Object[] opAddEntryArgs = new Object[] {"美女"};  
	    //  指定sayHelloToPerson方法返回值的数据类型的Class对象  
	    Class<?>[] classes = new Class[] {String.class};  
	    //  指定要调用的sayHelloToPerson方法及WSDL文件的命名空间  
	    /*
	     * 在创建QName对象时，QName类的构造方法的第一个参数表示WSDL文件的命名空间名，
                   也就是<wsdl:definitions>元素的targetNamespace属性值。
	     */
	    QName opAddEntry = new QName("http://ws.apache.org/axis2", "sayHelloToPersion");  
	    //  调用sayHelloToPerson方法并输出该方法的返回值  
	    System.out.println(serviceClient.invokeBlocking(opAddEntry, opAddEntryArgs, classes)[0]);
	}

}
