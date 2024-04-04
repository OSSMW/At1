package Ext;

import DAO.IDao;

public class DaoImplVWS implements IDao {
    @Override
    public double getData() {
        System.out.println("Vesion Web Service");
        return 90;
    }
}
