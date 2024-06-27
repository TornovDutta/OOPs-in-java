package into;

public class Main {
        static class Human{
            int leg;
            String name;
            Human(){

            }
            Human(int leg){
                this.leg=leg;
            }
            Human(int leg ,String name){
                this.leg=leg;
                this.name=name;
            }

        }
        public static void main(String[] args) {
            Human h1 = new Human();
            h1.leg=2;
            System.out.println(h1.name);

            h1.name="Tornov";
            System.out.println(h1.name);

            Human h2=new Human(12);
            System.out.println(h2.leg);
            Human h3=new Human(1,"kaliya");
            System.out.println(h3.leg+" "+h3.name);

        }
}
