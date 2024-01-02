/*
Classe concrète qui implémente les méthodes abstraites
 */
public class CommandeCameroun extends Commande{
    public CommandeCameroun(float montantHt) {
        super(montantHt);
    }

    @Override
    public void calculeTva() {
        montantTva = (float) (montantHt * 0.196);
    }
}
