package com.yufei.json;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/**
 * Created by pc on 2016-11-21.
 */
public class JsonUtil {

    public static void main(String[] args) throws IOException {
        String s = "{\"user_name\":\"fd\",\"ussex\":\"1\"}";
        ObjectMapper mapper = new ObjectMapper();
        User u = mapper.readValue(s, User.class);
        System.out.println(u);
        System.out.println(mapper.writeValueAsString(u));
    }

}
