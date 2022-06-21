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
public class PrototipoJogadorAtacanteExcepcional extends PrototipoJogador{    
    
    @Override
    public PrototipoJogador clonar() {
        PrototipoJogador jogadorAtacanteExcep = new PrototipoJogadorAtacanteExcepcional();
        
        jogadorAtacanteExcep.setHabilidade(34);
        jogadorAtacanteExcep.setVelocidade(28);
        jogadorAtacanteExcep.setForca(30);
        jogadorAtacanteExcep.setTipo("Atacante Excepcional");
        
        return jogadorAtacanteExcep;
    }
    
}
