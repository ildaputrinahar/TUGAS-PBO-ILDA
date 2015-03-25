/**
 * Created by Ilda Putri on 3/25/2015.
 */
public class tujuh {
    public static void main(String[] args) {
        double awalan=2;
        double akhiran=25;
        double jumlah=0;
        double rata;
        System.out.println("Angka yang pertama=" + awalan);
        System.out.println("Angka yang terakhir=" + akhiran);

        while(awalan<=akhiran){
            jumlah=jumlah+awalan;
            awalan++;
        }
        System.out.println("jumlah dari deretan angka di atas="+jumlah);
        rata=jumlah+akhiran;
        System.out.print("rata-rata dari deret di atas=" + rata);
    }
}
