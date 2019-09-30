public class Hangar {

    public static void main(String[] args) {

        Car velSatis = new Car("Vel Satis", 0);
        Car pipo = new Car("Citrono Pipo", 150000);
        Boat koursk = new Boat("Koursk", -1);
        Boat lusitania = new Boat("Lusitania", -3);

        System.out.println(velSatis.doStuff());
        System.out.println("Cependant, j'ai " + velSatis.getKilometers() + " km au compteur. Personne n'a voulu m'acheter.");

        System.out.println(pipo.doStuff());
        System.out.println("J'ai un super système de freinage ! Mais il ne m'a pas servi en " + pipo.getKilometers() + " km.");

        System.out.println(koursk.doStuff());
        System.out.println("Je plonge vachement bien !");

        System.out.println(lusitania.doStuff());
        System.out.println("Je plonge encore mieux !!");






    }
}