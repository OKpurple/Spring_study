package chapter2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import conf.Config;


public class MainByXml {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:/conf/config2.xml");
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		AuthenticationService authSvc = ctx.getBean("authService", AuthenticationService.class);
		try{
			authSvc.authenticate("Jeoung", "1234");
		}catch(Exception e){
			System.out.println("error");
		}
		
		try{
			authSvc.authenticate("Jeoung", "1233");
		}catch(Exception e){
			System.out.println("error");
		}
		
		try{
			authSvc.authenticate("Jeoung", "1224");
		}catch(Exception e){
			System.out.println("error");
		}
		
		try{
			authSvc.authenticate("Jeoung", "1224");
		}catch(Exception e){
			System.out.println("error");
		}
	}
	
	
	


}
