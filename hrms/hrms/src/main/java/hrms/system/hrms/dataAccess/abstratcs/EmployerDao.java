package hrms.system.hrms.dataAccess.abstratcs;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.system.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{

}
