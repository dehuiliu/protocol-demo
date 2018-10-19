package com.protocol;

import com.caucho.hessian.io.Hessian2Input;
import com.caucho.hessian.io.Hessian2Output;
import com.protocol.pbbean.StudentMsg;
import org.junit.Test;

import java.io.*;

/**
 * Created by liudehui1 on 2018/10/18
 */
public class ProtocolBufferTest {

    private int dealNum = 100 * 100 * 1000;

    private String fileName = "D:/pbOBJ.txt";
    /**
     * 准备数据
     */
    @Test
    public void init() throws Exception {
        StudentMsg.Student.Builder builder =  StudentMsg.Student.newBuilder();
        builder.setName("jack");
        builder.setAge(12);
        builder.addHabits("sleep");
        builder.addHabits("football");
        builder.addHabits("basketball");
        StudentMsg.Student student = builder.build();
        byte[] packet = student.toByteArray();

        File file = new File(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(packet);
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    /**
     * 编码
     */
    @Test
    public void ecode() throws IOException {

        long start = System.currentTimeMillis();

        for (int i = 0; i < dealNum; i++) {
            StudentMsg.Student.Builder builder =  StudentMsg.Student.newBuilder();
            builder.setName("jack");
            builder.setAge(12);
            builder.addHabits("sleep");
            builder.addHabits("football");
            builder.addHabits("basketball");
            StudentMsg.Student student = builder.build();
            byte[] packet = student.toByteArray();
        }
        long end = System.currentTimeMillis();

        System.out.println("ProtocolBuffer ecode耗时：" + (end - start));
    }

    /**
     * 解码
     */
    @Test
    public void decode() throws IOException {
        StudentMsg.Student.Builder builder =  StudentMsg.Student.newBuilder();
        builder.setName("jack");
        builder.setAge(12);
        builder.addHabits("sleep");
        builder.addHabits("football");
        builder.addHabits("basketball");
        StudentMsg.Student student = builder.build();

        byte[] packet = student.toByteArray();

        long start = System.currentTimeMillis();

        for (int i = 0; i < dealNum; i++) {
            StudentMsg.Student parseFrom = StudentMsg.Student.parseFrom(packet);
        }
        long end = System.currentTimeMillis();

        System.out.println("ProtocolBuffer decode耗时：" + (end - start));
    }
}
