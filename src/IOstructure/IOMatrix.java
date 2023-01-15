package IOstructure;
import java.util.*;
public class IOMatrix{    
    int mat[][];
    double dmat[][];
    char cmat[][];
    String smat[][];
    int i,j,ord;

    public int[][] read(int r, int c, int limit) {
        //var sc = new Scanner(System.in);
        var rand = new Random();
        mat = new int[r][c];
        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                //System.out.print("Enter Element["+(i+1)+"]["+(j+1)+"]: ");
                mat[i][j] = rand.nextInt(limit);
            }
        }
        return mat;
    }

    public double[][] read(int r, int c, double limit){
        var rand = new Random();
        dmat = new double[r][c];
        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                //System.out.print("Enter Element["+(i+1)+"]["+(j+1)+"]: ");
                dmat[i][j] = rand.nextDouble(limit);
            }
        }
        return dmat;
    }

    public int[][] read(int r, int c){
        var sc = new Scanner(System.in);
        mat = new int[r][c];
        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                //System.out.print("Enter Element["+(i+1)+"]["+(j+1)+"]: ");
                mat[i][j] = sc.nextInt();
            }
        }
        return mat;
    }

    public double[][] read(double x, int r, int c){
        var sc = new Scanner(System.in);
        dmat = new double[r][c];
        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                //System.out.print("Enter Element["+(i+1)+"]["+(j+1)+"]: ");
                dmat[i][j] = sc.nextDouble();
            }
        }
        return dmat;
    }

    public char[][] read(char ch, int r, int c)throws java.io.IOException{
        mat = new int[r][c];
        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                //System.out.print("Enter Element["+(i+1)+"]["+(j+1)+"]: ");
                cmat[i][j] = (char)System.in.read();
            }
        }
        return cmat;
    }

    public String[][] read(String str, int r, int c){
        var sc = new Scanner(System.in);
        mat = new int[r][c];
        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                //System.out.print("Enter Element["+(i+1)+"]["+(j+1)+"]: ");
                smat[i][j] = sc.nextLine();
            }
        }
        return smat;
    }

    public void display(double m[][]){
        int r = m.length;
        int c = m[0].length;
        int rsize = 0;
        int clen[] = new int[c];

        String str[][] = new String[r][c];
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                str[j][i] = Double.toString(m[j][i]);
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
}
