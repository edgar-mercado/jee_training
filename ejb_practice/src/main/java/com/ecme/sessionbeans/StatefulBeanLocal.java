/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecme.sessionbeans;

import javax.ejb.Local;

/**
 *
 * @author edgar
 */
@Local
public interface StatefulBeanLocal {
        void setPartName(String partName);
        
        void setPartNumer(int number);
        
        void finish();
        
        public void endBean();
    
}
