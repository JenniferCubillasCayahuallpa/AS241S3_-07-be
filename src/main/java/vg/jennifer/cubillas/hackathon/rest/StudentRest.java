package vg.jennifer.cubillas.hackathon.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import lombok.extern.slf4j.Slf4j;
import vg.jennifer.cubillas.hackathon.model.Student;
import vg.jennifer.cubillas.hackathon.service.StudentService;

import java.util.List;

@RequestScope
@Slf4j
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/api/student")
public class StudentRest {

    private final StudentService studentService;

    @Autowired
    public StudentRest(StudentService studentService) {
        this.studentService = studentService;
    }

    // Obtener todos los estudiantes
    @GetMapping
    public ResponseEntity<List<Student>> findAll() {
        try {
            List<Student> students = studentService.findAll();
            return ResponseEntity.ok(students);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body(null);
        }
    }

    // Obtener estudiantes por estado (A=activo, I=inactivo)
    @GetMapping("/status/active")
    public ResponseEntity<List<Student>> findByStatusActive() {
        return studentService.findByStatus("A")
    }

    @GetMapping("/status/inactive")
    public ResponseEntity<List<Student>> findByStatusInactive() {
        return studentService.findByStatus("I")
    }
    

    // Obtener estudiante por ID
    @GetMapping("/{id}")
    public ResponseEntity<Student> findById(@PathVariable Long id) {
        return studentService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Crear un nuevo estudiante
    @PostMapping("/save")
    public ResponseEntity<Student> save(@RequestBody Student student) {
        try {
            Student saved = studentService.save(student);
            return ResponseEntity.ok(saved);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).build();
        }
    }

    // Actualizar un estudiante existente
    @PutMapping("/update/{id}")
    public ResponseEntity<Student> update(@PathVariable Long id, @RequestBody Student student) {
        if (!studentService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        try {
            student.setId(id);
            Student updated = studentService.update(student);
            return ResponseEntity.ok(updated);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).build();
        }
    }

    // Eliminación lógica (cambiar estado a 'I')
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Student> delete(@PathVariable Long id) {
        if (!studentService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        try {
            Student deleted = studentService.delete(id);
            return ResponseEntity.ok(deleted);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).build();
        }
    }

    // Restaurar estudiante (cambiar estado a 'A')
    @PatchMapping("/restore/{id}")
    public ResponseEntity<Student> restore(@PathVariable Long id) {
        if (!studentService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        try {
            Student restored = studentService.restore(id);
            return ResponseEntity.ok(restored);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).build();
        }
    }
}
