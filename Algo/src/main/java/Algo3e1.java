public class Algo3e1 {

    public static void main(String[] args) {
       System.out.println(maxList(new int[]{3,5,7,1}));
    }

    public static int maxList(int[] x) {
        int max = x[0];
        for (int i=1; i < x.length; i++){
            if (max<x[i]){
                max = x[i];
            }
        }
        return max;
    }
}
