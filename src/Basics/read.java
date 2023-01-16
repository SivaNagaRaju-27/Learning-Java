package Basics;
import java.io.*;
public class read {
    public int Readint(String str)throws Exception{
        int n;
        var rd = new InputStreamReader(System.in);
        var br = new BufferedReader(rd);

        System.out.print(str+": ");
        n = Integer.parseInt(br.readLine());

        return n;
    }

    public String Readstr(String str)throws Exception{
        String x;
        var rd = new InputStreamReader(System.in);
        var br = new BufferedReader(rd);

        System.out.print(str+": ");
        x = br.readLine();

        return x;
    }
}
