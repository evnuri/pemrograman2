package lat2pertemuan11;

import java.io.*;


public class ChangeToUnderscore
{
    public ChangeToUnderscore(String sumber, String tujuan)
    {
        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream(sumber);
        }catch(FileNotFoundException ex)
        {
            System.out.println("File Not Found");
        }

        try
        {
            char data;
            int temp;
            FileOutputStream fos;
            fos = new FileOutputStream(tujuan);
            do
            {
                temp = fis.read();
                data = (char)temp;
                if(temp != -1)
                {
                    try
                    {
                        if((char)temp == ' ')
                        {
                            data = '_';
                            fos.write(data);
                        }else
                        {
                            fos.write(data);
                        }
                    }catch(FileNotFoundException ex)
                    {
                        System.out.println("File Cannot be opened for writing");
                    }
                }
            }while(temp != -1);

        } catch(IOException ex)
        {
            System.out.println("Problem for reading of this file");
        }
    }

}