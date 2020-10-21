package com.kmaxwell.db;

import com.kmaxwell.model.MData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class MongoData {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void saveData(MData mData){
        mongoTemplate.insert(mData, mData.getDatabase()+"_"+mData.getTable());

    }

}
