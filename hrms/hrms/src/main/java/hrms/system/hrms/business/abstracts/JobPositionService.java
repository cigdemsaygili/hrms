package hrms.system.hrms.business.abstracts;
import java.util.List;

import hrms.system.hrms.entities.concretes.JobPosition;


public interface JobPositionService {
	List<JobPosition> getAll();
}