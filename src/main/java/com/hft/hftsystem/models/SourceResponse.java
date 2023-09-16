package com.hft.hftsystem.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.util.HashMap;

@Data
public class SourceResponse {

    @JsonAlias("Meta Data")
    MetaData metaData;
    @JsonAlias("Time Series (Digital Currency Daily)")
    HashMap<String, BitcoinDailyTimeSeries> timeSeries;
}
