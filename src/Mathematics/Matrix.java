package Mathematics;
import java.util.*;

class ReadMatrix {
    int i,j,mat[][];
    int r,c,ord;
    int[][] read(char ch){
        var sc = new Scanner(System.in);
        if(ch == 'a'){
            System.out.print("Enter Number of Rows: "); 
            r = sc.nextInt();
            System.out.print("Enter Number of Columns: ");
            c = sc.nextInt();
        }else if(ch == 'c'){
            r = c;
            System.out.print("Enter column size for second Matrix: ");
            c = sc.nextInt();
        }else if(ch == 'd'){
            System.out.print("Enter the Order of Your Matrix: ");
            ord = sc.nextInt();
            r = c = ord;
        }
        mat = new int[r][c];
        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                System.out.print("Enter Element["+(i+1)+"]["+(j+1)+"]: ");
                mat[i][j] = sc.nextInt();
            }
        }
        return mat;
    }
}

public class Matrix {
    public static void main(String args[])throws java.io.IOException{
        char ch,ign;
        var mr = new ReadMatrix();
        var fn = new MatrixFunctions();
        var md = new MatrixDet();

        System.out.println("\t\t*****MENU*****\n");
        System.out.println("\t[1].Matrix Addition.");
        System.out.println("\t[2].Matrix Multiplication");
        System.out.println("\t[3].Det of Matrix.");
        System.out.println("\t[4].Read And Display Matrix: ");
        System.out.println("\t[q].Exit.");
        System.out.print("Choose Your Option: ");

        ch = (char)System.in.read();
        do {
            ign = (char)System.in.read();
        }while(ign != '\n');

        if(ch == '1'){
            int m1[][],m2[][],m[][];

            System.out.println("Create First Matrix...");
            m1 = mr.read('a');

            System.out.println("Create Second Matrix...");
            m2 = mr.read('b');

            m = fn.add(m1, m2);
            System.out.println("The Result of Matrix Additions is...");
            fn.display(m);
        }
        else if(ch == '2'){
            int m1[][],m2[][],m[][];

            System.out.println("Create First Matrix...");
            m1 = mr.read('a');
            System.out.println("Create Second Matrix...");
            m2 = mr.read('c');

            m = fn.multiply(m1, m2);
            System.out.println("The Result of Matrix Multiplications is...");
            fn.display(m);
        }
        else if(ch == '3'){
            int m[][],det;
            System.out.println("Create The Matrix...");
            m = mr.read('d');
            det = md.Det(m);
            System.out.println("The Det of The Matrix...");
            fn.display(m);
            System.out.println("is: "+det);
        }
        else if(ch == '4'){
            int m[][];
            System.out.println("Build Your Matrix...");
            m = mr.read('a');
            fn.display(m);
        }
    }
}