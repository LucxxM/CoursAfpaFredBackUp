package main.travail.ProgrammationObjet.entity;

public class Voiture {
    public static int nbRoues = 4;

    private String marque;
    private String immatriculation;
    private int nbPortes = 4;
    private int vitesseEngagee = 0;
    private int vitesseCourante = 0;
    private int vitesse = 0;
    private String couleur;

    private Moteur moteur;

    public Voiture(){
        System.out.println("Une voiture est instanciée avec un constructeur sans parametre");

    }

    public Voiture(String couleur){
        this.couleur = couleur;
    }

    public Voiture(Moteur moteur){
        System.out.println("Une voiture est crée avec le constructeur qui prend en parametre un moteur");
        this.moteur = moteur;
    }

    public Voiture(String couleur, int nbCylindres, String motorisation){
        this.couleur = couleur;
        Moteur moteur = new Moteur(nbCylindres, motorisation);
        this.moteur = moteur;
    }

    // Méthodes (comportements)

    // Mehode sans retour (void) et sans paramétres
    public static void klaxonner(){
        System.out.println("Tut tut");
    }

    // Methode avec 1 parametre
    public static int donnerNouvelleVitesse(int vitesseActuelle){
        return vitesseActuelle+10;
    }

    // Methode avec retour
    public int donnerVitesse(){
        return 100;
    }

    // Methode avec plusieurs parametres
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

    public void transporter (Passager passager){
        System.out.println("Je transporte un passager qui s'appelle "+ passager.getPrenom() +" " + passager.getPrenom());
    }

    public Ville transporter (Passager passager, Ville ville){
        System.out.println("Je transporte un passager qui s'appelle "+ passager.getPrenom() +" " + passager.getPrenom() +
                " en partant de " +ville.getNom());

        Ville villeArrivee = new Ville();
        villeArrivee.setNom("Paris");
        return villeArrivee;
    }

    public static int donnerNbRoues(){
        return nbRoues++;
    }


    public static int getNbRoues() {
        return nbRoues;
    }

    public static void setNbRoues(int nbRoues) {
        Voiture.nbRoues = nbRoues;
    }

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

    public Moteur getMoteur() {
        return moteur;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }
}
