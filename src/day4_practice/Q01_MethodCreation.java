package day4_practice;

public class Q01_MethodCreation {

    /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabb ccc ccdddd aaa"
        output: abcd
     */
    public static void main(String[] args) {

        birkereyazdir("aabb aaacccd dddeee");


    }

    public static void birkereyazdir(String str) {

        String output = ""; // String default degeri hiclik oldugu icin isleme etki etmesin diye bu sekilde atama yaptık

        for (int i = 0; i < str.length(); i++) {  // int i = 0; i <=str.length()-1 ; i++ bu sekilde de olur
            if (!output.contains(str.substring(i, i + 1))) { //tekrarsiz karakterleri dondurecegimiz icin
                // sonucumuz str den aldıgımız  herhangi bir karakteri icermesin
                output += str.substring(i, i + 1);  // o zaman sonuca eklesin
            }

        }
                System.out.println(output);
    }


}
        /*

       String input= "aabbcccccddddaaa";

       output(input);

    }

    public static void output(String input) {

        String output=" ";
        for (int i = 0; i <input.length() ; i++) {
          if(input.indexOf(input.charAt(i))!=input.lastIndexOf(input.charAt(i))){
              if(!output.contains(input.substring(i,i+1))){
                  output+=input.substring(i,i+1);
              }

          }

        }
        System.out.println(output);

*/

    /*  3.çözüm yolu

        String output="";
        for (int i = 0; i <input.length() ; i++) {
            String str1=input.substring(i,i+1);
            output=str1;
            for (int j = 1; j < input.length(); j++) {
                String str2=input.substring(j,j+1);
                if(!str2.equalsIgnoreCase(str1) && !output.contains(str2)){
                    output+=str2;

                }

            }

        }
        System.out.println(output);


     */

