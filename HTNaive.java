
public class HTNaive {

    private ListeBigI [] HashTest;


    //Constructeur
    public HTNaive(int m) {
	this.HashTest = new ListeBigI[m];
    }

    public int h(BigInteger u) {
	return u.intValue()%this.ListeBigI.length;
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
