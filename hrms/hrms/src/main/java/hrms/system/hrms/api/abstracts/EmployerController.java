package hrms.system.hrms.api.abstracts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.system.hrms.business.abstracts.EmployerService;
import hrms.system.hrms.entities.concretes.Employer;

@RestController
public class EmployerController {
	private EmployerService service;
	
	@Autowired
	public EmployerController(EmployerService service) {
		this.service=service;
	}
	
	@GetMapping("/api/employer/list")
	public List<Employer> getEmployerList(){
		return service.getAll();
	}
}
