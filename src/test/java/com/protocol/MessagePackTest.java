package com.protocol;

import com.protocol.pbbean.StudentMsg;
import org.junit.Test;
import org.msgpack.MessagePack;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

import java.io.*;

/**
 * Created by liudehui1 on 2018/10/18
 */
public class MessagePackTest {
    private int dealNum = 100 * 100 * 1000;

    /**
     * 准备数据
     */
    @Test
    public void init() throws Exception {
        StudentMsg.Student.Builder builder = StudentMsg.Student.newBuilder();
        builder.setName("jack");
        builder.setAge(12);
        builder.addHabits("sleep");
        builder.addHabits("football");
        builder.addHabits("basketball");
        StudentMsg.Student student = builder.build();
        byte[] packet = student.toByteArray();
        File file = new File("D:/pbOBJ.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(packet);
        fileOutputStream.flush();
        fileOutputStream.close();
        System.out.println("----------------------------end");
    }

    /**
     * 编码
     */
    @Test
    public void ecode() throws IOException {
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setName("jack");
        studentInfo.setAge(12);
        String[] strings = {"sleep", "basketball", "football"};
        studentInfo.setHabits(strings);

        long start = System.currentTimeMillis();
        MessagePack messagePack = new MessagePack();

        for (int i = 0; i < dealNum; i++) {
            Packer packer = messagePack.createPacker(new ByteArrayOutputStream());
            packer.write(studentInfo);
            packer.close();
        }
        long end = System.currentTimeMillis();

        System.out.println("MessagePack ecode耗时：" + (end - start));
    }

    /**
     * 解码
     */
    @Test
    public void decode() throws IOException {
        File file = new File("D:/msgPackTemp.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bs = new byte[(int) file.length()];
        fileInputStream.read(bs);

        long start = System.currentTimeMillis();
        MessagePack messagePack = new MessagePack();
        for (int i = 0; i < dealNum; i++) {
            ByteArrayInputStream inputStream = new ByteArrayInputStream(bs);
            Unpacker unpacker = messagePack.createUnpacker(inputStream);
            StudentInfo read = unpacker.read(StudentInfo.class);
//            System.out.println(read);
        }
        long end = System.currentTimeMillis();

        System.out.println("MessagePack decode耗时：" + (end - start));
    }
}
