package hrms.system.hrms.dataAccess.abstratcs;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.system.hrms.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer>{

}
