package lat2pertemuan11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException
    {
        System.out.println("What is the name of the source file ?");
        String sumber;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sumber = br.readLine();
        System.out.println("Enter data to write to "+sumber+"...");
        System.out.println("What is the name of the aim file ?");
        String tujuan;
        BufferedReader bd = new BufferedReader(new InputStreamReader(System.in));
        tujuan = bd.readLine();
        System.out.println("Enter data to write to "+tujuan+"...");
        new ChangeToUnderscore(sumber,tujuan);

    }
}
