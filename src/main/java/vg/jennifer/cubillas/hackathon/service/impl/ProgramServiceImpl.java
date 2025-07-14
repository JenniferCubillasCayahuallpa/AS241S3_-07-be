package vg.jennifer.cubillas.hackathon.service.impl;

import vg.jennifer.cubillas.hackathon.model.Program;
import vg.jennifer.cubillas.hackathon.repository.ProgramRepository;
import vg.jennifer.cubillas.hackathon.service.ProgramService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramServiceImpl implements ProgramService {
    private final ProgramRepository programRepository;
    public ProgramServiceImpl(ProgramRepository programRepository) {
        this.programRepository = programRepository;
    }
    @Override
    public List<Program> findAll() {
        return programRepository.findAll();
    }
}