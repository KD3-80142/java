package com.sunbeam;

public class PartyVotes {
	private  int votes;
	private String party;
    public PartyVotes() {
		// TODO Auto-generated constructor stub
	}
	public int getVotes() {
		return votes;
	}
	
	public PartyVotes(int votes, String party) {
		this.votes = votes;
		this.party = party;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	@Override
	public String toString() {
		return "PartyVotes [votes=" + votes + ", party=" + party + "]";
	}
	
	
	
}
