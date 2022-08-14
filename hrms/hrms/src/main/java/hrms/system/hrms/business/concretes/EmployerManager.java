package hrms.system.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.system.hrms.business.abstracts.EmployerService;
import hrms.system.hrms.dataAccess.abstratcs.EmployerDao;
import hrms.system.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{

	EmployerDao dao;
	
	@Autowired
	public EmployerManager(EmployerDao dao) {
		this.dao=dao;
	}
	
	@Override
	public List<Employer> getAll() {
		
		return this.dao.findAll();
	}

}
