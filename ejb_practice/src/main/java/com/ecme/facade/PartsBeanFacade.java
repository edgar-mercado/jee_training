/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecme.facade;

import com.ecme.entities.PartsEntity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author edgar
 */
@Stateless
public class PartsBeanFacade extends AbstractFacade<PartsEntity> {
    @PersistenceContext(unitName = "ejb_practicePU")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager(){
        return em;
    }
    public PartsBeanFacade(){
        super(PartsEntity.class);
    }
}
