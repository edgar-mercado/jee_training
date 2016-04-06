/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecme.sessionbeans;

import com.ecme.entities.PartsEntity;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author edgar
 */
@Local
public interface QuestionRemote {
    public void addQuestion(String question);
    public void updateQuestion(String question);
    public String getQuestion();
    public List<PartsEntity> getParts();
    
}
