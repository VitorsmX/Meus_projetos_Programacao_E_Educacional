/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaFactoryMethod;

/**
 *
 * @author Nilson
 */
public class FactoryMicrofone {
    
    public static microfone getMic(String tipoMic) {
        
        if (null == tipoMic) 
            return null;
        
        else switch (tipoMic) {
            case "SpeechMike":
                return new SpeechMike();
            case "MicHeadset":
                return new MicHeadset();
            case "MicComum":
                return new MicComum();
            case "MicMediano":
                return new MicMediano();
            default:
                return null;
        }
       
        
    }
    
}
