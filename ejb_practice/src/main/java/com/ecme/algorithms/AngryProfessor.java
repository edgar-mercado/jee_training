/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecme.algorithms;
/**
 *
 * @author emercado
 */
public class AngryProfessor {
    public boolean executeTest(){
            int countOnTime=0;
            // int T = 2;
            // for (int t=1; t<=T; t++){
            int N=4;
            int K=3;
            String times = "-1 -3 4 2";
            String a[]=times.split(" ");
            for (int i=0; i<=N-1; i++){
                if (Integer.parseInt(a[i])<=0)
                    countOnTime+=1;
            }
            if (countOnTime<K)
                System.out.println("YES");
            else
                System.out.println("NO");
            countOnTime=0;
        //}
        return true;
    }
}
