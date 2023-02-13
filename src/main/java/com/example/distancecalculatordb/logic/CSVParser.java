package com.example.distancecalculatordb.logic;

import com.example.distancecalculatordb.model.Station;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/*
CSVParser liest die CSV Datei zeilenweise aus, dazu wird eine csv-Datei benötigt
 */
public class CSVParser implements StationService{

    @Override
    public List<Station> getStations() {
        try{

            File file = getFile(new ClassPathResource("D_Bahnhof_2020_alle.csv"));

            return (List<Station>) new CsvToBeanBuilder(new FileReader(file))
                    .withType(Station.class)
                    .withSeparator(';')
                    .build()
                    .parse();

        }catch(Exception e){
            return null;
        }
    }

    public File getFile(ClassPathResource classPathResource) throws IOException {
        Resource resource = classPathResource;
        File file = resource.getFile();
        return file;
    }
}
