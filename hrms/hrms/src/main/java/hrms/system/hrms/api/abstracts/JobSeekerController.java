package hrms.system.hrms.api.abstracts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.system.hrms.business.abstracts.JobSeekerService;
import hrms.system.hrms.entities.concretes.JobSeeker;

@RestController
public class JobSeekerController {

	JobSeekerService service;
	
	@Autowired
	public JobSeekerController(JobSeekerService jobSeekerService) {
		this.service=jobSeekerService;
	}
	
	@GetMapping("/api/jobseeker/list")
	public List<JobSeeker> getListOfJobSeekers(){
		return service.getAll();
	}
	
}
