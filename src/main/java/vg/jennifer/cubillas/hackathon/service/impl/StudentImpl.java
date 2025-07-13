package vg.jennifer.cubillas.hackathon.service.impl;

import vg.jennifer.cubillas.hackathon.model.Student;
import vg.jennifer.cubillas.hackathon.repository.StudentRepository;
import vg.jennifer.cubillas.hackathon.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class StudentImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        log.info("Listando todos los estudiantes");
        return studentRepository.findAll();
    }

    @Override
    public List<Student> findByStatus(String status) {
        log.info("Listando estudiantes por estado: {}", status);
        return studentRepository.findByStatus(status);
    }

    @Override
    public Optional<Student> findById(Long id) {
        log.info("Buscando estudiante por ID: {}", id);
        return studentRepository.findById(id);
    }

    @Override
    public Student save(Student student) {
        log.info("Guardando estudiante: {}", student);
        student.setStatus("A");
        return studentRepository.save(student);
    }

    @Override
    public Student update(Student student) {
        log.info("Actualizando estudiante: {}", student);
        return studentRepository.save(student);
    }

    @Override
    public Student delete(Long id) {
        log.info("Eliminando (lógicamente) estudiante con ID: {}", id);
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Estudiante no encontrado"));
        student.setStatus("I");
        return studentRepository.save(student);
    }

    @Override
    public Student restore(Long id) {
        log.info("Restaurando estudiante con ID: {}", id);
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Estudiante no encontrado"));
        student.setStatus("A");
        return studentRepository.save(student);
    }

    @Override
    public List<Student> findByProgramId(Integer programId) {
        log.info("Listando estudiantes por programa ID: {}", programId);
        return studentRepository.findByProgramId(programId);
    }
}
