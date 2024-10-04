import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int cal = scanner.nextInt();
        int result = cal - 543;
        
        System.out.println(result);
        scanner.close();
    }
}