public class mf5 {
        
    public static void add(){
     int a=5;
     int b=5;
     System.out.println(a+b);
    }
    public static int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        add();                         
        System.out.println(add(10, 10));
    }
}