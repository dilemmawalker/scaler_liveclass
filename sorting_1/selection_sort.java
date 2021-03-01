import java.util.Scanner;
import java.io.*;
public class selection_sort{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        for(int i=0;i<n-1;i++){
            int curr=arr[i];
            int sw=Integer.MAX_VALUE;
            int p=-1;
            for(int j=i+1;j<n;j++){
               if(arr[j]<sw){
                   p=j;
                   sw=arr[j];
               }
            }
            swap(i,p,arr);
        }
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