package Lec_8;

public class Arrays_demo {
    public static void main(String[] args) {
        int arr[]=new int[5];
        System.out.println(arr);
        arr[2]=2;
        arr[0]=0;
        arr[1]=1;
        arr[3]=3;
        arr[4]=4;
//        System.out.print(arr[0]+" ");
//        System.out.print(arr[1]+" ");
//        System.out.print(arr[2]+" ");
//        System.out.print(arr[3]+" ");
//        System.out.print(arr[4]+" ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
