/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.cliente;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author william
 */
public class Cliente {
    private Socket cliente;
    
    public Cliente(){
        this.cliente=null;
    }
    public void Conectar(){
        try{
            while(true){
                cliente=new Socket("localhost",1234);
                Arquivo arquivo=new Arquivo();
                arquivo.EscolherArquivo();
            }
            
        }
        catch(IOException e){
            System.out.println("Erro: "+e.getMessage());
        }
        finally{
            try{
                cliente.close();
            }catch(IOException e){
                System.out.println("Erro para fechar:"+e.getMessage());
            }
        }
    }
}
