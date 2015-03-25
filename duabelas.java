/**
 * Created by Ilda Putri on 3/25/2015.
 */
public class duabelas {
    public static void main(String[] args) {
        int j;
        int k;
        int panjang=10;
        int lebar=15;

        for (j=1;j<=lebar;j++){
            if(j%2==0){
                System.out.print(" ");
            }
            for (k=1;k<=panjang;k++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }

}
