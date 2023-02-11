package com.example.distancecalculatordb.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class StationController {

    @GetMapping("/distance/{from}/{to}")
    private String getDistance(@PathVariable String from, @PathVariable String to){
        return from + to;
    }
}
