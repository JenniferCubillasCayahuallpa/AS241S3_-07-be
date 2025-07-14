package vg.jennifer.cubillas.hackathon.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long id;

    @Column(name = "dni", nullable = false, length = 8, unique = true)
    private String dni;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @Column(name = "gender", nullable = false, length = 1)
    private String gender;

    @Column(name = "email")
    private String email;

    @Column(name = "phone", length = 9)
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "registration_date")
    private LocalDateTime registrationDate;

    @Column(name = "status", nullable = false, length = 1)
    private String status;

    @Column(name = "program_id", nullable = false)
    private Integer programId;

    @Column(name = "location_id", nullable = false)
    private Integer locationId;
}