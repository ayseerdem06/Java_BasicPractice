package recap2;

public class Q07_StringManipulation {

    // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
    // String  str 1= "$13.99"
    // String str 2= "$10.55"
    // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

     /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey  */

    public static void main(String[] args) {


        String  str1= "$13.99";
        String str2= "$10.55";

        Double sayi1= Double.valueOf(str1.replace("$",""));
        Double sayi2= Double.valueOf(str2.replace("$",""));

        double sonuc=sayi1+sayi2;
        System.out.print("Sayiların toplami : "+sonuc);


/*
        // 2.Yontem
        String  str1= "$13.99";
        str1= str1.replaceAll("\\D","");
        System.out.println("str1:"+ str1); //str1=1399

        String str2= "$10.55";
        str2=str2.replaceAll("\\D","");
        System.out.println("str2:"+ str2); // str2=1055

        System.out.println(str1+str2); // 13991055

        double sayi1=Double.parseDouble(str1); // sayi1 degiskenini String olan str1 den double a donusturduk
        double sayi2=Double.parseDouble(str2); // // sayi2 degiskenini String olan  str1 den double a donusturduk

        double toplam=(sayi1+sayi2)/100;
        System.out.println("$"+ toplam);  // $24.54


*/



    }

}
