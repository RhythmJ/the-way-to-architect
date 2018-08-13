package com.way.architect.datastructure.serialize;

import lombok.Data;

/**
 * @author majunjie
 * @description
 * @date 2018/8/13 22:20
 */
@Data
public class Teacher {

    private String name;
    private Course course;

    public Course getCourse() {
        if (name!=null && name.length()>0) {
            course = new Course();
            course.setName("体育课");
        }
        return course;
    }

}
