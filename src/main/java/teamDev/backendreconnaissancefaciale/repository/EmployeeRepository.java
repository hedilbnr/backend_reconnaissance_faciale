package teamDev.backendreconnaissancefaciale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import teamDev.backendreconnaissancefaciale.model.Employee;
@Repository

public interface EmployeeRepository extends JpaRepository <Employee, Long> {
}
