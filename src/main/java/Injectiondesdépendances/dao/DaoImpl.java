package Injectiondesdépendances.dao;
public class DaoImpl implements IDao{
    public double getData(){
        System.out.println("From SQL DB");
        return (7);
    }
}