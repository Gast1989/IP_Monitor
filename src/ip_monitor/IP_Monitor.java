package ip_monitor;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IP_Monitor {

    // Envia un pedido de ping a determinado IP
    public static void enviarPedidoDePing(String IP) throws UnknownHostException, IOException{
        InetAddress terminal = InetAddress.getByName(IP);
        System.out.println("Enviado pedido de Ping a " + IP);
        
        if (terminal.isReachable(2000))
        System.out.println("Host alcanzado...");
        else
        System.out.println("Host NO alcanzado..."); 
    }
    
    // Driver
     public static void main(String[] args) throws UnknownHostException, IOException {
       
        while(true){
        String IP = "127.0.0.1";
        enviarPedidoDePing(IP);
        System.out.println(" ");
  
        IP = "133.192.31.42";
        enviarPedidoDePing(IP);
        System.out.println(" ");
  
        IP = "145.154.42.58";
        enviarPedidoDePing(IP);
        System.out.println(" ");
        }
    }
}