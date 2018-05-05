package com.fzz.es.API;

import com.fzz.es.Client;
import com.fzz.es.dataconstructer.DataToJson;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Date;

import static org.elasticsearch.common.xcontent.XContentFactory.jsonBuilder;

public class IndexTest {
    TransportClient client;
    Index index;

    @Before
    public void init() throws IOException {
        try {
            client= new Client().getClient();
            index=new Index();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }

    @After
    public void clean() {
        client.close();
    }

    @Test
    public void index() throws Exception {
        System.out.println(index.index(client));
    }

    @Test
    public void indexWithJson() {


        System.out.println(index.indexWithJson(client, new DataToJson().string()));
    }
}