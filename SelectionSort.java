public class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {7,6,5,2,9,8,4,1,3};
        System.out.println("Before swap:");
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
        selectionSort(arr);
        System.out.println("After swap:");
        for(int i:arr)
            System.out.print(i+" ");        
    }

    public  static void selectionSort(int[] arr) {
        int minIndex=-1;
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            minIndex=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minIndex]>arr[j])
                    minIndex=j;
            }
            temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
            for(int i1:arr)
                System.out.print(i1+" "); 
            System.out.println();
        }
    }
}
