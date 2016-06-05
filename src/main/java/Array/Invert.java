package Array;

        import java.util.Arrays;


public class Invert {
    public static void main(String[] args) {
        int[]arr;
        arr = new int[]{0,1,2,3,4,5,6,7,8,9};
        System.out.print(Arrays.toString(arr)+ " ->");
        invert(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static  void invert (int[]arr){
        for(int k=0;k<arr.length/2;k++){
            int tmp=arr[k];
            arr[k]=arr[arr.length-k-1];
            arr[arr.length-k-1]=tmp;
        }
    }
}
