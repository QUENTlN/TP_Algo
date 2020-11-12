import java.util.Scanner;

public class Algo1e6 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int note = sc.nextInt();
        String res;
        if (note < 10){
            res = "recalé";
        }else if (note < 12){
            res = "passable";
        }else if (note < 14){
            res = "asser bien";
        }else if (note < 16){
            res = "bien";
        }else{
            res = "très bien";
        }
        System.out.println(res);
    }
}
