/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.gestionBudget.model.service.util;

import java.math.BigDecimal;

/**
 *
 * @author YOUNES
 */
public class NumberUtil {
    private static final String CHAINE_VIDE=""; 
    
    public static BigDecimal toBigDecimal(String value){
        if(value==null || value.isEmpty()){
            return BigDecimal.ZERO;
        }else{
            return new BigDecimal(value);
        }
    }
    public static String toString(BigDecimal value){
        if(value==null){
            return CHAINE_VIDE;
        }else{
            return String.valueOf(value);
        }
    }
    public static Double toDouble(String value){
        if(value==null || value.isEmpty()){
            return 0D;
        }else{
            return Double.parseDouble(value);
        }
    }
}
