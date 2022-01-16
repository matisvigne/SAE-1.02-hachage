import java.util.Random;

public class Main {
    public static void main(String[] args) 
    {
        Dictionnaire Dico = new Dictionnaire(100);
        String texte = "randomWordsPetit.txt";
        System.out.println(Dico.calculeListeInt(texte).toString());
        System.out.println("nbListes : " + Dico.getNbListes());

        int nbRecherches = 100000;
        long debut = System.currentTimeMillis();
        for(int i=0;i<nbRecherches;i++) 
        {
            int tailleMot = new Random().nextInt(15) + 2; //2 <= tailleMot <= 16
            char[] mot = new char[tailleMot];
            for (int j = 0; j < mot.length; j++) 
            {
                mot[j] = (char) ('a' + new Random().nextInt(26));
            }
            String motS = new String(mot);
            Dico.contient(motS);//on ne récupère même pas le résultat de la recherche!
        }
            long fin =System.currentTimeMillis();
            System.out.println("temps total : " + (fin-debut));
            
    }
}