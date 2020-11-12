import java.util.Arrays;

public class Algo3e4 {

    public static void main(String[] args) {
        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
        Arrays.sort(arr);
        System.out.println(isSort(arr));
    }

    public static boolean isSort(int[] tab) {
        for(int i = 0; i< tab.length-1;i++){
            if(tab[i] > tab[i+1]){
                return false;
            }
        }
        return true;
    }
}
