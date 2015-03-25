/**
 * Created by Ilda Putri on 3/25/2015.
 */
public class delapan {
    public static void main(String[] args) {
        int awalan=1;
        int akhiran=110;
        int a;

        for(awalan=1;awalan<=akhiran;awalan++){
            System.out.print(awalan);
            if (awalan<akhiran){
                System.out.print(" ");
                if (awalan % 11==0){
                    System.out.print("\n");
                }
            }
        }
    }
}
