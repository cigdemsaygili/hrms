package hrms.system.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.system.hrms.business.abstracts.JobSeekerService;
import hrms.system.hrms.dataAccess.abstratcs.JobSeekerDao;
import hrms.system.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{
	private JobSeekerDao jobSeekerDao;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		this.jobSeekerDao=jobSeekerDao;
	}
	
	@Override
	public List<JobSeeker> getAll() {
		
		return this.jobSeekerDao.findAll();
	}

}
