package spring.jwh.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Profiler {
	
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
		String sigString = joinPoint.getSignature().toShortString();
		System.out.println("시작 : "+sigString);
		long start = System.currentTimeMillis();
		try {
			Object result = joinPoint.proceed();
			return result;
		} finally {
			long end = System.currentTimeMillis();
			System.out.println("종료 : " + sigString);
			System.out.println("실행시간 : " + (end-start)+"ms");
		}
		
		
	}
}
