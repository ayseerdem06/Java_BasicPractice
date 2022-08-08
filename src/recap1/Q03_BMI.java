package recap1;

import java.util.Scanner;

public class Q03_BMI {


		/*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Kilogram olarak agirliginizi giriniz : ");
        double kilo= scan.nextDouble();

        System.out.print("cm olarak boyunuzu giriniz: ");
        double boy=scan.nextDouble();
        boy/=100; // boy=boy/100

        int vke= (int) (kilo/(boy*boy));
        System.out.print("Vücut Kitle İndeksiniz : " + vke );
    }

}
