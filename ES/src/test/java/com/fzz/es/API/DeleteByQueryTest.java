package com.fzz.es.API;

import com.fzz.es.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.UnknownHostException;

import static org.junit.Assert.*;

public class DeleteByQueryTest {

    TransportClient client;

    @Before
    public void init() throws UnknownHostException {
        client=new Client().getClient();
    }

    @After
    public void after() {
        client.close();
    }

    @Test
    public void deleteByQuery() {
        new DeleteByQuery().deleteByQuery(client);
    }

    @Test
    public void deleteByQueryAsyn() {
        new DeleteByQuery().deleteByQueryAsyn(client);
    }
}