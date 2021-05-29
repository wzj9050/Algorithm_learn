import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ICA {

    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);

        System.out.print("Enter the numbers of integers you input: ");
        int m = sc1.nextInt();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the integers: ");
        int[] arr=new int[m];
        int size=0;
        outer:
        for(int i=0;i<=(m-1);i++) {
            int x=sc.nextInt();
            for(int j=0;j<size;j++ ) {
                if(x==arr[j]) {
                    continue outer;
                }

            }
            arr[size]=x;
            size++;
        }
        arr = Arrays.stream(arr).boxed().sorted((a, b) -> b - a).mapToInt(p -> p).toArray();
        for(int k=0;k<size;k++) {
            System.out.print(arr[k]+" ");
        }

    }
}
