public class Main {
    public static void main(String[] args) {

//      1 uzduotis
//      Sukurkite Funkciją kuri priima du int tipo kintamuosius. Juos susumuoja ir atspausdina.

        //=)
        System.out.println("--------1uzd-----------");
        int a = 9;
        int b = 4;
        duSkaic(a, b);

        System.out.println("--------2uzd-----------");
        System.out.println(PISq());

        System.out.println("--------3uzd-----------");
        System.out.println(sandauga(a,b));
        System.out.println("--------4uzd-----------");

        int[] intArr = {5,20,10,33};
        skaiciai(intArr);

        System.out.println("--------5uzd-----------");
        System.out.println(rndMinMax(a,b));

        System.out.println("---------6uzd----------");




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
        return  9.8596;

    }
//      3 uzduotis
//      Sukurkite Funkciją kuri priima du int tipo kintamuosius.
//      Funkcija gražina skaičių sandaugą.;
//      Gautą reikšmę atspausdinkite.

    public static int sandauga(int e, int f){
        int sand = e * f;
        return sand;
    }
//      4 uzduotis
//      Sukurkite Funkciją kuri priima int[] tipo kintamąį,
//      prasuka ciklą ir atspausdina kiekvieną skaičių.

public static void skaiciai(int[] arr){
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);;
    }

}

//      5 uzduotis
//     Sukurkite Funkciją kuri priima du int tipo kintamuosius, min ir max reikšmėms nustatyti
//     ir sugeneruoja random int skaičių ir jį gražintų.


public static int rndMinMax(int min, int max){
      int ab = (int) (min + Math.round( Math.random() * (max-min)));
      return ab;
}

}