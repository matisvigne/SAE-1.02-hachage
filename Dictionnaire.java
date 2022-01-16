import java.math.BigInteger;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dictionnaire {
    
    private HTNaive table;

    public Dictionnaire(int m){
        this.table = new HTNaive(m);
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

    public boolean ajout(String s) {
        return this.table.ajout(stringToBigInteger(s));
    }
    
    public boolean contient(String s) {
        return this.table.contient(stringToBigInteger(s));
    }
    
    public int getCardinal() {
        return this.table.getCardinal();
    }
    
    public int getMaxSize() {
        return this.table.getMaxSize();
    }
    
    public int getNbListes() {
        return this.table.getNbListes();
    }
    
    public String toString() {
        return this.table.toString();
    }
    
    public String toStringV2() {
        return this.table.toStringV2();
    }

    public static int lectureMotsTexte(String fileName) {
        File f = new File(fileName);
        Scanner sc;
        ListeBigI res = new ListeBigI();
        try {
            sc = new Scanner(f);
        }
        catch(FileNotFoundException e) {
            System.out.println(("problème d'accès au ficher " + e.getMessage()));
            return 0;
        }

        sc.useDelimiter(" |\\n|,|;|:|\\.|!|\\?|-|\\. ");
        

        int nbMots = 0;
        while (sc.hasNext()) {
            String mot = sc.next();
            nbMots++;
        }
        return nbMots;
    }

    public static ListeBigI calculeListeInt(String fileName) {
        File f = new File(fileName);
        Scanner sc;
        ListeBigI res = new ListeBigI(BigInteger.valueOf(lectureMotsTexte(fileName)));

        try {
            sc = new Scanner(f);
        }
        catch(FileNotFoundException e) {
            System.out.println(("problème d'accès au ficher " + e.getMessage()));
            return res;
        }

        sc.useDelimiter(" |\\n|,|;|:|\\.|!|\\?|-|\\. ");
        
        while (sc.hasNext()) {
            String mot = sc.next();
            res.ajoutTete(stringToBigInteger(mot));
        }
        return res;
    }
}