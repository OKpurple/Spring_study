package hancom.jwh.auto;

import java.util.List;

import javax.inject.Inject;

import hancom.jwh.domain.StaffVO;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hancom.jwh.domain.StaffVO;
import hancom.jwh.persistence.StaffDAO;

@RestController
@RequestMapping("/staff")
public class StaffController {
	
	@Inject
	private StaffDAO dao;
	
	@GetMapping("")
	public ResponseEntity<List<StaffVO>> getStaff(){
		List<StaffVO> list = dao.getStaff();
		return new ResponseEntity<List<StaffVO>>(list,HttpStatus.OK);
	}
}
