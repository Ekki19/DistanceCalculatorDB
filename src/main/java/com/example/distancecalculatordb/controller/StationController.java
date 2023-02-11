package com.example.distancecalculatordb.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.example.distancecalculatordb.entity.Station;
import com.example.distancecalculatordb.logic.CSVParser;
import com.example.distancecalculatordb.logic.DistanceCalculator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class StationController {

    @GetMapping("/distance/{from}/{to}")
    private String getDistance(@PathVariable String from, @PathVariable String to){
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

        DistanceCalculator distanceCalculator = new DistanceCalculator();
        double distance = distanceCalculator.calculateDistance(stationFrom, stationTo);

        return String.valueOf(distance);
    }
}
