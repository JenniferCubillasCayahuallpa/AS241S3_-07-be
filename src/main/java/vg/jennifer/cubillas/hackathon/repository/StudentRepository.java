package vg.jennifer.cubillas.hackathon.repository;

import vg.jennifer.cubillas.hackathon.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByLocationId(Integer locationId);
    List<Student> findByStatus(String status);
    List<Student> findByProgramId(Integer programId);
}
