import java.util.Scanner;
public class screen
{
    public static void main(String args[])
    {
        System.out.println("THIS IS THE TEXT WHICH IS ALREADY WRITTEN");
        System.out.println("Enter Clear to clear screen.");
        Scanner in = new Scanner(System.in);
        String a=in.nextLine();
        if(a.equalsIgnoreCase("clear"))
        {
            clear();//use 'screen.clear' if using it in another function
        }
    }
    public static void clear()
    {
        try{
            if(System.getProperty("os.name").contains("Windows"))
            {
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }
            else
            Runtime.getRuntime();
        }
        catch(Exception e)
        {
            System.out.println("ERROR " + e.getMessage());
        }
    }
}
