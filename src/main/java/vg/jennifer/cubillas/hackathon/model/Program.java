package vg.jennifer.cubillas.hackathon.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "programs")
public class Program {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "program_id")  // Cambiado
    private Integer id;

    @Column(name = "program_name")  // Cambiado
    private String programName;
}
