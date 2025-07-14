package vg.jennifer.cubillas.hackathon.repository;

import vg.jennifer.cubillas.hackathon.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {}