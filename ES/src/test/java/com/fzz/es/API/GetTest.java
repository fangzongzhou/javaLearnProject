package com.fzz.es.API;

import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.junit.Test;
import com.fzz.es.Client;
import com.fzz.es.dataconstructer.DataToJson;
import org.elasticsearch.client.transport.TransportClient;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Date;

import static org.elasticsearch.common.xcontent.XContentFactory.jsonBuilder;
import static org.junit.Assert.*;

public class GetTest {

    TransportClient client;

    @Before
    public void init() throws IOException {
        try {
            client=new Client().getClient();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        IndexResponse response = client.prepareIndex("twitter", "tweet", "1")
                .setSource(jsonBuilder()
                        .startObject()
                        .field("user", "kimchy")
                        .field("postDate", new Date())
                        .field("message", "trying out Elasticsearch")
                        .endObject()
                )
                .get();
    }

    @After
    public void after() {
        client.close();
    }

    @Test
    public void get() {
        System.out.println(new Get().get(client));

    }
}