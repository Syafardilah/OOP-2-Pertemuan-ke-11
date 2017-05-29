/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author windows7
 */
public class NuclearPower implements Socket {
    
    @Override
    public String getPower() {
        return ("ini tenaga nuklir");
    }
    
    @Override
    public void countPower() {
        System.out.println("ini tenaga panas");
    }
}
