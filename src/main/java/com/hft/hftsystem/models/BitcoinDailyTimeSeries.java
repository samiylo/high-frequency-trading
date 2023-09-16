package com.hft.hftsystem.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class BitcoinDailyTimeSeries {
    @JsonAlias("1a. open (CNY)")
    private String openCNY;
    @JsonAlias("1b. open (USD)")
    private String openUSD;
    @JsonAlias("2a. high (CNY)")
    private String highCNY;
    @JsonAlias("2b. high (USD)")
    private String highUSD;
    @JsonAlias("3a. low (CNY)")
    private String lowCNY;
    @JsonAlias("3b. low (USD)")
    private String lowUSD;
    @JsonAlias("4a. close (CNY)")
    private String closeCNY;
    @JsonAlias("4b. close (USD)")
    private String closeUSD;
    @JsonAlias("5. volume")
    private String volume;
    @JsonAlias("6. market cap (USD)")
    private String marketCapUSD;
}
