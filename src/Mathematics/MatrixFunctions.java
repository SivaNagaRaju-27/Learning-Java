package Mathematics;

public class MatrixFunctions extends applyMatrix{
    void display(){
        int r = 0,c = 0,z = 0;
        String[][] str;
        for(int a = 0; a<2; a++){
            switch(opt2){
                case "int": 
                    r = mats[a].length;
                    c = mats[a][0].length;
                break;
                case "double":
                    r = dmats[a].length;
                    c = dmats[a][0].length;
                break;
                case "string":
                    r = smats[a].length;
                    c = smats[a][0].length;
                break;
            }
            int rsize = 0;
            int clen[] = new int[c];
    
            if(opt2 != "string"){
                str = new String[r][c];
            }else{
                str = smats[a];
            }

            for(int i=0; i<c; i++){
                for(int j=0; j<r; j++){
                    
                    if(opt2 == "int") str[j][i] = Integer.toString(mats[a][j][i]);
                    if(opt2 == "double") str[j][i] = Double.toString(dmats[a][j][i]);

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

                        if(opt2 == "int"){
                            System.out.print(mats[a][i][j]+" ");
                            z = mats[a][i].length;
                        }
                        else if(opt2 == "double"){
                            System.out.print(dmats[a][i][j]+" ");
                            z = dmats[a][i].length;
                        }
                        else{
                            System.out.print(smats[a][i][j]+" ");
                            z = smats[a][i].length;
                        }
                    }
    
                    else if(j==z-1){
                        if(str[i][j].length() < clen[j]){
                            for(int l=str[i][j].length(); l<clen[j]; l++){
                                System.out.print(" ");
                            }
                        }
                        if(opt2 == "int")System.out.print(mats[a][i][j]+"|");
                        else if(opt2 == "double")System.out.print(dmats[a][i][j]+"|");
                        else System.out.print(smats[a][i][j]+"|");
                    }
    
                    else{
                        if(str[i][j].length() < clen[j]){
                            for(int l=str[i][j].length(); l<clen[j]; l++){
                                System.out.print(" ");
                            }
                        }
                        if(opt2 == "int"){
                            System.out.print(mats[a][i][j]+" ");
                            z = mats[a][0].length;
                        }
                        else if(opt2 == "double"){
                            System.out.print(dmats[a][i][j]+" ");
                            z = dmats[a][0].length;
                        }
                        else{
                            System.out.print(smats[a][i][j]+" ");
                            z = smats[a][0].length;
                        }
                    }
    
                    if(z == 1) System.out.print("\b|");
                }
                System.out.println();
            }
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

    int[][] subTract(int m1[][], int m2[][]){
        int i,j,m[][];
        m = new int[m1.length][m1[0].length];
        for(i=0; i<m1.length; i++){
            for(j=0; j<m1[i].length; j++){
                m[i][j] = m1[i][j]-m2[i][j];
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