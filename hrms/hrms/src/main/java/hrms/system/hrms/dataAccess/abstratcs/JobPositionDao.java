package hrms.system.hrms.dataAccess.abstratcs;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.system.hrms.entities.concretes.JobPosition;


public interface JobPositionDao extends JpaRepository<JobPosition,Integer>{

}
