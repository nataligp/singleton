/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo;

/**
 *
 * @author FATEC ZONA LESTE
 */
public final class janela1 {
    
    private static final janela1 INSTANCE = new janela1();
    private static final String Teste = "Exemplo Singleton Privado";
    
    public static final String Singleton = "Exemplo de Singleton Público";
    
    public janela1(){
        
    }
    
    public static janela1 getInstace(){
        return INSTANCE;
    }
    public static void abrir(){
        System.out.println("Abrir janela!");
    }
    public static void fechar(){
        System.out.println("Fechar janela!");
    }
    
    
}
