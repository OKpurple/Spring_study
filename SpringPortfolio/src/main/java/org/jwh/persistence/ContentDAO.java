package org.jwh.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.jwh.domain.ContentVO;
import org.springframework.stereotype.Repository;

@Repository
public class ContentDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "org.jwh.mapper.ContentMapper";
	
	public List<ContentVO> listAll(){
		System.out.println("dao start");
		return sqlSession.selectList(namespace+".listAll");
	}
}
