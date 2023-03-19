package Injectiondesdépendances.metier;

import Injectiondesdépendances.dao.IDao;
public class MetierImpl implements IMetier{
    IDao dao;
    public double calcul(){
        double data =dao.getData();
        return data*10;
    }
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}