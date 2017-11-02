package hancom.jwh.persistence;
import java.util.List;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import hancom.jwh.domain.StaffVO;

@Repository
public class StaffDAOImpl implements StaffDAO {
	
	 @Inject
	 private SqlSession session;
	 private static String namespace = "hancom.jwh.mappers.testMapper";
	 
	@Override
	public List<StaffVO> getStaff(){
		System.out.println("staffdao start");
		return session.selectList(namespace+".staffList");
	}
}
