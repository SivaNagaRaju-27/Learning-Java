package Mathematics;

public class MatrixFunctions {
    void display(int m[][]){
        int i,j;
        System.out.println();
        for(i=0; i<m.length; i++) {
            for(j=0; j<m[i].length; j++) {
                if(j==0){
                    System.out.print("\t|  "+m[i][j]+" ");
                }else if(j==m[i].length-1){
                    System.out.print(m[i][j]+"  |");
                }else{
                    System.out.print(m[i][j]+" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    int[][] add(int m1[][], int m2[][]){
        int i,j,m[][];
        m = new int[m1.length][m1[0].length];
        for(i=0; i<m1.length; i++){
            for(j=0; j<m1[i].length; j++){
                m[i][j] = m1[i][j]+m2[i][j];
            }
        }
        return m;
    }

    int[][] multiply(int m1[][], int m2[][]) {
        int i,j,k,m[][];
        int r,c,x;
        r = m1.length;
        c = m2[0].length;
        x = m2.length;
        m = new int[r][c];
        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                for(k=0; k<x; k++){
                    m[i][j] += m1[i][k]*m2[k][j];
                }
            }
        }
        return m;
    }
}