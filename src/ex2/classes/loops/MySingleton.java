package ex2.classes.loops;

public class MySingleton {
    private static MySingleton instance = null;
    private String data;
    private MySingleton() {
        data = "This is singleton";
    }

    public static MySingleton getInstance() {
        if (instance == null){
            instance = new MySingleton();
        }
        return instance;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public static void main(String[] args) {
        MySingleton s = MySingleton.getInstance();
        System.out.println(s.getData());
        s.setData("this is the second one");
        System.out.println(s.getData());
        MySingleton s2 = MySingleton.getInstance();
        s2.setData("this is new instance");
        System.out.println(s2.getData());
    }
}
