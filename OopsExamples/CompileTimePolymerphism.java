package Summer_Internship.OopsExamples;

public class CompileTimePolymerphism {
    public void hello(){
        System.out.println("hii i am siba");
    }
    public void hello(int a){
        System.out.println(" hello guys");
    }
    public void hello(int a,double b){
        System.out.println(" Radhe Radhe");
    }

    static void main(String[] args) {
        CompileTimePolymerphism c = new CompileTimePolymerphism();
        c.hello(2,4.50);
        c.hello();
    }

}
