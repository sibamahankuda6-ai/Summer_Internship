package Summer_Internship.OopsExamples;

public class Encapsulation {
    private int id;
    private String name;
    public void setid(int id){
        this.id = id;
    }
    public int getid(){
        return id;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }

    static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setid(101);
        e.setname("mahadev");
        System.out.println("id =" + e.getid());
        System.out.println("name = " + e.getname());
    }
}
