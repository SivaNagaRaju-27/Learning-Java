package Mathematics;
import java.io.*;
public class matrixMenu{
    int[][] mat;
    double[][] dmat;
    char[][] cmat;
    String[][] smat;
    int r,c,ord;

    public int readMenu()throws Exception{
        int opt;
        var rd = new InputStreamReader(System.in);
        var br = new BufferedReader(rd);
        System.out.print("Enter Number of Rows: "); 
        r = Integer.parseInt(br.readLine());
        System.out.print("Enter Number of Columns: ");
        c = Integer.parseInt(br.readLine());

        System.out.println("\t\t*****Menu*****");
        System.out.println("\t[1].Implement a Random Matrix...");
        System.out.println("\t[2].Input Matrix...");
        System.out.print("choose an Option...: ");
        
        opt = Integer.parseInt(br.readLine());

        return opt;
    }

    public String typeMenu()throws Exception{
        String str;

        var rd = new InputStreamReader(System.in);
        var br = new BufferedReader(rd);

        System.out.print("What type of Data You Want to Enter: ");
        str = br.readLine();
        str = str.toLowerCase();

        return str;
    }

    public int input()throws Exception{
        int limit;

        var rd = new InputStreamReader(System.in);
        var br = new BufferedReader(rd);

        System.out.print("Enter Upper Limit of the Random Numbers: ");
        limit = Integer.parseInt(br.readLine());

        return limit;
    }

    public int functionMenu()throws Exception{
        int opt;
        var rd = new InputStreamReader(System.in);
        var br = new BufferedReader(rd);
        System.out.println("\t\t*****Menu*****");
        System.out.println("\t[1].Display Matrix.");
        System.out.println("Enter your Option: ");
        opt = Integer.parseInt(br.readLine());
        
        return opt;
    }
}
