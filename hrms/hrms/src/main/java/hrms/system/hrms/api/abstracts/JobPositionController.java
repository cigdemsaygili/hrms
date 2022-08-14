package hrms.system.hrms.api.abstracts;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.system.hrms.business.abstracts.JobPositionService;
import hrms.system.hrms.entities.concretes.JobPosition;


@RestController
public class JobPositionController {
	
	private JobPositionService jobPositionService;
	
	@Autowired
	public JobPositionController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	@GetMapping("/api/jobposition/list")
	public List<JobPosition> getAllJobPositions(){
		return this.jobPositionService.getAll();
	}
}
