public class Algo3e6 {

    public static void main(String[] args) {
        affichePremiers(100);
    }

    public static void affichePremiers(int max) {
        boolean [] estBarre = new boolean [max + 1];
        estBarre[0] = estBarre[1] = true;
        for(int i = 2; i < estBarre.length; i++) {
            if (!estBarre[i]) {
                System.out.print(i + " ");
                for(int j = i * 2; j < estBarre.length; j = j + i)
                    estBarre[j] = true;
            }
        }
        System.out.println();
    }
}

