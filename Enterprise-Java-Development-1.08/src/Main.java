import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
//EXERCISE 1
        double doub = 39.9897876;
        BigDecimal doubBig = new BigDecimal(doub);
        doubBig = doubBig.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("The number is : " + doubBig);

//EXERCISE 2

        double doub1 = 39.9897876;
        BigDecimal bd = new BigDecimal(doub1);
        System.out.println("The number is" + Math.round((doub1 * -1) * 10.0) / 10.0);


//EXERCISE3
        Sedan coche1 = new Sedan("345KJU", "Mitsubishi", "Extra", 170.00);
        System.out.println(coche1);

        UtilityVehicle coche2 = new UtilityVehicle("123LKO", "NR", "Golf", 120, true);
        System.out.println(coche2);

        Truck coche3 = new Truck("1098ILJ", "SEAT", "NR3", 90, 900);
        System.out.println(coche3);

//EXERCISE 4

        Movie pelicula1 = new Movie("El señor de los Anillos", "aventura", "2h 20minutos", 2005);

        System.out.println(pelicula1);

        TvSeries tvSeries1 = new TvSeries("El señor de los Anillos", "aventura", "2h 20minutos", 209, 3);

        System.out.println(tvSeries1);

//EXERCISE 5 --> :(

    }
}