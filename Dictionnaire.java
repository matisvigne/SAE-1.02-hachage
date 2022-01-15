import java.math.BigInteger;

public class Dictionnaire {
    
    private HTNaive table;

    public Dictionnaire(int m){
        this.table= new HTNaive(m);
    }

    public static BigInteger stringToBigInteger(String s){
        int longueur = s.length();
        BigInteger mot = BigInteger.valueOf(s.charAt(0));
        for(int i = 1; i < longueur; i++){
            mot = mot.multiply(BigInteger.valueOf(256));
            mot = mot.add(BigInteger.valueOf(s.charAt(i)));
        }
        return mot;
    }
}