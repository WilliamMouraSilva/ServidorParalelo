/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author william
 */
public class Servidor {
    private ServerSocket server;
    private Socket cliente;
    
    public Servidor(){
        this.server=null;
        this.cliente=null;
    }
    
    public void Conexao(){
        try{
            server=new ServerSocket(1234);
            System.out.println("Aguardando conexão na porta: 1234");
            while(true){
                cliente=server.accept();
                System.out.println("Conexão recebida."+cliente.getInetAddress().getHostName());
            }
            
        }catch(IOException e){
            System.out.println("Erro: "+e.getMessage());
        }
        finally{
            try{
                if(server!=null){
                    server.close();
                }
            }catch(IOException e){
                System.out.println("Erro: "+e.getMessage());
            }
        }
    }
    
}
