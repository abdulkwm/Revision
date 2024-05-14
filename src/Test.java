public class Test implements AutoCloseable{
    public static void main(String[] args) throws Exception {
        try (Test test = new Test()){
            System.out.println(3/0);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("this is the second one");
    }

    @Override
    public void close() throws Exception {
        System.out.println("the method is closed");
    }
}

