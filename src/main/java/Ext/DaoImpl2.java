package Ext;

import DAO.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Captures");
        return Math.random()*80;
    }
}
