/*
Classe concrète qui implémente les méthodes abstraites
 */
public class CommandeGabon extends Commande {
    private float montantMaterielHt;
    private float montantPrestationHt;

    public CommandeGabon(float montantHt) {
        super(montantHt);
    }
    public CommandeGabon(float montantMaterielHt, float montantPrestationHt, float montantHt){
        super(montantHt);
        this.montantMaterielHt = montantMaterielHt;
        this.montantPrestationHt = montantPrestationHt;
    }


    @Override
    public void calculeTva() {
        montantTva = (float) ((montantMaterielHt*0.12)+(montantPrestationHt*0.15));
    }
}
