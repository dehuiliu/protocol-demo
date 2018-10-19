package com.protocol;

import org.json.simple.JSONArray;
import org.msgpack.annotation.Message;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by liudehui1 on 2018/8/18
 */
@Message
public class StudentInfo implements Serializable {

    private static final long serialVersionUID = -5925128286829542614L;

    private String name;
    private int age;
    private String habits[];


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public String toJson() {
        return toString();
    }

    @Override
    public String toString() {
        String habitsString = habits == null ? "[]" : JSONArray.toJSONString(Arrays.asList(habits));
        return "{" +
                "\"name\":\"" + name + "\"" +
                ",\"age:\":" + age +
                ",\"habits\":" + habitsString +
                '}';
    }
}
