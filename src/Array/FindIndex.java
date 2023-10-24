package Array;

public class FindIndex {
    public static void main(String[] args) {
        int N = 6;
        int arr[] = {1, 2, 3, 4, 5, 5};
        int Key = 5;
        System.out.println(findIndex(arr, N, Key));
    }

    public static int[] findIndex(int[] arr, int n, int key) {

        int[] resultArr = {-1, -1};
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                if (resultArr[0] == -1) {
                    resultArr[0] = i;
                    resultArr[1] = i;
                } else {
                    resultArr[1] = i;
                }
            }
        }
        return resultArr;
    }
}

