package com.yufei.json;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by pc on 2016-11-21.
 */
public class User {

    @JsonProperty("user_name")
    private String name;
    @JsonProperty("ussex")
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
