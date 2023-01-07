package Mathematics;

public class MatrixFunctions {
    void display(int m[][]){
        int r = m.length;
        int c = m[0].length;
        int len[] = new int[c];

        String str[][] = new String[r][c];
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                str[j][i] = Integer.toString(m[j][i]);
                if(len[i] < str[j][i].length()){
                    len[i] = str[j][i].length();
                }
            }
        }

        System.out.println();
        for(int i=0; i<r; i++) {
        
            for(int j=0; j<c; j++) {

                if(j==0){
                    System.out.print("\t|");
                    if(str[i][j].length() < len[j]){
                        for(int l=str[i][j].length(); l<len[j]; l++){
                            System.out.print(" ");
                        }
                    }
                    System.out.print(m[i][j]+" ");
                }

                else if(j==m[i].length-1){
                    if(str[i][j].length() < len[j]){
                        for(int l=str[i][j].length(); l<len[j]; l++){
                            System.out.print(" ");
                        }
                    }
                    System.out.print(m[i][j]+"|");
                }

                else{
                    if(str[i][j].length() < len[j]){
                        for(int l=str[i][j].length(); l<len[j]; l++){
                            System.out.print(" ");
                        }
                    }
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