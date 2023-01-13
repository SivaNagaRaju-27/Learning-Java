package Mathematics;

public class MatrixFunctions {
    void display(int m[][]){
        int r = m.length;
        int c = m[0].length;
        int rsize = 0;
        int clen[] = new int[c];

        String str[][] = new String[r][c];
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                str[j][i] = Integer.toString(m[j][i]);
                if(clen[i] < str[j][i].length()){
                    clen[i] = str[j][i].length();
                }
            }
            rsize += clen[i];
        }

        System.out.print("    *");
        for(int i=0; i<rsize+c+2; i++){
            if((rsize+c+1)%2 == 0){
                if(i==(rsize+c+1)/2-3){
                    System.out.print("MATRIX");
                    i += 5;
                }
                else System.out.print("*");            
            }else{
                if(i==(rsize+c+1)/2-3){
                    System.out.print("MAT-RIX");
                    i += 6;
                }
                else System.out.print("*");
            }
        }
        System.out.println();

        for(int i=0; i<r; i++) {
        
            for(int j=0; j<c; j++) {

                if(j==0){
                    System.out.print("     |");
                    if(str[i][j].length() < clen[j]){
                        for(int l=str[i][j].length(); l<clen[j]; l++){
                            System.out.print(" ");
                        }
                    }
                    System.out.print(m[i][j]+" ");
                }

                else if(j==m[i].length-1){
                    if(str[i][j].length() < clen[j]){
                        for(int l=str[i][j].length(); l<clen[j]; l++){
                            System.out.print(" ");
                        }
                    }
                    System.out.print(m[i][j]+"|");
                }

                else{
                    if(str[i][j].length() < clen[j]){
                        for(int l=str[i][j].length(); l<clen[j]; l++){
                            System.out.print(" ");
                        }
                    }
                    System.out.print(m[i][j]+" ");
                }

                if(m[0].length == 1) System.out.print("\b|");
            }
            System.out.println();
        }
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