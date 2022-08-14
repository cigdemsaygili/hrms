package hrms.system.hrms.business.abstracts;

import java.util.List;

import hrms.system.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	 List<JobSeeker> getAll();
}
