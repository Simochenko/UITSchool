package BasicDesign;

import java.util.Scanner;

public class OneDimArray {
    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int n;

    System.out.println("Введите количество элементов  :");
    n=s.nextInt();

    int[] oneDimArray = new int[n];
    int i;

    for (i=0; i<n; i++){
        oneDimArray[i]=(int)(Math.random()*100);
    }
        straightArr(oneDimArray);
        System.out.println();
        reverseArr(oneDimArray);
        System.out.println();
        evenElem(oneDimArray);
        System.out.println();
        notEvenElem(oneDimArray);
        System.out.println();
        sumMultiple7(oneDimArray);
        System.out.println();
        multiplication3(oneDimArray);

}

    public static void straightArr(int [] arr){
        int i;
        for (i=0; i<arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public static void reverseArr(int [] arr){
        int i;
        for (i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+"\t");
        }
    }



    public static void evenElem(int [] arr){
        int i;
        System.out.print("Четные элементы массива: ");
        for (i=0; i<arr.length; i++){
            if (arr[i]%2!=0){
                continue;
            }

            System.out.print(arr[i]+" ");
        }
    }

    public static void notEvenElem(int [] arr){
        int i;
        System.out.print("Нечетный элемент массива: ");
        for (i=0; i<arr.length; i++){
            if (arr[i]%2==0){
                continue;
            }
            System.out.print(arr[i]+" ");
        }
    }

    public static void sumMultiple7(int [] arr){
        int i, sum=0;
        for (i=0; i<arr.length; i++){
            if (arr[i]%7==0){
                sum+=arr[i];
            }
        }
        System.out.println("Сумма элементов кратных 7 : "+sum);
    }

    public static void multiplication3(int [] arr){
        int i, multiplic=1;
        for (i=0; i<arr.length; i++){
            if (arr[i]%3==0 && arr[i]!=0){
                multiplic*=arr[i];
            }
        }
        System.out.println("Произведение элементов кратных 3 : "+multiplic);
    }

}

