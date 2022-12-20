package DeletingArray.DeletingEndElementArray;

public class DeletingEndArray {
    public static int delet(int arr[]) {
        int number = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            arr[number] = i;
            number++;
        }
        return number;
    }

    public static void main(String[] args) {
        int arr[] = new int[6];
        System.out.println(delet(arr));
        ;
    }
}
