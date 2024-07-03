package ExceptionHandling;

public class MainTwo {
    public static void main(String[] args) {
        try{
            String name="Tornob";
            if(name.equalsIgnoreCase("tornob")){
                throw new MyException("name is tornov");
            }
        }catch(MyException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("code run");
        }
    }
}
