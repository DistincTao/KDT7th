package com.distinctao.controller;

import com.distinctao.controller.service.DeleteAllFriendService;
import com.distinctao.controller.service.DeleteFriendService;
import com.distinctao.controller.service.OuputEntireFriendService;
import com.distinctao.controller.service.OuputFriendByMobileService;
import com.distinctao.controller.service.OuputFriendByNameService;
import com.distinctao.controller.service.SaveFriendService;
import com.distinctao.controller.service.UpdateFriendAddrService;
import com.distinctao.controller.service.UpdateFriendMobileService;
import com.distinctao.controller.service.UpdateFriendNameService;
import com.distinctao.service.FriendManagementService;

public class Action {
	private static Action instance = null;
	
	private Action() {
		
	}
	
	public static Action getInstance() {
		if (instance == null) {
			instance = new Action();
		}
		return instance;
	}
	
	public FriendManagementService getService(int menu) {
		
		FriendManagementService result = null;
		
		switch (menu) {
		case 1 :
			result = new OuputEntireFriendService();			
			break;
		case 2 :
			result = new SaveFriendService();			
			break;
		case 3 :
			result = new OuputFriendByNameService();			
			break;
		case 4 :
			result = new OuputFriendByMobileService();			
			break;
		case 5 :
			result = new UpdateFriendNameService();			
			break;
		case 6 :
			result = new UpdateFriendMobileService();			
			break;
		case 7 :
			result = new UpdateFriendAddrService();			
			break;
		case 8 :
			result = new DeleteFriendService();			
			break;
		case 9 :
			result = new DeleteAllFriendService();			
			break;
		case 0 : 
			System.exit(0);
		}
		return result;
	}
	
	
}
