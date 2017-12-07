package Apresentacao;

import EDA.*;

/**
 * @author UDESC
 */
public class Main {
    public static Administrador adm;
    public static Usuario user;
    public static MenuAdm menuAdm;
    public static MenuCaixa menuCaixa;
    
    private Main(){}
    
    public static void main(String args[]){
        Login tela = new Login();
        tela.setVisible( true );
    }
}