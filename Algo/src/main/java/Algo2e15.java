import java.util.Scanner;

public class Algo2e15 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i = sc.nextInt();
        decomposer(i);
    }

    public static void decomposer(int x) {
        System.out.print(x + " = ");
        int i = 2;
        while(x > 1){
            if (x%i==0){
                x = x/i;
                if(x==1){
                    System.out.print(i);
                }else {
                    System.out.print(i + "*");
                }
            }else{
                i++;
            }
        }
    }
}
