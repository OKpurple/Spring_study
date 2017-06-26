package org.jwh.blackdev;

import java.util.List;

import javax.inject.Inject;

import org.jwh.domain.ContentVO;
import org.jwh.persistence.ContentDAO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestSampleController {

	@Inject 
	ContentDAO dao;
	
	@RequestMapping("/hello")
	public List<ContentVO> sayHello(){
		//List<ContentVO> list = dao.listAll();
		return dao.listAll();
	}
}
