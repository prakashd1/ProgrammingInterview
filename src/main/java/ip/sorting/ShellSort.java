package ip.sorting;

public class ShellSort {
    int sort(int arr[])
    {
        int n = arr.length;
        for (int interval = n/2; interval > 0; interval /= 2)
        {
            System.out.println("------------------------------------");
            System.out.println("interval value=" + interval);
            for (int i = interval; i < n; i += 1)
            {
                System.out.println("Before i="+i);
                printArray(arr);
                int temp = arr[i];

                int j;
                for (j = i; j >= interval && arr[j - interval] > temp; j -= interval)
                    arr[j] = arr[j - interval];

                arr[j] = temp;
                System.out.println("After i="+i);
                printArray(arr);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[]={32,10,100,1};
        ShellSort s=new ShellSort();
        System.out.println("Before Sorting");
        s.printArray(arr);

        System.out.println();

        s.sort(arr);

        System.out.println("After Sorting");
        s.printArray(arr);

    }
    public void printArray(int []arr){
        for (int i:arr)
            System.out.print(i + " ");

        System.out.println();
    }
}
