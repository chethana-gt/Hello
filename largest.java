import java.util.Scanner;

public class largest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the value of a: "); 
        int a=sc.nextInt();
       System.out.println("enter the value of b: ");
        int b=sc.nextInt();
        String result;
        result = (a>b)?"true":"false";
            System.out.println("a is greater than b: "+result);
        result = (b>a)?"true":"false";
            System.out.println("b is greater than a: "+result);
            
        }
        }
    

