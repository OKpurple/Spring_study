package org.jwh.blackdev;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//현재테스트코드 실행시 스프링이 로딩되게 함
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MybatisTest {

	@Inject
	private SqlSessionFactory sqlFactory;
	
	@Test
	public void testFactory() throws Exception{
		System.out.println("sqlFactory :"+sqlFactory);
	}
	
	@Test
	public void testSession() throws Exception{
		try(SqlSession session = sqlFactory.openSession()){
			System.out.println(session);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
