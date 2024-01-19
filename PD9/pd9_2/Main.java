/**
 * Realizuokite parduotuvės funkcionalumą. Parduotuvė parduoda prekes: maisto prekes, alkoholinius
 * gėrimus, knygas ir laikraščius. Bet kokios parduodamos prekės savybė:
 * - Pavadinimas
 * - Kaina
 * Prekė žino savo kaina ir kainą su PVM. Apie PVM tarifus galite paskaityti čia: ”Pridėtinės
 * vertės mokestis”. Klientai gali apsipirkti parduotuvėje ir nupirkti bet kokias ir bet kiek prekių.
 * Apmokant prekių krepšelį klientui turi būti nurodoma bendra prekių kaina, kaina su PVM ir kaina
 * doleriais pagal galiojanti šiai dienai Eur / USD keitimo kursą. Taip pat parduotuvėje gali vykti
 * įvairios akcijos, tad klientui turi būti pritaikomos nuolaidos jei tokios priklauso.
 */

package lt.techin.pd9_2;

public class Main {
    public static void main(String[] args) {
        Food bread = new Food("Vilniaus duona", 1.69);
        Medicine panadol = new Medicine("Panadol", 2.50);
        Alcohol likeris = new Alcohol("Bosca", 15.0);

        ShoppingCart myShoppingCart = new ShoppingCart();
        myShoppingCart.addItem(bread);
        myShoppingCart.addItem(panadol);
        myShoppingCart.addItem(likeris);

        System.out.println(myShoppingCart.getTotalPrice());
        System.out.println(myShoppingCart.getTotalPriceWithVat());

    }
}
