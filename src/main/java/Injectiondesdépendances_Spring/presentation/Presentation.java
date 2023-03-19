package Injectiondesdépendances_Spring.presentation;

import Injectiondesdépendances_Spring.dao.DaoImpl;
import Injectiondesdépendances_Spring.dao.SQL;
import  Injectiondesdépendances_Spring.metier.MetierImpl;

public class Presentation {
    public static void main(String[] args){
        MetierImpl metier= new MetierImpl();
        SQL sql= new SQL();

        metier.setDao(sql);

        double resultat=metier.calcul();

        System.out.println("Résultat est: "+ resultat);
    }
}
