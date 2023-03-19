package Injectiondesdépendances_Spring.metier;

import Injectiondesdépendances_Spring.dao.IDao;

public class MetierV3 implements IMetier{

    IDao dao;

    @Override
    public double calcul() {
        double d =dao.getData();
        return d*2021;
    }

    public void setDao(IDao d) {
        this.dao = d;
    }
}
