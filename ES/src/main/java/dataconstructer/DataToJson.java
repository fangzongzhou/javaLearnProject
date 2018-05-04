package dataconstructer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.elasticsearch.common.xcontent.XContentBuilder;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.elasticsearch.common.xcontent.XContentFactory.jsonBuilder;

public class DataToJson {

    void string() {
        String json="{" +
                "\"User\":\"kimchy\"," +
                "\"postDate\":\"2013-01-30\"," +
                "\"message\":\"trying out Elasticsearch\"" +
                "}";
    }

    void map() {
        Map<String, Object> json = new HashMap<String, Object>();
        json.put("user", "fzz");
        json.put("postDate", new Date());
        json.put("message","trying out Elasticsearch");
    }

    void serializeBean() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        byte[] json = objectMapper.writeValueAsBytes(new User("fzz",23));
    }

    void esHelper() throws IOException {
        XContentBuilder builder=jsonBuilder()
                .startObject()
                .field("user", "kimchy")
                .field("postDate", new Date())
                .field("message", "trying out Elasticsearch")
                .endObject();

        String json = builder.string();

    }

    void indexDocument() {


    }


    class User {
        String name;
        int age;

        User(String name, int age) {
            this.name=name;
            this.age=age;
        }
    }




}
