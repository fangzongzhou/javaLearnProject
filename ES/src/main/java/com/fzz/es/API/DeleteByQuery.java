package com.fzz.es.API;

import org.apache.http.client.methods.RequestBuilder;
import org.elasticsearch.action.ActionListener;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.reindex.BulkByScrollResponse;
import org.elasticsearch.index.reindex.DeleteByQueryAction;
import org.elasticsearch.search.aggregations.AggregationBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilders;

public class DeleteByQuery {
    public void deleteByQuery(TransportClient client) {
        BulkByScrollResponse response = DeleteByQueryAction.INSTANCE.newRequestBuilder(client)
                .filter(QueryBuilders.matchQuery("gender", "male"))
                .source("persons")
                .get();
        long deleted=response.getDeleted();
        System.out.println(deleted);
    }

    public void deleteByQueryAsyn(TransportClient client) {
        DeleteByQueryAction.INSTANCE.newRequestBuilder(client)
                .filter(QueryBuilders.matchQuery("gender", "male"))
                .source("persons")
                .execute(new ActionListener<BulkByScrollResponse>() {
                    @Override
                    public void onResponse(BulkByScrollResponse response) {
                        long deleted = response.getDeleted();
                        System.out.println(deleted);
                    }
                    @Override
                    public void onFailure(Exception e) {
                        // Handle the exception
                    }
                });



    }
}
