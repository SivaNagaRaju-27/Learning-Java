package IOstructure;

import java.util.*;
public class readMatrix {    
    int mat[][];
    double m[][];
    int i,j,r,c,ord;

    public int[][] read(int random) {
        //var sc = new Scanner(System.in);
        var rand = new Random();
        mat = new int[r][c];
        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                System.out.print("Enter Element["+(i+1)+"]["+(j+1)+"]: ");
                mat[i][j] = rand.nextInt(random);
            }
        }
        return mat;
    }

    public double[][] read(double random){
        var rand = new Random();
        mat = new int[r][c];
        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                System.out.print("Enter Element["+(i+1)+"]["+(j+1)+"]: ");
                m[i][j] = rand.nextDouble(random);
            }
        }
        return m;
    }

    public int[][] read(char ch){
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
