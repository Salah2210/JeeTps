package Injectiondesdépendances_Spring.presentation;

import org.springframework.context.ApplicationContext;
import  org.springframework.context.support.ClassPathXmlApplicationContext;

import Injectiondesdépendances_Spring.metier.IMetier;

public class PresentationSpring {
  public static void main(String[] args){
      ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
      IMetier m = (IMetier) context.getBean("metier");
      System.out.println(m.calcul());
  }
}
