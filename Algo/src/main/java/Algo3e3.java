import java.util.Scanner;

public class Algo3e3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i = sc.nextInt();
        System.out.println(chercheElement(i,new int[]{3,5,7,1}));
    }

    public static boolean chercheElement(int x,int[] tab) {
        for (int i=0; i<tab.length; i++){
            if (tab[i] == x){
                return true;
            }
        }
        return false;
    }
}
