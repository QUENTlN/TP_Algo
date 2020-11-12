
public class Algo2e11 {

    public static void main(String[] args) {
        for(int i = 1; i < 10000; i++){
            if (estParfait(i)){
                System.out.println(i + " est parfait");
            }
        }
    }

    static public boolean estParfait(int x) {
        int s = 0;
        for (int d = 1; d < x; d++) {
            if (x%d == 0){
                s += d;
            }
        }
        return (x==s);
    }
}
