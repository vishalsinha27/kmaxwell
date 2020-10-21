package com.kmaxwell.model;

import lombok.Data;

import java.util.Map;

@Data
public class MData {
    /*
    {"database":"maxwelltest","table":"Persons","type":"insert","ts":1602904030,"xid":17358,"commit":true,"data":{"PersonId":1,"LastName":"Erichsen","FirstName":"Tom","City":"Stavanger"}}

     */
    private String database;
    private String table;
    private String type;
    private long ts;
    private int xid;
    private boolean commit;
    private Map<String, Object> data;

}
