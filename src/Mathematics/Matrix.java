package Mathematics;
import Basics.*;

class applyMatrix{
    int[][][] mats;
    double[][][] dmats;
    String[][][] smats;
    int[][] ord;
    String opt1,opt2,opt3;

    void app()throws Exception{
        int halt = -1;
        matrixMenu mt = new matrixMenu();
        var fn = new MatrixFunctions();
        for(;;){
            opt1 = mt.functionMenu();
            switch(opt1){
                case "1": 
                    opt2 = mt.typeMenu();
                    opt3 = mt.readMenu();
                    buildMatrix(opt2,Integer.parseInt(opt1),Integer.parseInt(opt3));
                    fn.add(mats[0], mats[1]);
                break;

                case "2": 
                    opt2 = mt.typeMenu();
                    opt3 = mt.readMenu();
                    buildMatrix(opt2,Integer.parseInt(opt1),Integer.parseInt(opt3));
                    fn.subTract(mats[0], mats[1]);
                break;

                case "3": 
                    opt2 = mt.typeMenu();
                    opt3 = mt.readMenu();
                    buildMatrix(opt2,Integer.parseInt(opt1),Integer.parseInt(opt3));
                    fn.multiply(mats[0], mats[1]);
                break;

                case "4": var cal = new MatrixDet();
                    int det;
                    opt2 = mt.typeMenu();
                    opt3 = mt.readMenu();
                    buildMatrix(opt2,Integer.parseInt(opt1),Integer.parseInt(opt3));
                    det = cal.Det(mats[0]);
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
    
    void buildMatrix(String type, int fun, int var)throws Exception{
        int i,j,n,limit=1000;
        int[][] ord;
        String str;

        var ob1 = new read();
        initMatrix ob2[];
        var ob3 = new MatrixFunctions();

        if(fun != 4){
            n = ob1.Readint("How many Matrices you want to build");
        }
        else n = 1;
        
        ord = new int[n][2];
        mats = new int[n][][];
        dmats = new double[n][][];
        smats = new String[n][][];
        ob2 = new initMatrix[n];

        for(i=0; i<n; i++){
            System.out.println("\nBuilding Matrix-["+(i+1)+"]...");
            if(fun != 4){
                for(j=0; j<2; j++){
                    if(j == 0) str = "Row";
                    else str = "column";
                    ord[i][j] = ob1.Readint("Enter "+str+" Order Of Matrix");
                }
            }else{
                ord[i][0] = ord[i][1] = ob1.Readint("Enter Order Of Matrix");
            }
            ob2[i] = new initMatrix(ord[i][0], ord[i][1]);
            limit = ob1.Readint("Enter limit");
            if(var == 1){
                switch(type){
                    case "int": mats[i] = ob2[i].build(limit);
                    break;
                    case "double": double dlimit = limit;
                        dmats[i] = ob2[i].build(dlimit);
                    break;
                    case "string": System.out.println("Can't Create Random Strings...! Choose Manual Creation.");
                    break;
                    default: System.out.println("Invali Type of Matrix...");
                }
            }else{
                switch(type){
                    case "int": mats[i] = ob2[i].read();
                    break;
                    case "double": dmats[i] = ob2[i].read(0.0);
                    break;
                    case "string": 
                    break;
                    default: System.out.println("Invali Type of Matrix...");
                }
            }
        }

        for(i=0; i<n; i++){
            System.out.println("\nMatrix-["+ (i+1) +"]...");
            ob3.display();
        }
    }
}

public class Matrix {
    public static void main(String args[])throws Exception{
        var start = new applyMatrix();
        start.app();
    }
}