package pkg3;
class superClass{
    public static int multiply(int a, int b)
    {
        return a*b;
    }
}
class staticNot extends superClass {
    public static int multiply(int a, int b)
    {
        return a*b;
    }
}

    public class staticNotOverride{
    public static void main(String[] args) {
        superClass obj = new superClass();

    }
}
