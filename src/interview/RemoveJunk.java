package interview;

public class RemoveJunk {
    public static void main(String[] args) {
        String s = "%$^#GETTEERBGY$E%BTRYW$TR BV TRWVF%$#^%F#@%$@#%WC$RVECF";
        s = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
    }
}
