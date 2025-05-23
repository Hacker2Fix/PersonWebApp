/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.entities.Pesron;

/**
 *
 * @author Hello
 */
@Stateless
public class PesronFacade extends AbstractFacade<Pesron> implements PesronFacadeLocal {

    @PersistenceContext(unitName = "PersonEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PesronFacade() {
        super(Pesron.class);
    }
    
}
