package restaurant;

import menu.DishType;
import menu.Menu;
import menu.MenuElement;
import services.DbReader;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private int nCover;
    private Catalogue dishesCatalogue;
    private ArrayList<Reservation> reservationList;


    public Restaurant(String name, int nCover) {
        this.name = name;
        this.nCover = nCover;
        this.dishesCatalogue = new Catalogue();
        this.reservationList = new ArrayList<>();
    }

    public String getName() {

        return name;
    }

    public int getnCover() {

        return nCover;
    }


    public Catalogue getDishesCatalogue() {

        return dishesCatalogue;

    }

    public void addToCatalogue ( MenuElement element){

        dishesCatalogue.addElement(element);

    }

    public void removeFromCatalogue ( MenuElement elem){

        dishesCatalogue.removeElement(elem);

    }

    public void addDish(Reservation res, Menu menu, MenuElement menuElement){

        res.addDish(menu, menuElement);
    }

    public void removeDish(Reservation res, Menu menu, MenuElement menuElement){

        res.removeDish(menu, menuElement);
    }

    public String showCatalogue (){

        String tmp = "Catalogo del ristorante \" " + name + " \" :\n" ;
            tmp += dishesCatalogue.toString();
        return tmp ;

    }
}