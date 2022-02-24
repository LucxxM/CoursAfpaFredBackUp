package main.travail.ProgrammationObjet.entity;


public class Voiture {
    // Propriétés
    public static int nbRoues = 4;

    private String marque;
    private String immatriculation;
    private int nbPortes = 4;
    private int vitesseEngagee = 0;
    private int vitesseCourante = 0;
    private int vitesse = 0;
    private String couleur;
    private Moteur moteur;

    // Constructeurs
    public Voiture(){
        System.out.println("Une voiture sans parametre est en cours de construction");
    }

    public Voiture(String couleur){
        this.couleur = couleur; // couleur de l'objet courant = couleur passée en paramètre
        System.out.println("Une voiture est construite avec un parametre");
    }

    public Voiture(Moteur moteur){
        System.out.println("Une voiture est construite avec son moteur");
        this.moteur = moteur;
    }

    public Voiture(int nbCylindres, String carburation){
        Moteur moteur = new Moteur(nbCylindres,carburation);
        this.moteur = moteur;

    }

    // Méthodes (comportements)

    // Méhode sans retour (void) et sans paramétres
    public static void klaxonner(){
        System.out.println("Tut tut");
    }

    // Methode avec retour
    public int donnerVitesse(){
        return 100;
    }

    // Methode avec 1 parametre

    /**
     * @author Frederic
     * @param vitesseActuelle
     * @return
     */
    public static int donnerNouvelleVitesse(int vitesseActuelle){
        return vitesseActuelle+10;
    }

    // Methode avec plusieurs parametres

    /**
     * Méthode qui permet de passer une vitesse supérieure ou une vitesse inferieure
     * @param vitesseActuelle
     * @param accelerer
     * @param ecartVitesse
     * @return
     */
    public int changerVitesse(int vitesseActuelle, boolean accelerer, int ecartVitesse){
        if(accelerer){
            System.out.println("J'accelere");
            vitesseActuelle +=ecartVitesse;
        }
        else {
            System.out.println("Je ralentis");
            vitesseActuelle -=ecartVitesse;
        }

        return vitesseActuelle;
    }

    // Surcharge de méthode
    public int changerVitesse(int vitesseActuelle, String accelererOuRalentir, int ecartVitesse){
        if(accelererOuRalentir == "accelerer"){
            System.out.println("J'accelere");
            vitesseActuelle +=ecartVitesse;
        }
        else {
            System.out.println("Je ralentis");
            vitesseActuelle -=ecartVitesse;
        }

        return vitesseActuelle;
    }

    public int passerUneVitesse(int vitesseaEngageeCourante, boolean passerVitesseSuperieure){
        if (passerVitesseSuperieure = true){
            vitesseaEngageeCourante = vitesseaEngageeCourante + 1;
        }

        else {
            vitesseaEngageeCourante = vitesseaEngageeCourante -1;
        }

        return vitesseaEngageeCourante;
    }

    public void passerUneVitesse(){
        vitesseEngagee++;
    }

    public static void afficherNbDeRoues() {
        System.out.println(nbRoues);
    }

    public void accelerer(){
        System.out.println("J'accelere");
    }

    /*int accelerer(int vitesseEnPlus){
        System.out.println("J'accelere de " + vitesseEnPlus + " km/h");
        return vitesseCourante + vitesseEnPlus;
    }*/

    // this
    public int accelerer(int vitesse){
        System.out.println("J'accelere de " + vitesse + " km/h");
        return this.vitesse + vitesse;
    }

    public Ville transporter (Passager passager, Ville villeDeDepart){
        System.out.println("Je transporte un passager qui s'appelle " + passager.firstname  +" " + passager.lastname + " en partant de " + villeDeDepart.nom);

        Ville villeArrivee = new Ville();
        villeArrivee.nom = "Paris";
        return villeArrivee;
    }

    // Getters Setters


    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public int getNbPortes() {
        return nbPortes;
    }

    public void setNbPortes(int nbPortes) {
        this.nbPortes = nbPortes;
    }

    public int getVitesseEngagee() {
        return vitesseEngagee;
    }

    public void setVitesseEngagee(int vitesseEngagee) {
        this.vitesseEngagee = vitesseEngagee;
    }

    public int getVitesseCourante() {
        return vitesseCourante;
    }

    public void setVitesseCourante(int vitesseCourante) {
        this.vitesseCourante = vitesseCourante;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public static int getNbRoues() {
        return nbRoues;
    }

    public static void setNbRoues(int nbRoues) {
        Voiture.nbRoues = nbRoues;
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }
}
