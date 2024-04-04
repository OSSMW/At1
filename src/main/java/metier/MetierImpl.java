package metier;

import DAO.DaoImp;
import DAO.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier {
    @Autowired
    private IDao dao ; //couplage faible

    public MetierImpl(){}
    public MetierImpl(IDao dao){
        this.dao=dao;
    }
    @Override
    public double calcul() {
        double t = dao.getData();
        return  t* 432/Math.cos(t*Math.PI);
    }
// Injecter dans la variable dao un objet d'une classe qui implementer l'interface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
