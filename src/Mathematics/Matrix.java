package Mathematics;
import Basics.*;

class aaplyMatrix{
    int[][][] mats;
    double[][][] dmats;
    String[][][] smats;

    void app()throws Exception{
        String opt1,opt2;
        int flag,halt = -1;
        matrixMenu mt = new matrixMenu();
        var fn = new MatrixFunctions();
        for(;;){
            opt1 = mt.functionMenu();
            switch(opt1){
                case "1": flag = -1;
                    while(flag == -1){
                        opt2 = mt.readMenu();
                        switch(opt2){
                            case "1": buildMatrix("int");
                            flag = 1;
                            break;
                            default : System.out.println("Choose Correct Option...");
                        }
                    }
                    fn.display(fn.add(mats[0], mats[1]));
                break;

                case "2": flag = -1;
                    while(flag == -1){
                        opt2 = mt.readMenu();
                        switch(opt2){
                            case "1": buildMatrix("int");
                            flag = 1;
                            break;
                            default : System.out.println("Choose Correct Option...");
                        }
                    }
                    fn.display(fn.subTract(mats[0], mats[1]));
                break;

                case "3": flag = -1;
                    while(flag == -1){
                        opt2 = mt.readMenu();
                        switch(opt2){
                            case "1": buildMatrix("int");
                            flag = 1;
                            break;
                            default : System.out.println("Choose Correct Option...");
                        }
                    }
                    fn.display(fn.multiply(mats[0], mats[1]));
                break;

                case "4": var cal = new MatrixDet();
                    flag = -1;
                    int det;
                    while(flag == -1){
                        opt2 = mt.readMenu();
                        switch(opt2){
                            case "1": buildMatrix("int");
                            flag = 1;
                            break;
                            default : System.out.println("Choose Correct Option...");
                        }
                    }
                    det = cal.Det(mats[0]);
                    System.out.println("The Det OF...");
                    fn.display(mats[0]);
                    System.out.println("is: "+det);
                break;

                case "q": halt = 1;
                break;
                default: System.out.println("Invalid Option...! Try Again...");
            }

            if(halt == 1){
                System.out.println("You Choose To Quit...! Thank You.");
                break;
            }
        }
    }

    void buildMatrix(String type)throws Exception{
        int i,j,n,limit;
        int[][] ord;
        String str;

        var ob1 = new read();
        initMatrix ob2[];
        var ob3 = new printMatrix();

        n = ob1.Readint("How many Matrices you want to build");
        
        ord = new int[n][2];
        mats = new int[n][][];
        ob2 = new initMatrix[n];

        for(i=0; i<n; i++){
            System.out.println("Building Matrix-["+(i+1)+"]...");
            for(j=0; j<2; j++){
                if(j == 1) str = "Row";
                else str = "column";
                ord[i][j] = ob1.Readint("Enter "+str+" Order Of Matrix");
            }
            ob2[i] = new initMatrix(ord[i][0], ord[i][1]);
            limit = ob1.Readint("Enter limit");
            mats[i] = ob2[i].build(limit);
        }

        for(i=0; i<n; i++){
            System.out.println("\nMatrix-["+ (i+1) +"]...");
            ob3.display(mats[i]);
        }
    }

    void doubleMatrix()throws Exception{
        int i,j,n;
        int[][] ord;
        String str;
        double limit;

        var ob1 = new read();
        initMatrix ob2[];
        var ob3 = new printMatrix();

        n = ob1.Readint("How many Matrices you want to build");
        
        ord = new int[n][2];
        dmats = new double[n][][];
        ob2 = new initMatrix[n];

        for(i=0; i<n; i++){
            System.out.println("Building Matrix-["+(i+1)+"]...");
            for(j=0; j<2; j++){
                if(j == 1) str = "Row";
                else str = "column";
                ord[i][j] = ob1.Readint("Enter "+str+" Order Of Matrix");
            }
            ob2[i] = new initMatrix(ord[i][0], ord[i][1]);
            limit = ob1.Readint("Enter limit");
            dmats[i] = ob2[i].build(limit);
        }

        for(i=0; i<n; i++){
            System.out.println("\nMatrix-["+ (i+1) +"]...");
            ob3.display(mats[i]);
        }
    }
}

public class Matrix {
    public static void main(String args[])throws Exception{
        var start = new aaplyMatrix();
        start.app();
    }
}