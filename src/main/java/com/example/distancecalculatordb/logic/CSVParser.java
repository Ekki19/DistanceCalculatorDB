package com.example.distancecalculatordb.logic;

import com.example.distancecalculatordb.entity.Station;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVParser implements StationService{

    @Override
    public List<Station> getStations() {
        //TODO: Zeilen auslesen und Station Objekt füllen
        try{
            Resource resource = new ClassPathResource("D_Bahnhof_2020_alle.csv");
            File file = resource.getFile();

            List<Station> stationList = new CsvToBeanBuilder(new FileReader(file))
                    .withType(Station.class)
                    .withSeparator(';')
                    .build()
                    .parse();
            return stationList;

        }catch(Exception e){
            return null;
        }
    }
}
