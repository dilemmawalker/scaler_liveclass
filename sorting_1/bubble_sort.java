import java.util.Scanner;
import java.io.*;
public class bubble_sort{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        //start
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n-i;j++){  //n-i reduces a little TC.
                int a=arr[j-1];
                int b=arr[j];
                if(a>b){
                    swap(j-1,j,arr);
                }
            }
        }
        //end
        print(arr);
    }
    public static void swap(int a,int b,int []arr){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        return;
    }
    public static void print(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}