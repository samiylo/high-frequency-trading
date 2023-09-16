package com.hft.hftsystem.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class MetaData {

    @JsonAlias("1. Information")
    private String information;
    @JsonAlias("2. Digital Currency Code")
    private String digitalCurrencyCode;
    @JsonAlias("3. Digital Currency Name")
    private String digitalCurrencyName;
    @JsonAlias("4. Market Code")
    private String marketCode;
    @JsonAlias("5. Market Name")
    private String marketName;
    @JsonAlias("6. Last Refreshed")
    private String lastRefreshed;
    @JsonAlias("7. Time Zone")
    private String timeZone;
}
