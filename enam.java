/**
 * Created by Ilda Putri on 3/25/2015.
 */
public class enam {
    public static void main(String[] args) {
        int awalan=1;
        int akhiran=20;
        int jumlah=0;
        System.out.println("Angka pertama=" + awalan);
        System.out.println("Angka terakhir=" + akhiran);


        while(awalan<=akhiran){
            jumlah=jumlah+awalan;
            awalan++;
        }
        System.out.println("Jumlah dari deretan angka="+jumlah);
    }
}
