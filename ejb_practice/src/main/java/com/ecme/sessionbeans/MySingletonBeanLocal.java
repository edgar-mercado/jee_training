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
public interface MySingletonBeanLocal {
        void increment();
    int getNumber();
}
