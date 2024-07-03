package Collection;

public class Enums {
    enum week implements A{
        Monday,Tuesday,wednesday,Thursday,friday,saturday;
        //public,static,final
        //can't creat child class
        //type is week
        //these are enum constant

        week() {
            //this is not public and protected


            System.out.println("call for "+this.toString());
        }

        @Override
        public void hello() {
            System.out.println("hello ");
        }

        //public static final week day=new week(); f
    }

    public static void main(String[] args) {
        week d=week.Monday;
        d.hello();
//        for f(week day:week.values()){
//            System.out.println(day);
//        }
    }
}
