package ExceptionHandling;

public class Main {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        int a=5;
        int b=0;
        int c=0;
        try{
//             c=a/b;
//            System.out.println(c);
            division(a,b);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(Exception i){

        }
        finally {
//            System.out.println(c);
            System.out.println("Thi fs will always excused");
        }



    }
    static int division(int a,int b) throws ArithmeticException{
        if(b==0){
            throw  new ArithmeticException("plz don't division by zero");
        }

        return a/b;
    }

}
