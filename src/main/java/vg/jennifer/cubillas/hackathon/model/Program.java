package vg.jennifer.cubillas.hackathon.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Programs")
public class Program {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProgramID")
    private Integer id;

    @Column(name = "ProgramName")
    private String programName;
}
