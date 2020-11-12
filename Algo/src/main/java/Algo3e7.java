public class Algo3e7 {
    public static void main(String[] args) {
        int[] t = {2, 18, -22, 20, 8, -6, 10, -24, 13, 3};
        maxSousTableau(t);
    }



    public static void maxSousTableau(int[] tab) {
        int borneDebut = 0;
        int borneFin = 0;
        int somme = 0;
        int sommeMax = tab[0];
        int deb = 0;
        for (int i = 0; i < tab.length; i++) {
            somme += tab[i];
            if (somme > sommeMax) {
                borneDebut = deb;
                borneFin = i;
                sommeMax = somme;
            }
            if (somme < 0) {
                somme = 0;
                deb = i + 1;
            }
        }
        System.out.println("Max somme : " + sommeMax + ", Indice début : " + borneDebut + ", Indice fin : " + borneFin);
    }
}
