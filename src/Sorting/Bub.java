package Sorting;

public class Bub {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 2, 1, 4};

        int i;
        for(i = 0; i < arr.length - 1; ++i) {
            for(int j = i + 1; j < arr.length; ++j) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for(i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
        int MaxNumber= arr[arr.length-1]+arr[arr.length-2];
        System.out.println("Maxnumber :"+MaxNumber);

    }
}
