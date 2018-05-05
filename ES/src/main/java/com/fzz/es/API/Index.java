package com.fzz.es.API;

import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.xcontent.XContentType;

import java.util.Date;

import static org.elasticsearch.common.xcontent.XContentFactory.*;

public class Index {


    public IndexResponse index(TransportClient client) throws Exception {
        IndexResponse response = client.prepareIndex("twitter", "tweet", "1")
                .setSource(jsonBuilder()
                        .startObject()
                        .field("user", "kimchy")
                        .field("postDate", new Date())
                        .field("message", "trying out Elasticsearch")
                        .endObject()
                )
                .get();
        return response;
    }

    public IndexResponse indexWithJson(TransportClient client, String jsonStr) {


        IndexResponse response = client.prepareIndex("twitter", "tweet")
                .setSource(jsonStr, XContentType.JSON)
                .get();
        return response;
    }


}
