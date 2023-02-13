package com.example.distancecalculatordb.logic;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CSVParserTest {

    /*
        getCSVFile() Testet, ob die eingelesene Datei nicht leer ist
     */

    @Test
    void getCSVFile() throws IOException {
        CSVParser csvParser = new CSVParser();
        File file = csvParser.getFile(new ClassPathResource("D_Bahnhof_2020_alle.csv"));

        assertNotNull(file);
    }
}