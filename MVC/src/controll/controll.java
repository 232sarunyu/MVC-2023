/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controll;

import Model.model;



/**
 *
 * @author tackt
 */
public class controll {

    public controll(String textf, int type) {
        this.textf = textf;
        this.type = type;
    }
    String textf ;
    int type ; 
    

    public void identifier(){
        model mo = new model(textf,type);
        
        mo.typecheck();
    }
    
    
}
