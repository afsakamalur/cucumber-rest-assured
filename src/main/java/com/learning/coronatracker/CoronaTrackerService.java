package com.learning.coronatracker;

import domain.RegionDetails;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;


@Service
public class CoronaTrackerService {

    @PostConstruct
    public void initiateRun() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response
            = restTemplate.getForEntity("http://localhost:8080/hello", String.class);

        System.out.println(response.getStatusCode());
    }
}
