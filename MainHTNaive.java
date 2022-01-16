import java.math.BigInteger;

public class MainHTNaive {
    public static void main(String []args){
        BigInteger[] big = new BigInteger[]{BigInteger.valueOf(Ut.randomMinMax(2, 48)), BigInteger.valueOf(Ut.randomMinMax(2, 48)), BigInteger.valueOf(Ut.randomMinMax(2, 48)), BigInteger.valueOf(Ut.randomMinMax(2, 48)), BigInteger.valueOf(Ut.randomMinMax(2, 48)), BigInteger.valueOf(Ut.randomMinMax(2, 48)), BigInteger.valueOf(Ut.randomMinMax(2, 48)), BigInteger.valueOf(Ut.randomMinMax(2, 48)), BigInteger.valueOf(Ut.randomMinMax(2, 48)), BigInteger.valueOf(Ut.randomMinMax(2, 48)), BigInteger.valueOf(Ut.randomMinMax(2, 48))};
        ListeBigI listeTest = new ListeBigI(big);
        HTNaive htTest = new HTNaive(5);

        htTest.ajouteListe(listeTest);

        // System.out.println(htTest.getElements() + "\n");
        System.out.println(htTest.toString());
        System.out.println(htTest.toStringV2());
    }
}
