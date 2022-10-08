import java.util.Scanner;

class first
{
    public static void main (String args[]){

        char a;
        System.out.println("Enter a number");
        Scanner s= new Scanner(System.in);
        a = s.next().charAt(0);

        System.out.println(a);
    }
}