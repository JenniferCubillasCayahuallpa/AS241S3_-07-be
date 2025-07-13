package vg.jennifer.cubillas.hackathon.service;

import vg.jennifer.cubillas.hackathon.model.Student;
import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> findAll();

    List<Student> findByStatus(String status);

    Optional<Student> findById(Long id);

    Student save(Student student);

    Student update(Student student);

    Student delete(Long id);

    Student restore(Long id);
    
    List<Student> findByProgramId(Integer programId);
}