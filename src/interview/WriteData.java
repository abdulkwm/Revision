package interview;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/Users/abdulkerim/Learning/cogent_university/streams/abc");
        BufferedWriter bwr = new BufferedWriter(fw);
        bwr.write("Java is The programming language that i like \n");
        bwr.write("Html is best markup language \n");
        bwr.write("I love programming");
        System.out.println("Finished");
        bwr.close();
    }
}
