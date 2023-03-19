package Injectiondesdépendances_Spring.dao;

public class SQL implements IDao{

    public double getData(){
        System.out.println("From SQL DB");
        return (10);
    }
}
