/*
Devoir réalise par CHEDJOUN KENGUEP Dave Master1 Spécialité SIGL Matricule : 20U2757
 */
public class Main {
    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage();
        System.out.println("=====================================================================================");
        System.out.println("=========================================DEBUT=======================================");
        System.out.println("=====================================================================================");
        System.out.println("================== Filtre: Black and white && Compressor : Jpeg =====================");
        imageStorage.blackAndWhiteFilter.apply();
        imageStorage.jpegCompressor.compress();
        imageStorage.store();
        System.out.println("=====================================================================================");
        System.out.println("==========================================FIN========================================");
        System.out.println("=====================================================================================");
    }
}