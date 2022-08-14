package hrms.system.hrms.business.abstracts;

import java.util.List;

import hrms.system.hrms.entities.concretes.Employer;

public interface EmployerService {
	List<Employer> getAll();
}
