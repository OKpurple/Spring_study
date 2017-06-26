package org.jwh.blackdev;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.jwh.domain.ContentVO;
import org.jwh.persistence.ContentDAO;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class ContentDAOTest {
@Inject ContentDAO dao;
@Test
public void testList()throws Exception{
	for (ContentVO v:dao.listAll()){
		System.out.println(v);
	}
	
}
}
