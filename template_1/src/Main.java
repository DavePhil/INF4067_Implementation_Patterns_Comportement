/*
Devoir réalise par CHEDJOUN KENGUEP Dave, Étudiant en Master 1 Spécialité SIGL Matricule 20U2757
Classe Cliente
 */
public class Main {
    public static void main(String[] args) {

        float montantHt = 750000;
        Commande commandeCameroun = new CommandeCameroun(montantHt);
        Commande commandeGabon = new CommandeGabon(15000,60000,montantHt);
        System.out.println("=====================================================================================");
        System.out.println("=========================================DEBUT=======================================");
        System.out.println("=====================================================================================");
        /* calcul TTC Cameroun */
        commandeCameroun.calculeTva();
        commandeCameroun.calculeMontantTtc();
        System.out.println("Le prix tout taxe comprise pour le Cameroun est: " + commandeCameroun.getMontantTtc());
        /* calcul TTC Gabon */
        commandeGabon.calculeTva();
        commandeGabon.calculeMontantTtc();
        System.out.println("Le prix tout taxe comprise pour le Gabon est: " + commandeGabon.getMontantTtc());
        System.out.println("=====================================================================================");
        System.out.println("==========================================FIN========================================");
        System.out.println("=====================================================================================");
    }
}