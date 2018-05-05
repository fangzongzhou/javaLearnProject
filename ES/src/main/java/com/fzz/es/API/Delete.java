package com.fzz.es.API;

import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.client.transport.TransportClient;

public class Delete {


    public DeleteResponse delete(TransportClient client) {
        DeleteResponse response = client.prepareDelete("twitter", "tweet", "1").get();
        return response;
    }


}
