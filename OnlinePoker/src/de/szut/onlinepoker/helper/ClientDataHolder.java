package de.szut.onlinepoker.helper;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import de.szut.onlinepoker.helper.io.Packet;

public class ClientDataHolder {
	public Socket socket;
	
	public ClientDataHolder(Socket socket){
		
	}
	
	public void updateClient(Packet packet){
		
		
		PrintWriter clientComm = null;
		try {
			
			clientComm = new PrintWriter(socket.getOutputStream(), true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clientComm.write(packet.intoString());
	}
}
