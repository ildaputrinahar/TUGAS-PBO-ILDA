/**
 * Created by Ilda Putri on 3/25/2015.
 */
public class sembilan {
    public static void main(String[] args) {
        int pertama = 1;
        int terakhir = 110;
        int a;
        for (pertama = 1; pertama <= terakhir; pertama++) {
            if (pertama % 5 == 0) {
                System.out.print("JONI");
            } else {
                System.out.print(pertama);
            }
            if (pertama < terakhir) {
                System.out.print(" ");
                if (pertama % 11 == 0) {
                    System.out.print("\n");
                }
            }
        }
    }
}
