/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecme.sessionbeans;

import com.ecme.entities.PartsEntity;
import com.ecme.facade.PartsBeanFacade;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Remove;
import javax.ejb.Stateful;

/**
 *
 * @author edgar
 */
@Stateful
public class StatefulBean implements StatefulBeanLocal {
    
    String partName;
    int number;
    
    @EJB
    PartsBeanFacade pbf;

    @Override
    public void setPartName(String partName1) {
       partName=partName1;
    }

    @Override
    public void setPartNumer(int number1) {
        number=number1;
    }

    @Override
    public void finish() {
        System.out.println("Inserting entity****-**-*-*-*-*-*-*");
        PartsEntity entity= new PartsEntity();
        entity.setName(partName);
        entity.setPartNumber(number);
        pbf.create(entity);
                System.out.println("Inserting entity****-**-*-*-*-*-*-* 2222");

    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
   //@Remove
    public void endBean() {
        System.out.println("Removing bean from Container........ StatefulBean");
    }
    
       @PostConstruct
    public void init(){
        System.out.println("Inicializando bean StatefulBean");
    }
    
    @PreDestroy
    public void destroy(){
           System.out.println("Destruyendo bean StatefulBean");
    }
    
    @PrePassivate
    public void prePassivate(){
          System.out.println("PREPASIVATEEEEEEEEEEEEEEEEEEEEEEEE bean StatefulBean");
    }
    @PostActivate
    public void postActivate(){
          System.out.println("ACTIVATINGGGGGGGGGGGGGGGG bean StatefulBean");
    }
}
