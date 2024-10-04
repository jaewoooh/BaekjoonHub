import java.util.Scanner;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int b1 = b/100;
        int b2 = (b%100)/10;
        int b3 = b%10;
        
        int rea = a*b3;
        int reb = a*b2;
        int rec = a*b1;
        int result = (rea+(reb*10)+(rec*100));
        
        System.out.println(rea);
        System.out.println(reb);
        System.out.println(rec);
        System.out.println(result);
        sc.close();
        
    	}
	}
