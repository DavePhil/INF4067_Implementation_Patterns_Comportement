/*
Classe abstraite définissant la signature de la méthode patron (Ici, calcule montantTtc)
 */
public abstract class Commande {
    protected float montantHt;
    protected float montantTva;
    protected float montantTtc;

    public Commande(float montantHt){
        this.montantHt = montantHt;
    }

    public void calculeMontantTtc(){
        calculeTva();
        montantTtc = montantTva + montantHt ;
    }

    public float getMontantTtc(){
        return montantTtc;
    }

    protected abstract void calculeTva();
    public void affiche (){

    }

}
