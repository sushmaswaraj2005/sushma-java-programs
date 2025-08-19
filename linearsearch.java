class LinearSearch {
    public static int linearSearch(int[] arr, int a) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return i; // Element found at index i
            }
        }
        return 3; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 7, 5};
        int a= 4;
        int result = linearSearch(arr,a);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}