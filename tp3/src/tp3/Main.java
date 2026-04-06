package tp3;

public class Main {

    static class Vehicule {
        protected String matricule;
        protected String marque;

        public Vehicule(String matricule, String marque) {
            this.matricule = matricule;
            this.marque = marque;
        }

        public void stationner() {
            System.out.println("Le vehicule se gare dans le parking.");
        }

        public void afficher() {
            System.out.println("Matricule : " + matricule + ", Marque : " + marque);
        }
    }

    static class Voiture extends Vehicule {

        private int nbPortes;

        public Voiture(String matricule, String marque, int nbPortes) {
            super(matricule, marque);
            this.nbPortes = nbPortes;
        }

        public void stationner() {
            System.out.println("La voiture se gare dans une place standard.");
        }

        public void afficher() {
            super.afficher();
            System.out.println("Nombre de portes : " + nbPortes);
        }
    }

    static class Moto extends Vehicule {

        private boolean avecCasque;

        public Moto(String matricule, String marque, boolean avecCasque) {
            super(matricule, marque);
            this.avecCasque = avecCasque;
        }

        public void stationner() {
            System.out.println("La moto se gare dans une place reservee aux deux-roues.");
        }

        public void afficher() {
            super.afficher();
            System.out.println("Avec casque : " + avecCasque);
        }
    }

    static class Camion extends Vehicule {

        private double chargeMax;

        public Camion(String matricule, String marque, double chargeMax) {
            super(matricule, marque);
            this.chargeMax = chargeMax;
        }

        public void stationner() {
            System.out.println("Le camion se gare dans une zone pour vehicules lourds.");
        }

        public void afficher() {
            super.afficher();
            System.out.println("Charge max : " + chargeMax);
        }
    }

    public static void main(String[] args) {

        Vehicule[] v = new Vehicule[4];

        v[0] = new Voiture("F2", "Peugeot", 4);
        v[1] = new Voiture("G2", "Dacia", 4);
        v[2] = new Moto("L4", " Kawasaki", true);
        v[3] = new Camion("H4", "Volvo", 4000);

        for (int i = 0; i < v.length; i++) {
            v[i].stationner();
            v[i].afficher();
            System.out.println("-----");
        }

        System.out.println("Voitures seulement:");

        for (int i = 0; i < v.length; i++) {
            if (v[i] instanceof Voiture) {
                v[i].afficher();
                System.out.println("-----");
            }
        }

  Vehicule x = new Moto("11C22", "Yamaha", true);
        
        if (x instanceof Voiture) {
            Voiture v1 = (Voiture) x;
            System.out.println("Downcasting reussi !");
        } else {
            System.out.println("Erreur: impossible de faire le cast");
        }
    }
}