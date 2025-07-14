package vg.jennifer.cubillas.hackathon.service.impl;

import vg.jennifer.cubillas.hackathon.model.Location;
import vg.jennifer.cubillas.hackathon.repository.LocationRepository;
import vg.jennifer.cubillas.hackathon.service.LocationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;

    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> findAll() {
        return locationRepository.findAll();
    }
}