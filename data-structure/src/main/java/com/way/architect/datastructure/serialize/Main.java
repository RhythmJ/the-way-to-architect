package com.way.architect.datastructure.serialize;

import com.alibaba.fastjson.JSONObject;

/**
 * @author majunjie
 * @description
 * @date 2018/8/13 22:24
 */
public class Main {

    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        teacher.setName("mathT");

        String jsonString = JSONObject.toJSONString(teacher);

        System.out.println(jsonString);

    }

}
