/*
How to find the missing number in a given Array from number 1 to 100 ?
*/
import java.util.Arrays;
class P15{
    public static void main(String args[]){

        int arr[] = new int[100];
        int length= arr.length;

        for(int i=0; i<length; i++){
            arr[i] = i+1;
        }

        arr[54] = 0;
        System.out.println(Arrays.toString(arr));

        int sumOFFirst100NaturalNos = 5050;
        int sumOfArr = 0;
        for(int i=0; i<arr.length; i++){
            sumOfArr += arr[i];
        }

        System.out.println("Missing number is: "+(sumOFFirst100NaturalNos-sumOfArr));
    }
}