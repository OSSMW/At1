package Presentation;

import DAO.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(new File("config.txt"));
        // Lire la première ligne du fichier "config.txt" qui contient le nom de la classe DAO à utiliser
        String daoClassName = scanner.nextLine();
        // Charger dynamiquement la classe DAO spécifiée dans "config.txt"
        Class<?> cDao = Class.forName(daoClassName);
        // Instancier la classe DAO chargée
        IDao dao = (IDao) cDao.newInstance();
        // Appeler la méthode getData() de l'instance DAO et afficher le résultat
        System.out.println(dao.getData());

        // Lire la prochaine ligne du fichier "config.txt" qui contient le nom de la classe métier à utiliser
        String metierClassName = scanner.nextLine();
        // Charger dynamiquement la classe métier spécifiée dans "config.txt"
        Class<?> cMetier = Class.forName(metierClassName);
        // Instancier la classe métier chargée
        IMetier metier = (IMetier) cMetier.newInstance();
        // Obtenir la référence à la méthode "setDao" de la classe métier
        Method method = cMetier.getMethod("setDao", IDao.class);
        // Appeler dynamiquement la méthode "setDao" sur l'instance de la classe métier
        // L'équivalent de la ligne de code commentée : metier.setDao(dao);
        method.invoke(metier, dao);
        System.out.println("Resultat : " + metier.calcul());
    }
}
