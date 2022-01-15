import java.math.BigInteger;

public class Dictionnaire {
    
    private HTNaive table;

    public Dictionnaire(int m){
        this.table= new HTNaive(m);
    }

    public static BigInteger stringToBigInteger(String s){
        int longueur = s.length();
        BigInteger code = BigInteger.valueOf(-1);
        for(int i = longueur-1; i >= 0; i--){
            long c = s.charAt(i);
            c *= (long) Math.pow(256, i);
            code.add(c);
        }
    }
}
