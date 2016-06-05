package Array.Sort;



import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
  /* int []arr0={1,2,3,4,5,6};
        int[]arr1={0,0,0,0,0,0,0,0};
        System.out.println("arr0:"+ Arrays.toString(arr0));
        System.out.println("arr1:"+Arrays.toString(arr1));

        System.arraycopy(arr0,1,arr1,2,3);
        System.out.println("arr0:"+Arrays.toString(arr1));*/

        /*int []arr={1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arr));
        System.arraycopy(arr,1,arr,3,3);
        System.out.println(Arrays.toString(arr));
*/
        int size = 5;
        int[]array = {20,30,40,50,60,0,0,0,0,0,0,0};
        System.out.println(Arrays.toString(array));
        int[]insert = {15,95,30};
        for (int newElem : insert){
            int newPosition = Arrays.binarySearch(array,0,size,newElem);
            if(newPosition<0){
                newPosition=-newPosition-1;
            }
            System.arraycopy(array,newPosition,array,newPosition+1,size-newPosition);
            array[newPosition]=newElem;
            System.out.println(Arrays.toString(array));
            size++;
        }

    }
}
