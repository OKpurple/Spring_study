package org.jwh.blackdev;

import java.util.List;

import javax.inject.Inject;

import org.jwh.domain.ContentVO;
import org.jwh.persistence.ContentDAO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/list")
public class RestSampleController {

	@Inject 
	ContentDAO dao;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<ContentVO>> read(){
		List<ContentVO> list = dao.listAll();
		return new ResponseEntity<List<ContentVO>>(list,HttpStatus.OK);
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<String> create(@RequestBody ContentVO vo){
		dao.create(vo);
		return new ResponseEntity<String>("SUCCESS",HttpStatus.OK);
	}
}
