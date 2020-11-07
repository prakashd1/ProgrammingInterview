package ip.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr={4, 56, 98, 1, 45,78, 89,0, 67, 2};
        System.out.println("Before Sorting");
        for (int i:arr)
            System.out.print(i + " ");

        System.out.println();

        new SelectionSort().selectionSort(arr);
        System.out.println("After Sorting");
        for (int i:arr)
            System.out.print(i + " ");
    }
    public void selectionSort(int []arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++)
        {
            int mi = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[mi])
                    mi = j;
//            swap(arr[i], arr[min_idx]);
            int temp = arr[mi];
            arr[mi] = arr[i];
            arr[i] = temp;
        }
    }
    public void swap(int i, int j){
        int temp = i;
        i = j;
        j = temp;
    }
}
