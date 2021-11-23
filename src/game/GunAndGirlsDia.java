package game;

public class GunAndGirlsDia {
    public static void main(String[] args) {
        getDiaTotal();

    }
    public static void getDiaTotal() {
        int sum = 0;
        int t = 100;
        int[] tn = new int[t];
        for (int i = 1; i < tn.length; i++) {
            sum += i*10;

        }
        System.out.println(sum);

    }

//10+20+30+40+50+60+...+990+1000

}
