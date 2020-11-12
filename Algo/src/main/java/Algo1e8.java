import java.util.Scanner;

public class Algo1e8 {

    static Scanner sc = new Scanner(System.in);

    static int sommeNb3Number(int x){
        int u = x%10;
        int d = (x / 10) % 10;
        int c = x/100;
        return u + d + c;
    }

    public static void main(String[] args) {
        int x = sc.nextInt();
        int gauche = x / 1000;
        int droite = x % 1000;
        if (sommeNb3Number(gauche) == sommeNb3Number(droite)){
            System.out.println("chanceux");
        }else {
            System.out.println("pas chanceux");
        }
    }
}
