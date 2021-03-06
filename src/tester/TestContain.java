package tester;

import menu.Allergen;
import menu.DishType;
import menu.MenuElement;

public class TestContain {

    public static void main(String[] args) {
        MenuElement m = new MenuElement("pasta","P1", DishType.FIRST_COURSE,
                                        10.0,false, false, false);
        Allergen a1 = new Allergen("A","A1");
        Allergen b1 = new Allergen("B","A2");

        m.addAllergen(a1);
        m.addAllergen(a1);
        m.addAllergen(b1);

        System.out.println("TEST PER VERIFICARE IL COMPORTAMENTO DELLA CONTAINS NELL'ARRAYLIST" +
                           " DI ALLERGENI IN MENUELEMENT");

        System.out.println("Elenco iniziale allergeni : " + m.showAllergenes());

        m.removeAllergen(b1);

        System.out.println("Dopo aver tolto allergene b1 : " + m.showAllergenes());


    }

}
