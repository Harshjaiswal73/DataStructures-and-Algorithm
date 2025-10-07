import java.util.Scanner;

public class confression {

    public static String conpression1(String str){
        String s = str.charAt(0)+"";

        for(int i=1;i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

            if(curr!=prev){
                s+=curr;
            }
        }
        return s;
    }

    public static String conpression2(String str) {

        String s = str.charAt(0)+ " ";
        int count =1;
        for(int i=1;i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

            if(curr == prev){
                count++;
            }else{
                if (count >1) {
                    s+=count;
                }
                s+=curr;
            }
        }
        if(count > 1){
            s+=count;
            count =1;
        }

        return s;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(conpression1(str));
        System.out.println(conpression2(str));
    }
}
