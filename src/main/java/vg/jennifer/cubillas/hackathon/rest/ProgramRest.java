package vg.jennifer.cubillas.hackathon.rest;

import vg.jennifer.cubillas.hackathon.model.Program;
import vg.jennifer.cubillas.hackathon.service.ProgramService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/program")
@CrossOrigin(origins = "*")
public class ProgramRest {

    private final ProgramService programService;

    public ProgramRest(ProgramService programService) {
        this.programService = programService;
    }

    @GetMapping
    public List<Program> findAll() {
        return programService.findAll();
    }
}