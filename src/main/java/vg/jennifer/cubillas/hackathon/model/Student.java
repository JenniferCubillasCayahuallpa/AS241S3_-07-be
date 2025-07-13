package vg.jennifer.cubillas.hackathon.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StudentID")
    private Long id;

    @Column(name = "DNI", nullable = false, length = 8, unique = true)
    private String dni;

    @Column(name = "FirstName", nullable = false)
    private String firstName;

    @Column(name = "LastName", nullable = false)
    private String lastName;

    @Column(name = "BirthDate", nullable = false)
    private LocalDate birthDate;

    @Column(name = "Gender", nullable = false, length = 1)
    private String gender;

    @Column(name = "Email")
    private String email;

    @Column(name = "Phone", length = 9)
    private String phone;

    @Column(name = "Address")
    private String address;

    @Column(name = "RegistrationDate")
    private LocalDateTime registrationDate;

    @Column(name = "Status", nullable = false, length = 1)
    private String status;

    @Column(name = "ProgramID", nullable = false)
    private Integer programId;

    @Column(name = "LocationID", nullable = false)
    private Integer locationId;
}
