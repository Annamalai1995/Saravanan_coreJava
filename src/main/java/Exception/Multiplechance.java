package Core_java.Exception;

import java.util.Scanner;

public class Multiplechance {
    private String currentdata="I am Annamalai From Salem ";

    Scanner scan=new Scanner(System.in);
    public void extract()
    {
        try
        {
            System.out.println("enter the first index of");
            int start=scan.nextInt();
            System.out.println("enter the last index of(position");
            int end=scan.nextInt();
            System.out.println(currentdata.substring(start, end));
        }
        catch(StringIndexOutOfBoundsException exe)
        {
            System.out.println(exe);
            System.out.println("Start with 0 end in"+currentdata.length());
            throw exe;

        }
    }


    public static void main(String[] args)
    {
        Multiplechance chance=new Multiplechance();
        try
        {
            chance.extract();
        }
        catch(StringIndexOutOfBoundsException exe)
        {
            System.out.println(exe);
            chance.extract();
        }
    }
}
