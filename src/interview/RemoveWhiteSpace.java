package interview;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str = "java              programming is cool";
        System.out.println("before removing white space : "+"\n" + str);
        str = str.replaceAll("\\s","");
        System.out.println("after removing white space : "+"\n" + str);
    }
}
