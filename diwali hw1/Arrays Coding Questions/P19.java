/*
Write a program to sum all the values of a given Array in java?
*/

class P19{
    public static void main(String args[]){

        int arr[] = {1,2,3,4,5,6,7};
        int sum = 0;
        for(int i=0; i<arr.length; i++)
            sum += arr[i];

        System.out.println(sum);
    }
}