package Mathematics;

public class MatrixDet {
    int Det(int m[][]){
        int det = 0,subdet,j;
        int ord = m.length;

        if(ord == 1){
            return m[0][0];
        }else{
            for(j=0; j<ord; j++){
                subdet = subDet(m,j);
                if(j%2 == 0){
                    det += m[0][j]*subdet;
                }else{
                    det -= m[0][j]*subdet;
                }
            }
            return det;
        }
    }

    int subDet(int m[][],int c){
        int subdet=0,m1[][],ord;
        int i,j,r1=0,c1=0;
        ord = m.length-1;

        m1 = new int[ord][ord];
        for(i=1; i<=ord; i++){
            c1 = 0;
            for(j=0; j<=ord; j++){
                if(j!=c){
                    m1[r1][c1] = m[i][j];
                    c1++;
                }
            }
            r1++;
        }
        subdet = Det(m1);
        return subdet;
    }
}