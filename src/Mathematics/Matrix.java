package Mathematics;
import IOstructure.IOMatrix;
public class Matrix extends IOMatrix{
    int[][] mat;
    double[][] dmat;
    char[][] cmat;
    String[][] smat;
    int r,c,ord,opt;

    void buildMatrix()throws Exception{
        var menu = new matrixMenu();

        opt = menu.readMenu();
    
        switch(opt) {
            case 1: 
                    int flag = -1;
                    String str = menu.typeMenu();
                    int limit = menu.input();
                    while(flag == -1){
                        switch(str){
                            case "int": mat = read(r,c,limit);
                                        flag = 1;
                            break;
                            case "double": dmat = read(r,c,(double)limit);
                                        flag = 1;
                            break;
                            default: 
                                    if(str == "char" | str == "string" | str == "boolean"){
                                        System.out.println("Cannot Generate Random Values of Type "+str);
                                    }else{
                                        System.out.println("Invalid Data Type-("+str+")! Retry....");
                                    }
                        }
                    }
            break;
            case 2: 
                    String str1;
                    int flag1 = -1;
                    str1 = menu.typeMenu();
                    while(flag1 == -1){
                        switch(str1){
                            case "int": mat = read(r,c);
                                        flag = 1;
                            break;
                            case "double": dmat = read(0.0,r,c);
                                        flag = 1;
                            break;
                            case "char" : cmat = read('0',r,c);
                                        flag = 1;
                            break;
                            case "String": smat = read("",r,c);
                                        flag = 1;
                            break;
                            default: System.out.println("Invalid Data Type-("+str1+")! Retry....");
                        }
                    }
            break;
            default: System.out.println("Invalid Option "+opt+"! Terminating...");
        }
    }
}