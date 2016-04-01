/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecme.sessionbeans;

import com.ecme.entities.PartsEntity;
import com.ecme.facade.PartsBeanFacade;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

/**
 *
 * @author edgar
 */
@Stateless
//@LocalBean
public class QuestionBean implements QuestionRemote{
    
    
    @EJB
    PartsBeanFacade pbf;
    
    String question="";

    @Override
    public void addQuestion(String question) {
        System.out.println("Question add "+question);
        this.question=question;
    }

    @Override
    public void updateQuestion(String question) {
        System.out.println("Question updated "+question);
       this.question=question;

    }
    public String getQuestion(){
        return question;
    }

    @Override
    public List<PartsEntity> getParts() {
        return pbf.findAll();
    }
    
    @PostConstruct
    public void init(){
        System.out.println("Inicializando bean QuestionRemote");
    }
    
    @PreDestroy
    public void destroy(){
           System.out.println("Destruyendo bean QuestionBean");
    }
    
}
