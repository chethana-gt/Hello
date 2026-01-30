public class student {
    int id;
    String name;
    student(int i,String name){
        
        id=i;
        this.name=name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}

class main{
    public static void main(String[] args){
        student s1=new student(1,"chethana");
        student s2=new student(2,"nirma");
        s1.display();
        s2.display();
    }
}
