package com.webservice.axis2.server;
/*
 * 使用pojo发布 但是不能定义包名
 * 使用services.xml可以定义包名
 */
public class HelloServiceNew {
	
	 public String sayHelloNew(){  
	        return "hello";  
	    }             
	    public String sayHelloToPersonNew(String name){       
	        if(name==null){  
	            name = "nobody";  
	        }             
	        return "hello,"+name;  
	    }  
	    public void updateData(String data){  
	        System.out.println(data+" 已更新。");  
	    }  

}
