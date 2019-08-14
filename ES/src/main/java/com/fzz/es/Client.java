package com.fzz.es;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Client {

    public TransportClient getClient() throws UnknownHostException {
        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)

                .addTransportAddress(new TransportAddress(InetAddress.getByName("10.253.212.58"), 9300));

// on shutdown
        return client;
    }

    public TransportClient getClientWithSetting() {
        Settings settings= Settings.builder()
                .put("cluster.name", "elasticsearch").build();
        TransportClient client = new PreBuiltTransportClient(settings);
        return client;
    }
}
