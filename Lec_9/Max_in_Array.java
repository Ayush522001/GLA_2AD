package Lec_9;

public class Max_in_Array {
    public static void main(String[] args) {
        int arr[]={22,11,2,-10,13,14,45,16,19};
        max(arr);
    }
    public static void max(int arr[]){
        int max=arr[0];
        for(int i=1;i< arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
            max=Math.max(max,arr[i]);
        }
        System.out.println(max);
    }
}
