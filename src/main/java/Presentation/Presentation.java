package Presentation;

import Ext.DaoImpl2;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        DaoImpl2 daoImp = new DaoImpl2();
        MetierImpl metier = new MetierImpl(daoImp);
        System.out.println("result" + metier.calcul());
    }

}
/*
  L'utilisation d'un framework IoC permet de séparer ces deux aspects
* et de simplifier le développement en permettant au développeur de se concentrer sur le code métier.
* */