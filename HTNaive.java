import java.math.BigInteger;

public class HTNaive {

    private ListeBigI[] HashTest;

    //Constructeur
    public HTNaive(int m) {
		this.HashTest = new ListeBigI[m];
    }

	public HTNaive(ListeBigI l, int m){
		this(m);
		this.ajouteListe(l);
	}

	public HTNaive(ListeBigI l, double f){
		HTNaive tmp = new HTNaive(1000);
		tmp.ajouteListe(l);
		int cardinal = (int)(tmp.getCardinal() * f);
		this.HashTest = new ListeBigI[cardinal];
		this.ajouteListe(l);
	}

	public ListeBigI getListe(int i){
		return this.HashTest[i];
	}

    public int h(BigInteger u) {
		return u.intValue() % this.HashTest.length;
    }

    public boolean contient(BigInteger u) {
		boolean contient = false;
		int i = 0;
		while (!contient && i<this.HashTest.length) {
			if (this.HashTest[i].contient(u)) {
			contient = true;
			}
			i++;
		}
		return contient;
    }

    public boolean ajout(BigInteger u) {
		boolean ajoutee = false;
		if (!this.contient(u)) {
			this.HashTest[h(u)].ajoutTete(u);
			ajoutee = true;
		}
		return ajoutee;
    }

    public void ajouteListe(ListeBigI L) {
		ListeBigI copie = new ListeBigI(L);
		for (int i = 0; i < L.longueur(); i++) {
			this.ajout(copie.supprTete());
		}
    }

	public ListeBigI getElements(){
		ListeBigI elements = new ListeBigI();
		for(int i = 0; i < this.HashTest.length; i++){
			elements.ajoutListe(this.getListe(i));
		}
		return elements;
	}

	public String toString(){
		String affichage = "";
		for(int i = 0; i < this.HashTest.length; i++){
			affichage += "t[" + i + "] : " + this.getListe(i) + " (élément de la liste " + i + ")\n";
		}
		return affichage;
	}

	public int getNbListes(){
		int nbListes = 0;
		for(int i = 0; i < this.HashTest.length; i++){
			nbListes++;
		}
		return nbListes;
	}

	public int getCardinal(){
		int cardinal = 0;
		for(int i = 0; i < this.getNbListes(); i++){
			for(int j = 0; j < this.getListe(i).longueur(); j++){
				cardinal++;
			}
		}
		return cardinal;
	}

	public int getMaxSize(){
		int maxSize = 0;
		for(int i = 0; i < this.getNbListes(); i++){
			if (this.getNbListes() > maxSize){
				maxSize = this.getNbListes();
			}
		}
		return maxSize;
	}

	public String toStringV2(){
		String affichage = "";
		String nbEtoiles = "";
		for(int i = 0; i < this.getNbListes(); i++){
			if(this.getListe(i).longueur() == 0){
				for(int j = 0; j < this.getListe(i).longueur(); j++){
					nbEtoiles += "*";
				}
				affichage += "t[" + i + "] : " + nbEtoiles + "\n";
			}
		}
		return affichage;
	}
}