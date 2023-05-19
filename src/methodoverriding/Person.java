package methodoverriding;

public class Person {
    String pName;

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }
    public void behavior(){
        System.out.println("Idle");
    }
}
