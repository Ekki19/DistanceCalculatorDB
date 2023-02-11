package com.example.distancecalculatordb.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.example.distancecalculatordb.dto.StationDTO;
import com.example.distancecalculatordb.entity.Station;
import com.example.distancecalculatordb.logic.CSVParser;
import com.example.distancecalculatordb.logic.DistanceCalculator;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class StationController {


    @GetMapping("/distance/{from}/{to}")
    private StationDTO getDistance(@PathVariable String from, @PathVariable String to){
        CSVParser csvParser = new CSVParser();
        List<Station> stationList = csvParser.getStations();

        Station stationFrom = null;
        Station stationTo = null;

        for(int i=0; i<stationList.size(); i++){
            if(stationList.get(i).getDs100().equals(from)){
                stationFrom = stationList.get(i);
            }
            if(stationList.get(i).getDs100().equals(to)){
                stationTo = stationList.get(i);
            }
        }
        if(stationFrom == null || stationTo == null){
            StationDTO stationDTO = new StationDTO();
            stationDTO.setFrom("FEHLER");
            stationDTO.setTo("FEHLER");
            stationDTO.setDistance(-1);
            stationDTO.setUnit("FEHLER");
            return stationDTO;
        }

        DistanceCalculator distanceCalculator = new DistanceCalculator();
        int distance = (int) distanceCalculator.calculateDistance(stationFrom, stationTo);

        StationDTO stationDTO = new StationDTO();
        stationDTO.setFrom(stationFrom.getName());
        stationDTO.setTo(stationTo.getName());
        stationDTO.setDistance(distance);
        stationDTO.setUnit("km");

        return stationDTO;
    }
}
