package com.hft.hftsystem.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hft.hftsystem.models.SourceResponse;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

public class LoaderTest {


    @Test
    public void testLoadData() throws IOException {
        var rawImport = new ClassPathResource("/dailyChart.json");
        var jsonData = new String(rawImport.getInputStream().readAllBytes());

        //Map Json to Model
        var mapper = new ObjectMapper()
                .findAndRegisterModules();
        SourceResponse sourceResponse = mapper.readValue(jsonData, SourceResponse.class);

        System.out.println(sourceResponse);
    }
}
