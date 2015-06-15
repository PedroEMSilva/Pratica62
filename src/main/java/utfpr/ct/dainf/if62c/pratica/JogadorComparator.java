/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.Comparator;

/**
 *
 * @author Cliente
 */
public class JogadorComparator implements Comparator<Jogador>{
    boolean n1;
    boolean n2;
    boolean n3;
    public JogadorComparator (){
        n1=true;
        n2=true;
        n3=true;
    }
    public JogadorComparator (boolean n1,boolean n2,boolean n3){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
   public int compare(Jogador o1, Jogador o2){
       return 1;
   }
    
    
    
}
