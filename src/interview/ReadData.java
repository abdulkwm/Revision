package interview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws IOException {
//        approach 1 FileReader BufferReader
        try {
            FileReader fr = new FileReader("/Users/abdulkerim/Learning/cogent_university/streams/Hello");
            BufferedReader br = new BufferedReader(fr);
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
            br.close();
//        approach 2 Using scanner & file
            File file = new File("/Users/abdulkerim/Learning/cogent_university/streams/Hello");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
//        approach 3 using delimiter
            File file1 = new File("/Users/abdulkerim/Learning/cogent_university/streams/Hello");
            Scanner sc1 = new Scanner(file1);
            sc1.useDelimiter("\\z");
            System.out.println(sc1.next());
        }catch (IOException e){
            System.out.println("File doesn't exist");
        }
    }
}
