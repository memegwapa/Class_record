/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;


import load.loading;
import load.main1;

/**
 *
 * @author user
 */
public class main {

    
public static void main(String[] args) {
   loading l = new loading();
        l.setVisible(true);
        main1 m = new main1();
        m.setVisible(false);
        
        try {
            for (int x = 0; x < 100; x++) { // Changed loop condition
                Thread.sleep(10);
                l.loads.setText(Integer.toString(x)+"%");
             
                if (x == 100) { // Changed condition to match loop
                    l.setVisible(false);
                    m.setVisible(true);
                }
            }
        } catch (Exception e) {
          
        }
}
}

