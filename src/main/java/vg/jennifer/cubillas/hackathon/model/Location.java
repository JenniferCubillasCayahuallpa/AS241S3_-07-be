package vg.jennifer.cubillas.hackathon.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Locations")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LocationID")
    private Integer id;

    @Column(name = "Department")
    private String department;

    @Column(name = "Province")
    private String province;

    @Column(name = "District")
    private String district;
}
