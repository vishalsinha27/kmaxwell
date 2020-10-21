package com.kmaxwell.consumer;

import com.kmaxwell.db.MongoData;
import com.kmaxwell.model.MData;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class KafkaConsumer {

    @Autowired
    MongoData mongoData;
    @KafkaListener(topics = "maxwell-events", groupId = "maxwellgr")
    public void consumeJson(MData maxwellData) {
        log.debug("got the message: "+maxwellData);
        mongoData.saveData(maxwellData);
        // do your processing and save it to mongodb.

    }
}
