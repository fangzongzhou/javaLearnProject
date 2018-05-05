package com.fzz.es.dataconstructer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fzz.es.dataconstructer.DataToJson;
import org.junit.Test;

import java.io.IOException;

public class DataToJsonTest {

    DataToJson dataToJson=new DataToJson();

    @Test
    public void string() {
        dataToJson.string();
    }

    @Test
    public void map() {
        dataToJson.map();
    }

    @Test
    public void serializeBean() throws JsonProcessingException {
        dataToJson.serializeBean();
    }

    @Test
    public void esHelper() throws IOException {
        dataToJson.esHelper();
    }

    @Test
    public void indexDocument() throws IOException {
        dataToJson.indexDocument();
    }
}