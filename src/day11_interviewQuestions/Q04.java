package day11_interviewQuestions;

public class Q04 {
    public static void main(String[] args) {

       //  Normal toplama methodu  varargs ile toplama methodu yazınız

        int [] arr={17,23,33,9,20};

        arrTopla(arr);
        varargslaToplaList(25,55,63,21);
        varargsToplaArr(arr);

        // varargs array gibi davrandıgı için herhangi bir arrayi parametre olarak verebiliriz
        System.out.println("ArrTopla : "+ arrTopla(arr));
        System.out.println("Varargs arrTopla: "+ varargsToplaArr(arr));
    }

    private static int varargsToplaArr(int...i) {
        int toplam=0;
        for (int w:i) {
            toplam+=w;

        }
        return toplam;
    }

    private static void varargslaToplaList(int i, int i1, int i2, int i3) {


    }

    private static int arrTopla(int[] arr) {

        int toplam=0;

        for (int each:arr) {
            toplam+=each;
        }
        return toplam;
    }
}
