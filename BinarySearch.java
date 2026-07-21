
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        //int arr[] = {83,4,2,8,45,3,5,6,22,45};
        int arr[]= new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(100*Math.random());
        }
        Arrays.sort(arr);
        int elem=8;
        int id=binarySearch(arr,elem);
        if(id!=-1){
            System.out.println("Binary Search");
            System.out.println(elem+" is found at "+id);
        }else{
            System.out.println("Element is not found!");
        }
        int id1=linearSearch(arr,elem);
        if(id1!=-1){
            System.out.println("Linear Search");
            System.out.println(elem+" is found at "+id1);
        }else{
            System.out.println("Element is not found!");
        }
    }

    public  static int linearSearch(int[] arr, int elem) {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==elem){ 
                  return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int elem) {
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==elem){
                return mid;
            }else if(arr[mid]<elem){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        // if(left<=right){
        //     int mid=(left+right)/2;
        //     if(arr[mid]==elem){
        //         return mid;
        //     }else if(arr[mid]<elem){
        //         return binarySearch(arr,elem,mid+1,right);
        //     }else{
        //         return binarySearch(arr,elem,left,mid-1);
        //     }
        // }
        return -1;
    }
}
