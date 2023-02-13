package com.example.distancecalculatordb.controller;

import java.util.HashMap;
import java.util.List;

import com.example.distancecalculatordb.dto.StationDTO;
import com.example.distancecalculatordb.model.Station;
import com.example.distancecalculatordb.logic.CSVParser;
import com.example.distancecalculatordb.logic.DistanceCalculator;
import com.example.distancecalculatordb.logic.StationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class StationController {
    //final Deklaration da sie nicht verändert werden müssen
    final StationService stationService = new CSVParser();
    final List<Station> stationList = stationService.getStations();
    final HashMap<String, Station> hashMap = new HashMap<String, Station>();


    @GetMapping("/distance/{from}/{to}")
    private StationDTO getDistance(@PathVariable String from, @PathVariable String to){

        Station stationFrom = new Station();
        Station stationTo = new Station();

        for(Station station: stationList){
            hashMap.put(station.getDs100(), station);
        }

        //Stationen aus der HashMap holen
        stationFrom = hashMap.get(from);
        stationTo = hashMap.get(to);

        //leere Station: Fehler abfangen
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
