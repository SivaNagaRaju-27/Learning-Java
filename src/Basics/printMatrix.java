package Basics;

public class printMatrix {
    public void display(int m[][]){
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
}
