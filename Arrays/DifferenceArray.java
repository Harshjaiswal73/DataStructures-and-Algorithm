package Arrays;

import java.util.Scanner;

public class DifferenceArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int []a1 = new int[n1];
        for(int i=0;i<a1.length;i++){
            a1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[]a2= new int[n2];
        for(int i=0;i<a2.length;i++){
            a2[i]=sc.nextInt();
        }

        int[]differ = new int[n2];
        int c =0;

        int i =a1.length-1;
        int j =a2.length-1;
        int k=differ.length-1;

        while (k>=0) {
            int d =0;
            int a1v = i>=0?a1[i]:0;
            if(a2[j]+c >= a1v){
                d=a2[j]+c-a1v;
                c=0;
            }else{
                d=a2[j] + c + 10-a1v;
                c=-1;
            }
            differ[k] = d;
            i--;
            j--;
            k--;
        }
        int idx =0;
        while (idx <differ.length) {
            if(differ[idx] == 0){
                idx++;
            }else{
                break;
            }
        }
        while (idx <differ.length) {
            System.out.println(differ[idx]);
            idx++;
        }
    }
}
