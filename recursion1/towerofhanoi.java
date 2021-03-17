import java.util.Scanner;
public class towerofhanoi{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
       ArrayList<Integer>arra=new ArrayList<>();
       ArrayList<Integer>arrb=new ArrayList<>();
       ArrayList<Integer>arrc=new ArrayList<>();

        arra.add(1);
        arra.add(2);
        arra.add(3);
        int n=arra.size();
        char a='a';
        char b='b';
        char c='c';
        solve(arra,arrb,a,b,1,n-1);
        
        solve(arr,a,c,0,n-1);
        solve(arr,b,c,0,n-1);
    }
    public static void solve(ArrayList<Integer>arra,ArrayList<Integer>arrb,int a,int b,int si,int ei){

        if(arra.size()==1){


        }

        int a=arra.remove()
        solve()
    }
}