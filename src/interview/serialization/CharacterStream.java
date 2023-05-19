package interview.serialization;

import java.io.*;

public class CharacterStream {
    public static void main(String[] args) throws IOException {
        //Creating an object of MyClass
        MyClass obj = new MyClass("Mohammed",23);
        //Serialize the object
        FileWriter fileWriter = new FileWriter("/Users/abdulkerim/Learning/cogent_university/streams/aaa");
        fileWriter.write(obj.getName() + "\n");
        fileWriter.write(obj.getAge() + "\n");
        fileWriter.close();
        //deserialize the objects
        FileReader fileReader = new FileReader("/Users/abdulkerim/Learning/cogent_university/streams/aaa");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String name = bufferedReader.readLine();
        int age = Integer.parseInt(bufferedReader.readLine());
        MyClass obj2 = new MyClass(name, age);
        bufferedReader.close();
        fileReader.close();
        System.out.println("Deserialized data:");
        System.out.println("Name: " + obj2.getName());
        System.out.println("Age: " + obj2.getAge());
    }
}
