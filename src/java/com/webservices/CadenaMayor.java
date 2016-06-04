/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webservices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author USER
 */
@WebService(serviceName = "CadenaMayor")
public class CadenaMayor {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cadenaMayor")
    public String cadenaMayor(@WebParam(name = "cadena1") String cadena1, @WebParam(name = "cadena2") String cadena2) {
        //TODO write your implementation code here:
        String cadenaMasLarga=cadena1;
        if(cadena2.length()>cadena1.length()){
            cadenaMasLarga=cadena2;
        }
        return cadenaMasLarga;
    }

    /**
     * This is a sample web service operation
     */
    
}
