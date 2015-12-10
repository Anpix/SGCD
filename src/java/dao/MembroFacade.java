/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Membro;

/**
 *
 * @author tavarerc
 */
@Stateless
public class MembroFacade extends AbstractFacade<Membro> {

    @PersistenceContext(unitName = "SGCDPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MembroFacade() {
        super(Membro.class);
    }
    
}
