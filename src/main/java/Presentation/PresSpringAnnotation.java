package Presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("DAO","metier");
        //  récupérer un bean qui implémente l'interface IMetier
        IMetier metier=context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
