package spring.jwh.aop;

import java.util.*;
import org.aspectj.lang.ProceedingJoinPoint;

import spring.ch06.board.Article;

public class ArticleCacheAdvice {
	private Map<Integer,Article> cache = new HashMap<Integer,Article>();
	
	public Object cache(ProceedingJoinPoint jp) throws Throwable{
		System.out.println("캐시 시도");
		Integer wid = (Integer) jp.getArgs()[0];
		Article article = cache.get(wid);
		if(article != null) {
			System.out.println("캐시 hit : "+wid);
			return article;
		}
		Article result = (Article) jp.proceed();
		if(result != null) {
			System.out.println("캐시 miss"+wid);
			cache.put(wid, result);
		} else {
			throw new NoSearchArticleException();
		}
		return result;
	}
}
