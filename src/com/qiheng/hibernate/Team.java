package com.qiheng.hibernate;

import java.util.Map;

public class Team {

	private String id;
	
	private String teamName;
	
	private Map mates;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Map getMates() {
		return mates;
	}

	public void setMates(Map mates) {
		this.mates = mates;
	}
	
	
}
