import java.math.BigInteger;

public class MainDictionnaire {
    public static void main(String[]args){
        // BigInteger[] big = new BigInteger[]{BigInteger.valueOf(Ut.randomMinMax(2, 48)), BigInteger.valueOf(Ut.randomMinMax(2, 48)), BigInteger.valueOf(Ut.randomMinMax(2, 48)), BigInteger.valueOf(Ut.randomMinMax(2, 48)), BigInteger.valueOf(Ut.randomMinMax(2, 48)), BigInteger.valueOf(Ut.randomMinMax(2, 48)), BigInteger.valueOf(Ut.randomMinMax(2, 48)), BigInteger.valueOf(Ut.randomMinMax(2, 48)), BigInteger.valueOf(Ut.randomMinMax(2, 48)), BigInteger.valueOf(Ut.randomMinMax(2, 48)), BigInteger.valueOf(Ut.randomMinMax(2, 48))};
        // String test = "hello";
        // System.out.println(stringToBigInteger(test));

        Dictionnaire dico = new Dictionnaire(10);
        String texte = "randomWordsPetit.txt";
        // Ut.afficher(dico.lectureMotsTexte(texte));
        Ut.afficher(dico.calculeListeInt(texte).toString());
    }

    // public static BigInteger stringToBigInteger(String s){
    //     int longueur = s.length();
    //     BigInteger code = BigInteger.valueOf(-1);
    //     for(int i = 0; i < longueur; i++){
    //         long c = s.charAt(i);
    //         c *= Math.pow(256, longueur-i);
    //         code = code.add(BigInteger.valueOf(c));
    //     }
    //     return code;
    // }

    // public static BigInteger stringToBigInteger(String s){
    //     int longueur = s.length();
    //     BigInteger mot = BigInteger.valueOf(s.charAt(0));
    //     for(int i = 1; i < longueur; i++){
    //         mot = mot.multiply(BigInteger.valueOf(256));
    //         mot = mot.add(BigInteger.valueOf(s.charAt(i)));
    //     }
    //     return mot;
    // }
}
