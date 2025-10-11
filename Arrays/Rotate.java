import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rotate{

    public static void reverse(int[]a,int i,int j){
        int li = i;
        int ri = j;
        while (li<ri) {
            int temp  =a[i];
            a[li]=a[ri];
            a[ri] = temp;

            li++;
            ri--;

        }
    }

    public static void rotate(int[]a,int k){
        k=k%a.length;
        if(k <0){
            k = k + a.length;
        }
        //part 1
        reverse(a, 0, a.length-k-1);
        //part 2
        reverse(a, a.length-k,a.length-1);

        //all 
        reverse(a, 0, a.length - 1);
    }

    public static void main(String[] args) throws Exception{
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

          int n = Integer.parseInt(br.readLine());
          int[] a = new int[n];
          for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(br.readLine());
          }
          int k = Integer.parseInt(br.readLine());

          rotate (a,k);
          display(a);
    }
}