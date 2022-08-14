package hrms.system.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.system.hrms.business.abstracts.JobPositionService;
import hrms.system.hrms.dataAccess.abstratcs.JobPositionDao;
import hrms.system.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{

	private JobPositionDao dao;
	
	@Autowired
	public JobPositionManager(JobPositionDao dao) {
		super();
		this.dao=dao;
	}
	
	@Override
	public List<JobPosition> getAll() {
		return this.dao.findAll();
	}

}
