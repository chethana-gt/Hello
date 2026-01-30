public class mf6 {

    public static int add(int a,int b){
        int  result=a+b;
        return result;
    }
    public static int add(int a, int b,int c) {
          int  result=a+b+c;
        return result;
    }

    public static void main(String[] args) {                              
        int res=add(10,20);                        
        int result=add(10,20,30);

        System.out.println(res);    
        System.out.println(result);
    }
}
    

