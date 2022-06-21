/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploprototype;

import java.awt.Color;

/**
 *
 * @author vncserver
 */
public class PrototypeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        PrototipoJogador jogador1 = new PrototipoJogadorZagueiro().clonar();
        
        jogador1.setHabilidade(32);
        
        PrototipoJogador jogador2 = new PrototipoJogadorAtacante().clonar();        
        
        PrototipoJogador jogador3 = new PrototipoJogadorAtacanteExcepcional().clonar();        
        


        System.out.println("jogador1 -> "+jogador1.toString());
        
        System.out.println("jogador2 -> "+jogador2.toString());
        
        System.out.println("jogador3 -> "+jogador3.toString());
        
                
        
    }
}

