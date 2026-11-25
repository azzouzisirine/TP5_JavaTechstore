package heritage;

public abstract class AppareilInformatique
extends Article implements Garantissable{
	private double resolutionEcran;
	private String processeur;
	private long ram;
	private SystemeExploitation systemeExploitation;
	public AppareilInformatique(
	        int id,
	        String nom,
	        double prix,
	        double resolutionEcran,
	        String processeur,
	        long ram,
	        SystemeExploitation systemeExploitation) {

	    super(id, nom, prix);

	    this.resolutionEcran = resolutionEcran;
	    this.processeur = processeur;
	    this.ram = ram;
	    this.systemeExploitation = systemeExploitation;
	}
	 // Méthode abstraite
    @Override
    public abstract int garantirAppareil();
 // Getters
    public double getResolutionEcran() {
        return resolutionEcran;
    }

    public String getProcesseur() {
        return processeur;
    }

    public long getRam() {
        return ram;
    }

    public SystemeExploitation getSystemeExploitation() {
        return systemeExploitation;
    }

    // Setters
    public void setResolutionEcran(double resolutionEcran) {
        this.resolutionEcran = resolutionEcran;
    }

    public void setProcesseur(String processeur) {
        this.processeur = processeur;
    }

    public void setRam(long ram) {
        this.ram = ram;
    }

    public void setSystemeExploitation(SystemeExploitation systemeExploitation) {
        this.systemeExploitation = systemeExploitation;
    }

    // toString()
    @Override
    public String toString() {
        return super.toString()
                + ", résolution écran : " + resolutionEcran
                + ", processeur : " + processeur
                + ", RAM : " + ram
                + ", système d'exploitation : " + systemeExploitation;
    }

}
