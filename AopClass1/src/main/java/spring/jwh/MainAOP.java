package spring.jwh;

import org.springframework.context.support.GenericXmlApplicationContext;

import spring.jwh.aop.Profiler;
import spring.jwh.some.SomeClass;
import spring.ch06.board.*;

public class MainAOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:aopConfig.xml");
		
		
		WriteArticleService writer = ctx.getBean("writer",WriteArticleService.class);
		
		writer.write(new NewArticleRequest("jwh","titled입니다.","내용입니다"));
		
		ReadArticleService reader = ctx.getBean("reader",ReadArticleService.class);
		reader.read(1);
		reader.read(1);
		
//		SomeClass some = ctx.getBean("someClass", SomeClass.class);
//		
//		some.printHello();
		ctx.close();
				
	}

}
