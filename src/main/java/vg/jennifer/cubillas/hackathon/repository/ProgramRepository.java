package vg.jennifer.cubillas.hackathon.repository;

import vg.jennifer.cubillas.hackathon.model.Program;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramRepository extends JpaRepository<Program, Integer> {}