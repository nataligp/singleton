/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class janela2 {

    private static janela2 instancia;

    private janela2() {

    }
    
    public static synchronized janela2 getInstance(){
        if(instancia == null){
            instancia = new janela2();
        }
        return instancia;
    } 

}
