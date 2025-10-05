import java.util.Scanner;

public class Main{
    public static void main(String []args){
       Scanner sc = new Scanner(System.in);
    //    String s1 = sc.nextLine();
    //    String s2 = sc.next();
    //    //String s1 = "hello";
    //    System.out.println(s1);

    String s =sc.nextLine();
    System.out.println(s);
    System.out.println(s.length());

    for(int i=0;i< s.length();i++){
        char ch = s.charAt(i);
        System.out.println(ch);
    }

    }
}