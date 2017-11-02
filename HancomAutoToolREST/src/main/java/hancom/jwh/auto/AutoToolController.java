package hancom.jwh.auto;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hancom.jwh.domain.AutoToolVO;
import hancom.jwh.persistence.AutoToolDAO;

@RestController
@RequestMapping("/autotool")
public class AutoToolController {
	
	@Inject
	private AutoToolDAO dao;
	
	@GetMapping("")
	public List<AutoToolVO> getAutoTool(){
		//List<AutoToolVO> list = dao.getAutoTool();
		return dao.getAutoTool();
	}
}
