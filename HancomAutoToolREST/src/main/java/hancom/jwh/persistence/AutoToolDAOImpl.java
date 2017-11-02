package hancom.jwh.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import hancom.jwh.domain.AutoToolVO;

@Repository
public class AutoToolDAOImpl implements AutoToolDAO {
	
	@Inject
	 private SqlSession session;
	 private static String namespace = "hancom.jwh.mappers.testMapper";
	
	@Override
	public List<AutoToolVO> getAutoTool(){
		return session.selectList(namespace+".autoToolList");
	}

}
