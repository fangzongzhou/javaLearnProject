package com.fzz.es.API;

import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.script.Script;
import org.elasticsearch.script.ScriptType;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import static org.elasticsearch.common.xcontent.XContentFactory.jsonBuilder;

public class Update {

    public void updateWithUpdateRequestDoc(Client client) throws IOException, ExecutionException, InterruptedException {
        UpdateRequest updateRequest = new UpdateRequest();
        updateRequest.index("index");
        updateRequest.type("type");
        updateRequest.id("1");
        updateRequest.doc(jsonBuilder()
                .startObject()
                .field("gender", "male")
                .endObject());
        client.update(updateRequest).get();
    }

    public void prepareUpdate(Client client) throws IOException {
        client.prepareUpdate("ttl", "doc", "1")
                .setScript(new Script(ScriptType.INLINE,"ctx._source.gender = \"male\""  , null, null))
                .get();

        client.prepareUpdate("ttl", "doc", "1")
                .setDoc(jsonBuilder()
                        .startObject()
                        .field("gender", "male")
                        .endObject())
                .get();
    }

    public void updateByScript(Client client) throws ExecutionException, InterruptedException {
        UpdateRequest updateRequest = new UpdateRequest("ttl", "doc", "1")
                .script(new Script("ctx._source.gender = \"male\""));
        client.update(updateRequest).get();
    }

    /**
    *
    * If the document does not exist, the one in indexRequest will be added
    * */
    public void upsert(Client client) throws IOException, ExecutionException, InterruptedException {

        IndexRequest indexRequest = new IndexRequest("index", "type", "1")
                .source(jsonBuilder()
                        .startObject()
                        .field("name", "Joe Smith")
                        .field("gender", "male")
                        .endObject());
        UpdateRequest updateRequest = new UpdateRequest("index", "type", "1")
                .doc(jsonBuilder()
                        .startObject()
                        .field("gender", "male")
                        .endObject())
                .upsert(indexRequest);
        client.update(updateRequest).get();
    }



}
