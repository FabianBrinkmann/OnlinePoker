package de.szut.onlinepoker.server;

import java.util.ArrayList;

import de.szut.onlinepoker.helper.ClientDataHolder;

public class PokerMasterserver {
	
	protected ArrayList<ClientDataHolder> clients = new ArrayList<>();
	
	public void registerClient(ClientDataHolder newClient){
		if(!clients.contains(newClient)){
			clients.add(newClient);
		}
	}
	
	public void unregisterClient(ClientDataHolder rmClient){
		if(clients.contains(rmClient)){
			clients.remove(rmClient);
		}
	}
	
	public void updateClient(){
		
	}
}
