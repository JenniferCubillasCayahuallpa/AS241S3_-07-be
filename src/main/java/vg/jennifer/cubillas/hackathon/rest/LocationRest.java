package vg.jennifer.cubillas.hackathon.rest;

import vg.jennifer.cubillas.hackathon.model.Location;
import vg.jennifer.cubillas.hackathon.service.LocationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/location")
@CrossOrigin(origins = "*")
public class LocationRest {

    private final LocationService locationService;

    public LocationRest(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping
    public List<Location> findAll() {
        return locationService.findAll();
    }
}