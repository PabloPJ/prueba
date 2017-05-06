
package com.pablo.dao;

import com.pablo.model.Empleado;
import com.pablo.services.Iprueba;
import java.util.List;


public class empleadoDAO implements Iprueba<Empleado>{
    private final EntityManager em;

    @Override
    public boolean create(Empleado t) {
        try{
            em.gettransection().begin();
            em.persist(t);
        }
        catch{
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Empleado t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Empleado t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Empleado> fildByeQuery(String q) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleado findSingle(String q) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
