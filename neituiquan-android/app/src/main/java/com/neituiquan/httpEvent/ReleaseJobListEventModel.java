package com.neituiquan.httpEvent;

import com.neituiquan.net.RequestEventModel;

/**
 * Created by Augustine on 2018/6/22.
 * <p>
 * email:nice_ohoh@163.com
 */

public class ReleaseJobListEventModel extends RequestEventModel {

    public String jobsId;

    public ReleaseJobListEventModel(int eventId) {
        this.eventId = eventId;
    }
}
