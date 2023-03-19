package Injectiondesdépendances.dao;

public class DaoNSQL implements IDao{
    public double getData(){
        System.out.println("From No SQL DB");
        return (10);
    }
}