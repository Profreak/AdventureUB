package de.l_infotech.adventure.model;

import java.util.ArrayList;
import java.util.List;

public class GameLogic {

	public List<String> getListOfPossibilities() {
		
		List<String> list = new ArrayList<String>();
		list.add("Go deeper!");
		list.add("Exit");
		
		return list;
	}

	public String doCommand(int cmd) {
		// TODO Auto-generated method stub
		return null;
	}

}
