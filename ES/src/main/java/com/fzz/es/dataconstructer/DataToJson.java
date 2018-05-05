package com.fzz.es.dataconstructer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.io.IOException;
import java.io.Serializable;
import java.net.InetAddress;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.elasticsearch.common.xcontent.XContentFactory.jsonBuilder;

public class DataToJson {

    public String string() {
        String json="{" +
                "\"User\":\"kimchy\"," +
                "\"postDate\":\"2013-01-30\"," +
                "\"message\":\"trying out Elasticsearch\"" +
                "}";
        System.out.println(json);
        return json;
    }

    void map() {
        Map<String, Object> json = new HashMap<String, Object>();
        json.put("user", "fzz");
        json.put("postDate", new Date());
        json.put("message","trying out Elasticsearch");
        System.out.println(json);
    }

    void serializeBean() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        byte[] json = objectMapper.writeValueAsBytes(new User("fzz",23));
        System.out.println(json);
    }

    void esHelper() throws IOException {
        XContentBuilder builder=jsonBuilder()
                .startObject()
                .field("user", "kimchy")
                .field("postDate", new Date())
                .field("message", "trying out Elasticsearch")
                .endObject();

        String json = builder.string();
        System.out.println(json);

    }

    void indexDocument() throws IOException {
        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)

                .addTransportAddress(new TransportAddress(InetAddress.getByName("localhost"), 9300));


        IndexResponse response = client.prepareIndex("twitter", "tweet", "1")
                .setSource(jsonBuilder()
                        .startObject()
                        .field("user", "kimchy")
                        .field("postDate", new Date())
                        .field("message", "trying out Elasticsearch")
                        .endObject()
                )
                .get();

        System.out.println(response.toString());

        client.close();


    }


    class User implements Serializable {
        String name;
        int age;

        User(String name, int age) {
            this.name=name;
            this.age=age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }




}
