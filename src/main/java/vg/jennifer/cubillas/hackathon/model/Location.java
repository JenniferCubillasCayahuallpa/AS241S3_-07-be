package vg.jennifer.cubillas.hackathon.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "locations")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")  // Cambiado
    private Integer id;

    @Column(name = "department")
    private String department;

    @Column(name = "province")
    private String province;

    @Column(name = "district")
    private String district;
}
