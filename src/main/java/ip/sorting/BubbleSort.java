package ip.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr={4, 56, 98, 1, 45,78, 89,0, 67, 2};
        System.out.println("Before Sorting");
        for (int i:arr)
        System.out.print(i + " ");

        System.out.println();

        new BubbleSort().bubbleSort(arr);
        System.out.println("After Sorting");
        for (int i:arr)
            System.out.print(i + " ");
    }

    public void bubbleSort(int []arr){
        int n=arr.length-1;
        for (int i=0;i<n;i++){
            for(int j=0;j< n-i;j++){
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }
}
