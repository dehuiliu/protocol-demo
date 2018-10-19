package com.protocol;

import com.caucho.hessian.io.Hessian2Input;
import com.caucho.hessian.io.Hessian2Output;
import org.junit.Test;
import org.msgpack.MessagePack;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

import java.io.*;

/**
 * Created by liudehui1 on 2018/10/18
 */
public class HessianTest {

    private int dealNum = 100 * 100 * 1000;

    private String fileName = "D:/hessianOBJ.txt";

    /**
     * 准备数据
     */
    @Test
    public void init() throws Exception {
        File tempFile = new File(fileName);
        //序列化
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setName("jack");
        studentInfo.setAge(12);
        studentInfo.setHabits(new String[]{"sleep", "football", "basketball"});
        Hessian2Output out = new Hessian2Output(new FileOutputStream(tempFile));
        out.writeObject(studentInfo);
        out.flush();
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

        for (int i = 0; i < dealNum; i++) {
            Hessian2Output out = new Hessian2Output(new ByteArrayOutputStream());
            out.writeObject(studentInfo);
        }
        long end = System.currentTimeMillis();

        System.out.println("Hessian ecode耗时：" + (end - start));
    }

    /**
     * 解码
     */
    @Test
    public void decode() throws IOException {
        File file = new File(fileName);
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];
        fileInputStream.read(bytes);

        long start = System.currentTimeMillis();
        for (int i = 0; i < dealNum; i++) {
            ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
            Hessian2Input hessianInput = new Hessian2Input(inputStream);
            StudentInfo read = (StudentInfo) hessianInput.readObject(StudentInfo.class);
        }
        long end = System.currentTimeMillis();

        System.out.println("Hessian decode耗时：" + (end - start));
    }
}
