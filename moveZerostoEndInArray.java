
import java.util.Scanner;

public class moveZerostoEndInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array elements:");
        String[] str = in.nextLine().split(" ");
        int arr[]=new int[str.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.parseInt(str[i]);
        }
        int end=arr.length;
        for (int i = 0; i < end; i++) {
            while(arr[i]==0){
                for (int j = i; j <=end-2; j++) {
                    arr [j]=arr[j+1];
                    if(j==(end-2)){
                        arr[j+1]=0;
                    }
                }
            end--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        in.close();
    }
    
}
