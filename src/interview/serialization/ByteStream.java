package interview.serialization;

import java.io.*;
public class ByteStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //creating an object of interview.serialization.MyClass
        MyClass obj = new MyClass("Abdu",23);
        //serialize the object now
        FileOutputStream fileOut = new FileOutputStream("/Users/abdulkerim/Learning/cogent_university/streams/aaa");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(obj);
        out.close();
        fileOut.close();
        System.out.println("Serialized data is saved in folder");
        //deserialize the objects
        FileInputStream fileIn = new FileInputStream("/Users/abdulkerim/Learning/cogent_university/streams/aaa");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        MyClass obj2 = (MyClass) in.readObject();
        in.close();
        fileIn.close();
        System.out.println("Deserialized data:");
        System.out.println("Name: " + obj2.getName());
        System.out.println("Age: " + obj2.getAge());
    }
}
