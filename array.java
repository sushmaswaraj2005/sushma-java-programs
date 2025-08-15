import java.util.Arrays;

class ArrayOperations{
    public static void main(String[]args){
        int[] arr = {10,20,13,40,38};
        // 1. Accessing
        System.out.println("Accessing elements:");
        System.out.println("Element at index 0: " + arr[0]);
        System.out.println("Element at index 3: " + arr[3]);
        //insertion
        int num=12;
        int pos=2;
        int [] newarr=new int[arr.length+1];
        for(int i=0;i<pos;i++){
            newarr[i]=arr[i];
        }
        newarr[pos]=num;
        for(int i=pos;i<arr.length;i++){
            newarr[i+1]=arr[i];
        }
        arr=newarr;
        System.out.println("insertion");
        System.out.println("array to element" + num + "at index" +pos +":"+ Arrays.toString(arr) );
        //deletion
        int del=10;
        if(del >=0 && del<arr.length){
            int [] tempArr=new int[arr.length-1];
            for(int i=0,j=0;i<arr.length;i++){
                if(i!=del){
                    tempArr[j++]=arr[i];
                }
            }
            arr=tempArr;
            System.out.println("deletion");
            System.out.println("delete" + del + ":" + Arrays.toString(arr));
        }
        else{
            System.out.println("not valid");
            //searching
            int key = 10;
            int fIndex = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    fIndex = i;
                    break;
                }
            }
            if (fIndex != -1) {
                System.out.println("\nSearching:");
                System.out.println(key + " found at index: " + fIndex);
            } else {
                System.out.println("\nSearching:");
                System.out.println(key + " not found in the array.");
            }

            //Sorting
            System.out.println("\nSorting:");
            System.out.println("Original array: " + Arrays.toString(arr));
            Arrays.sort(arr);
            System.out.println("Sorted array: " + Arrays.toString(arr));

        }
    }
}