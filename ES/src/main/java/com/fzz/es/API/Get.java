package com.fzz.es.API;

import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.transport.TransportClient;

public class Get {

    public GetResponse get(TransportClient client) {
        GetResponse response = client.prepareGet("twitter", "tweet", "1").get();
        return response;
    }
}
