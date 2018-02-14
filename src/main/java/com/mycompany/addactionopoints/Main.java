/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.addactionopoints;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author abraham
 */
public class Main {
    
    
    public static void main(String[] args)throws Exception{
        try{
    AvatarDAO dao= new AvatarDAO();
    int i = 0;
     LocalDateTime ldt = LocalDateTime.now();
    while(1>0){
        if(ldt.getMinute()==0&&ldt.getSecond()==0&&i!=ldt.getSecond()){
            dao.updatePAAll();
            System.out.println("Add PA");
        } 
        i = ldt.getSecond();
        ldt = LocalDateTime.now();
        
        System.out.println(ldt.getHour()+":"+ldt.getMinute()+":"+ldt.getSecond());
        System.out.println(i);
    }
    }
        catch(Exception e){
            throw e;
        }}
}
