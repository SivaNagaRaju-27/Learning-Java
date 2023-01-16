package Basics;
public class matrixMenu{
    int[][] mat;
    double[][] dmat;
    char[][] cmat;
    String[][] smat;
    int r,c,ord;
    String str = "Choose Your Option";
    read rd = new read();

    public String readMenu()throws Exception{
        String opt;

        System.out.println("\t\t*****Menu*****");
        System.out.println("\t[1].Implement a Random Matrix...");
        System.out.println("\t[2].Input Matrix...");
        
        opt = rd.Readstr(str);

        return opt;
    }

    public String typeMenu()throws Exception{
        String str;
        str = rd.Readstr("What type of Data You Want to Enter");

        return str;
    }

    public String functionMenu()throws Exception{
        String opt;

        System.out.println("\t\t*****Menu*****");
        System.out.println("\t[1].Matrix Addition.");
        System.out.println("\t[2].Matrix Subtraction.");
        System.out.println("\t[3].Matrix Division.");
        System.out.println("\t[4].Matrix Det.");
        System.out.println("\t[q].Quit.");
        
        opt = rd.Readstr(str);
        
        return opt;
    }
}
