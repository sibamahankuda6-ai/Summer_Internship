package Summer_Internship.OopsExamples;

public class Inheritance {
    void hello() {
        System.out.println("hello guys");
    }
}
 class Car extends Inheritance {
     void bmw() {
         System.out.println("what a nice car");
     }
 }
 class Scooty extends Inheritance {
     void activa()

     {
         System.out.println("what a nice scooty");
     }
 }
   class Demo{
       static void main(String[] args) {
           Car c = new Car();
           Scooty s = new Scooty();
           c.hello();
           c.bmw();
           s.hello();
           s.activa();
       }

}
