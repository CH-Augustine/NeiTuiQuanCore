package com.neituiquan.httpEvent;

import com.neituiquan.net.RequestEventModel;

/**
 * Created by Augustine on 2018/7/3.
 * <p>
 * email:nice_ohoh@163.com
 */

public class CheckBindResumeEventModel extends RequestEventModel {

    public Class<?> successClass;

    public CheckBindResumeEventModel(int eventId) {
        this.eventId = eventId;
    }
}
