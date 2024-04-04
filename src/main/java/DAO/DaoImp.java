package DAO;

import org.springframework.stereotype.Component;

@Component("DAO")
public class DaoImp implements IDao{

    @Override
    public double getData() {
        System.out.println("Version base de donnes");
        return Math.random()*40;
    }
}
