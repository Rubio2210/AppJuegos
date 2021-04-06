package com.jueguitos.AppJuegos.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LolService {

    public String getRotationChampoins() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Riot-Token", System.getProperty("loltoken"));
        HttpEntity entity = new HttpEntity(headers);
        ResponseEntity<String> response = restTemplate.exchange("https://euw1.api.riotgames.com/lol/platform/v3/champion-rotations", HttpMethod.GET, entity, String.class );

        System.out.println(response);

        return null;
    }
}

