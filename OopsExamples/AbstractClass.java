package Summer_Internship.OopsExamples;

public  abstract class AbstractClass {
    abstract void hello();
    public void hii(){
        System.out.println("hello guys");
    }

}
class Child extends AbstractClass{
    void hello(){
        System.out.println(" har har mahadev");
    }

    static void main(String[] args) {
        Child c = new Child();
        c.hii();
        c.hello();
    }
}
