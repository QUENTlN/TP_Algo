public class Algo2e12 {

    public static void main(String[] args) {
        for(int i = 1; i < 1000; i++){
            if (estCubique(i)){
                System.out.println(i + " est cubique");
            }
        }
    }

    static public boolean estCubique(int x) {
        int i = x;
        int tot = 0;
        while (i > 0){
            tot += (int) Math.pow(i%10, 3);
            i/=10;
        }
        return (tot==x);
    }
}
