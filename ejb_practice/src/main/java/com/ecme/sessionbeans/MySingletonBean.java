/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecme.sessionbeans;

import javax.ejb.Singleton;

/**
 *
 * @author edgar
 */
@Singleton
public class MySingletonBean implements MySingletonBeanLocal {
    
    int number;

    @Override
    public void increment() {
        number++;
    }

    @Override
    public int getNumber() {
        return number;
    }


}
