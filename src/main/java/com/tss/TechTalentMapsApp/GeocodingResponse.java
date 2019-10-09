package com.tss.TechTalentMapsApp;

import java.util.List;

import lombok.Data;

@Data
public class GeocodingResponse {
    private List<Geocoding> results;
}