package com.eatmans.oauth.domain;

import org.json.JSONObject;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/6/6
 */

public class JSONResult{
    public static String fillResultString(Integer status, String message, Object result){
        JSONObject jsonObject = new JSONObject(){{
            put("status", status);
            put("message", message);
            put("result", result);
        }};
        return jsonObject.toString();
    }
}