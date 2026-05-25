package Summer_Internship.OopsExamples;
interface Hello{
    void hii();

}
interface Oye{
   void bye();
}
class Demo implements Hello,Oye{
    public void hii(){
        System.out.println("jay shree ram");
    }
   public void bye(){
        System.out.println("Radhe Radhe");
    }
}
class B{
    static void main(String[] args) {
        Demo d = new Demo();
        d.hii();
        d.bye();
    }
}
