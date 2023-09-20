public class Main {
    public static void main(String[] args) {

//      1 uzduotis
//      Sukurkite Funkciją kuri priima du int tipo kintamuosius. Juos susumuoja ir atspausdina.

        //=)
        System.out.println("--------1uzd-----------");
        int a = 3;
        int b = 9;
        duSkaic(a, b);

        System.out.println("--------2uzd-----------");
        System.out.println(PISq());

        System.out.println("--------3uzd-----------");
        System.out.println(sandauga(a, b));
        System.out.println("--------4uzd-----------");

        int[] intArr = {5, 20, 10, 33};
        skaiciai(intArr);

        System.out.println("--------5uzd-----------");
        System.out.println(rndMinMax(a, b));

        System.out.println("---------6uzd----------");
        int[] rndNumArr = rndArr(3, 10, 8);
        Main.skaiciai(rndNumArr);

        System.out.println("---------7uzd----------");
        System.out.println(arrSum(rndNumArr));

        System.out.println("---------8uzd----------");
        System.out.println(arrVidurkis(rndNumArr));

        System.out.println("---------9uzd----------");
        zvaigStaciak(a, b);


//        int[] intArray = new int[50];
//        for (int i = 0; i < intArray.length; i++) {
//            intArray[i] = (int) Math.round(Math.random()*30);
//        }
//        skaiciai(intArray);
        /*
        str = rndNumArr[0]
        hp =  rndNumArr[1]
        atk = rndNumArr[2]
        def = rndNumArr[3]
         */
    }

    public static void duSkaic(int c, int d) {
        int sum = c + d;
        System.out.println(sum);
    }
//      2 uzduotis
//Sukurkite Funkciją kuri vadinasi PISq. Funkcija gražina double tipo reikšmę.
// Reikšmė yra : 9.8596;
// Gautą reikšmę atspausdinkite.

    public static double PISq() {
        return 9.8596;

    }
//      3 uzduotis
//      Sukurkite Funkciją kuri priima du int tipo kintamuosius.
//      Funkcija gražina skaičių sandaugą.;
//      Gautą reikšmę atspausdinkite.

    public static int sandauga(int e, int f) {
        int sand = e * f;
        return sand;
    }
//      4 uzduotis
//      Sukurkite Funkciją kuri priima int[] tipo kintamąį,
//      prasuka ciklą ir atspausdina kiekvieną skaičių.

    public static void skaiciai(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            ;
        }

    }

//      5 uzduotis
//     Sukurkite Funkciją kuri priima du int tipo kintamuosius, min ir max reikšmėms nustatyti
//     ir sugeneruoja random int skaičių ir jį gražintų.


    public static int rndMinMax(int min, int max) {
        int ab = (int) (min + Math.round(Math.random() * (max - min)));
        return ab;
    }

//      6 uzduotis
//     Sukurkite Funkciją kuri sugeneruotų random int skaičių masyvą ir jį gražintų.
//     Funkcija priima tris int tipo kintamuosius, min, max ir length reikšmėms nustatyti.

    public static int[] rndArr(int min, int max, int length) {
        int[] rndArr2 = new int[length]; //masyvo
        for (int i = 0; i < length; i++) {
            rndArr2[i] = (int) (min + Math.round(Math.random() * (max - min))); //i masyva ideti rndNum nuo min iki max
        }
        return rndArr2;
    }
//      7 uzduotis
//     Sukurkite Funkciją kuri panaudotų 6tos užduoties masyvą (priimtų kaip kintamąjį),
//     susumuotų ir gražintų reikšmę.

    public static int arrSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }
//      8 uzduotis
//      Sukurkite Funkciją kuri priimtų 6tos užduoties masyvą ir gražintų jos skaičių vidurkį (double).

    public static double arrVidurkis(int[] arr1) {
        int sum1 = 0;
        double vid;
        for (int i = 0; i < arr1.length; i++) {
            sum1 = sum1 + arr1[i];
        }
        vid = (double) sum1 / arr1.length;
        return vid;
    }
//      9 uzduotis
//      Sukurkite Funkciją kuri priimtų du int skaičius ir atspausdintų stačiakampį užpildytą žvaigždutėmis.
//      Pirmas int - išoriniam ciklui, antras vidiniam.

    public static void zvaigStaciak(int isor, int vid) {
        for (int i = 1; i <= isor; i++) {
            for (int x = 1; x <= vid; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }





}