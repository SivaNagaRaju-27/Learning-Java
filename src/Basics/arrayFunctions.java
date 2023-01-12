package Basics;

import java.util.*;

public class arrayFunctions {

    public int[] readRandom(){
        int ar[],n,i;
        Random rand = new Random();
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter size of the List: ");
            n = sc.nextInt();
        }
        
        ar = new int[n];
        for(i=0; i<n; i++){
            ar[i] = rand.nextInt(10000);
        }

        return ar;
    }

    public int[] read(){
        int ar[],n,i;
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter size of the List: ");
            n = sc.nextInt();
            ar = new int[n];
            for(i=0; i<n; i++){
                System.out.print("Enter Element-["+(i+1)+"]: ");
                ar[i] = sc.nextInt();
            }
        }
        return ar;
    }

    public void show(int ar[], int n){
        int i = 0;
        System.out.print("List = [");
        while(i < n){
            if(i < n-1) System.out.print(ar[i]+",");
            else System.out.println(ar[i]+"]"); 
            i++;             
        }
    }
}
