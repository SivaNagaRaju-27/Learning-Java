package Basics;
import java.util.*;
public class initMatrix {
    int r,c;
    int mat[][];
    double dmat[][];
    String smat[][];
    public initMatrix(int x, int y){
        r = x;
        c = y;
    }

    public int[][] build(int limit){
        int i,j;
        var rand = new Random();
        mat = new int[r][c];
        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                mat[i][j] = rand.nextInt(limit);
            }
        }
        return mat;
    }

    public double[][] build(double limit){
        int i,j;
        var rand = new Random();
        dmat = new double[r][c];
        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                dmat[i][j] = rand.nextDouble(limit);
            }
        }
        return dmat;
    }

    public int[][] read(){
        int i,j;
        var sc = new Scanner(System.in);
        mat = new int[r][c];
        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                System.out.print("Enter Element["+(i+1)+"]["+(j+1)+"]: ");
                mat[i][j] = sc.nextInt();
            }
        }
        return mat;
    }

    public double[][] read(double x){
        int i,j;
        var sc = new Scanner(System.in);
        dmat = new double[r][c];
        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                System.out.print("Enter Element["+(i+1)+"]["+(j+1)+"]: ");
                dmat[i][j] = sc.nextDouble();
            }
        }
        return dmat;
    }

}
