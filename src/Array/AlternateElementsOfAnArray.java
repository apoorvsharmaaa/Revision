package Array;

public class AlternateElementsOfAnArray {
    public static void main(String[] args) {
        int n=4;
        int A[] = {1,2,3,4};
        print(A,n);
    }
    public static void print(int arr[],int n){

        for(int i =0 ; i <n ; i++){
            if(i%2==0){
                System.out.print(arr[i] +" ");
            }
        }
    }
}