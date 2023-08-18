public class demo84{
    public static void main(String[] args) {
        int[] input1 = {1, 4, 6, 8, 4, 60, 2, 50};
        int[] input2 = {56, 25, 2, 5, 60, 20, 50};
        int[] input3 = {45, 67, 4, 2, 5, 6, 2, 50, 60};
        int[] input4 = {50, 60};

        Sort(input1);
        Sort(input2);
        Sort(input3);
        int[] commonElements = findCommonElements(input1, input2, input3);

 System.out.print("Sorted1");
        printArray(input1);
        System.out.print("Sorted2");
        printArray(input2);
        System.out.print("Sorte3");
        printArray(input3);
}
public static void Sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
}
public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}