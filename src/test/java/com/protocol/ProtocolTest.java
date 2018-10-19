package com.protocol;

import com.caucho.hessian.io.Hessian2Input;
import com.caucho.hessian.io.Hessian2Output;
import com.protocol.pbbean.StudentMsg;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.junit.Test;
import org.msgpack.MessagePack;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

import java.io.*;

/**
 * Created by liudehui1 on 2018/9/3
 */
public class ProtocolTest {

    private StudentInfo getStudentInfo() {
        //序列化
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setName("jack");
        studentInfo.setAge(12);
        String[] strings = {"sleep", "basketball11", "basketba222"};
        studentInfo.setHabits(strings);
        return studentInfo;
    }

    @Test
    public void testProtocolBuffer() throws IOException {
        StudentMsg.Student.Builder builder =  StudentMsg.Student.newBuilder();
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
//
//        StudentMsg.Student parseFrom = StudentMsg.Student.parseFrom(packet);
//        System.out.println(parseFrom.toString());
    }

    @Test
    public void testHessian() throws IOException {
        File tempFile = new File("D:/hessianOBJ.txt");
        //序列化
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setName("jack");
        studentInfo.setAge(12);
        studentInfo.setHabits(new String[]{"sleep", "football", "basketball"});
        Hessian2Output out = new Hessian2Output(new FileOutputStream(tempFile));
        out.writeObject(studentInfo);
        out.flush();
        System.out.println("-----------------------------end");

//        ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
//        Hessian2Input hessianInput = new Hessian2Input(inputStream);
//        StudentInfo read = (StudentInfo) hessianInput.readObject(StudentInfo.class);
//
//        System.out.println(read);

    }
    @Test
    public void testHessianRef() throws IOException {
        File tempFile = new File("D:/hessianOBJRef.txt");
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setName("jack");
        studentInfo.setAge(12);
        String[] strings = {"sleep", "basketball11", "basketba222"};
        studentInfo.setHabits(strings);
        Hessian2Output out = new Hessian2Output(new FileOutputStream(tempFile));
        out.writeObject(studentInfo);
        out.flush();
        System.out.println("-----------------------------end");

    }

    @Test
    public void testJson() {
        StudentInfo studentInfo = getStudentInfo();
        String json = studentInfo.toJson();
        byte[] bytes = json.getBytes();
        System.out.println(" length : " + bytes.length);


    }

    @Test
    public void testMessagePack() throws IOException {
        File tempFile = new File("D:/msgPackTemp.txt");
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setName("jack");
        studentInfo.setAge(12);
        String[] strings = {"sleep", "basketball", "football"};
        studentInfo.setHabits(strings);
        FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
        MessagePack messagePack = new MessagePack();
        Packer packer = messagePack.createPacker(fileOutputStream);
        packer.write(studentInfo);
        packer.close();
        System.out.println("-----------------------------end");

        //
//        ByteArrayInputStream inputStream = new ByteArrayInputStream(bs);
//        Unpacker unpacker = messagePack.createUnpacker(inputStream);
//        StudentInfo read = unpacker.read(StudentInfo.class);
//        System.out.println(read);
    }

    @Test
    public void testMessagePack1() throws IOException {
        File tempFile = new File("D:/tmp.txt");
        MessagePack messagePack = new MessagePack();
        Packer packer = messagePack.createPacker(new FileOutputStream(tempFile));
        packer.write("name");
        packer.write("jack");
        packer.write("age");
        packer.write(12);
        packer.write("habits");
        packer.write(new String[]{"sleep", "basketball"});
        packer.close();

        System.out.println("-----------------------------end");

        //
//        ByteArrayInputStream inputStream = new ByteArrayInputStream(bs);
//        Unpacker unpacker = messagePack.createUnpacker(inputStream);
//        StudentInfo read = unpacker.read(StudentInfo.class);
//        System.out.println(read);
    }

    @Test
    public void testMessagePack2() throws IOException {
        //
        File tempFile = new File("D:/tmpOBJ.txt");
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setName("jack");
        studentInfo.setAge(961);
        studentInfo.setHabits(new String[]{"sleep", "basketball"});
        MessagePack messagePack = new MessagePack();
        Packer packer = messagePack.createPacker(new FileOutputStream(tempFile));
        packer.write(studentInfo);
        packer.close();

        System.out.println("-----------------------------end");

        //
//        ByteArrayInputStream inputStream = new ByteArrayInputStream(bs);
//        Unpacker unpacker = messagePack.createUnpacker(inputStream);
//        StudentInfo read = unpacker.read(StudentInfo.class);
//        System.out.println(read);
    }
    @Test
    public void testMessagePackDemo() throws IOException, DecoderException {
        //
        String h01 = "F09F94AFF09F94AFE29B8EE29B8EE29B8EE29B8EF09F929BF09F929BF09F929BF09F929A";
        File tempFile = new File("D:/tmpOBJDemo.txt");
        String str = new String(Hex.decodeHex(h01.toCharArray()), "UTF-8");

        MessagePack messagePack = new MessagePack();
        Packer packer = messagePack.createPacker(new FileOutputStream(tempFile));
        packer.write(str);
        packer.close();

        System.out.println("-----------------------------end");

        //
//        ByteArrayInputStream inputStream = new ByteArrayInputStream(bs);
//        Unpacker unpacker = messagePack.createUnpacker(inputStream);
//        StudentInfo read = unpacker.read(StudentInfo.class);
//        System.out.println(read);
    }

    @Test
    public void testUnpack() throws IOException {
        MessagePack messagePack = new MessagePack();
        Unpacker unpacker =  messagePack.createUnpacker(new FileInputStream(new File("D:/tmpOBJDemo.txt")));
        String read = unpacker.read(String.class);
        System.out.println(read);
    }
}