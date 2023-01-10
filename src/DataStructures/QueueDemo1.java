package DataStructures;

import java.util.*;

class Queue {
    private int q[];
    private int getloc, putloc;

    Queue(int size) {
        q = new int[size];
        getloc = putloc = 0;
    }

    void put(int x){
        if(putloc == q.length) {
            System.out.println(" -- Queue is full...! Can't put this value into Queue.");
            return;
        }
        if(putloc == q.length-1){
            System.out.println(" -- Queue is full...");
        }
        q[putloc++] = x;
    }

    int get(){
        int temp;
        if(getloc >= putloc) {
            System.out.println(" -- Queue is empty...");
            getloc = putloc = 0;
            return -99999;
        }
        temp = q[getloc];
        q[getloc] = 0;
        getloc++;
        return temp;
    }
}

public class QueueDemo1 {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n,op;
            System.out.print("Enter Size of the Queue: ");
            n = sc.nextInt();
            Queue q = new Queue(n);

            System.out.println("\t\t****MENU*****");
            System.out.println("\t[1].Put into Queue.");
            System.out.println("\t[2].Get from Queue.");
            System.out.println("\t[3].Get Entire Queue.");
            System.out.println("\t[9].To Quit.");

            

            for( ; ; ){
                System.out.print("Enter Your Option: ");
                op = sc.nextInt();
                switch(op){
                    case 1: System.out.print("Enter a Number: ");
                            int x = sc.nextInt();
                            q.put(x);
                            System.out.println();
                    break;

                    case 2: int y = q.get();
                            if(y != -99999) System.out.println("The Next Element is: "+y);
                            System.out.println();
                    break;

                    case 3: 
                            int z;
                            System.out.print("The Array contents are: ");
                            for(; ; ){
                                z = q.get();
                                if(z != -99999) System.out.print(z+" ");
                                else break;
                            }
                            System.out.println();
                    break;
                }
                if(op == 9){
                    break;
                }
            }
        }
    }
}
