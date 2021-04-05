import java.util.Scanner;
public class binary_search{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){

        int[]arr={3,6,8,12,14,19,20,23,25,27};
        int no=12;
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==no){
                System.out.println(mid+1);
                break;
            }
            if(no<arr[mid])
            h=mid-1;
            else
            l=mid+1;
        }
//
    }
}