import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int rea = (a+b)%c;
        int reb = ((a%c)+(b%c))%c;
        int rec = (a*b)%c;
        int red = ((a%c)*(b%c))%c;
        
        System.out.println(rea);
        System.out.println(reb);
        System.out.println(rec);
        System.out.println(red);
        sc.close();
    }
}