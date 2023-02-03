package day22inheitancepolimorphism;

public class VehiculeRunner {
    public static void main(String[] args) {
        //EX1)car turunde rengi beyaz olan 54000 km de 250000TL fiyati olan
        //2020 model bir Honda accort ariyorum

        Vehicule car1=new Vehicule();
        HondaEccort ha=new HondaEccort(250000,2020);
        System.out.println(ha.price);
        System.out.println(ha.make);
        System.out.println(ha.model);
        System.out.println(ha.km);
        System.out.println(ha.year);

    }
}
