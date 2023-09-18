package Lec_9;

public class Reverse_Array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("============>");
//        reverse(arr);
        reverse2(arr);
    }
    public static void reverse(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+"  ");
        }
    }
    public static void reverse2(int arr[]){
        int narr[]=new int[arr.length];
        for(int i= arr.length-1;i>=0;i--){
            narr[i]=arr[arr.length-1-i];
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(narr[i]+"  ");
        }
    }
}
