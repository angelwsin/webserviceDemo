
/*
 * axis2 pojo发布  特别注意使用pojo发布 不能有包名
 */
public class HelloService {
	 public String sayHello(){
		 return "hello";
	 }
	 
	 public String sayHelloToPersion(String name){
		 if(name==null){  
	            name = "nobody";  
	        }  
	        return "hello,"+name;
	 }

}
