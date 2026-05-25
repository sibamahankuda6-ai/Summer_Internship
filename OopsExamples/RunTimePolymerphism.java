package Summer_Internship.OopsExamples;

public class RunTimePolymerphism {
    public void oye() {
        System.out.println("oye kya halchal");
    }
}
class Overriding extends RunTimePolymerphism{
        public void oye(){
            System.out.println("sab thick");
        }

   public static void main(String[] args) {

       Overriding s = new Overriding();
        RunTimePolymerphism  o = new Overriding();//parent class referance hold child class

        s.oye();
        o.oye();
    }       
}    

