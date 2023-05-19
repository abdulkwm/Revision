package ex2.classes;

public class Singleton {
    private static Singleton instance = null;
    private String data;
    private Singleton(){
        data = "Hello, I am a singleton";
    }
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getData());
        singleton.setData("I have been modified");
        System.out.println(singleton.getData());
        Singleton newSingleton = Singleton.getInstance();
        System.out.println(newSingleton.getData());

    }
}
