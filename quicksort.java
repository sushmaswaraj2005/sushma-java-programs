import java.util.Arrays;
import java.util.Scanner;

class quicksort {
    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
    }
    public static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=(low-1);

        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("how many elements do we want:");
        int a=sc.nextInt();
        int[] arr=new int[a];
        System.out.println("enter" + a + "integers");
        for(int i=0;i<a;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter original array:");
        System.out.println(Arrays.toString(arr));
        quicksort(arr,0,a-1);
        System.out.println("sorted array:");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}