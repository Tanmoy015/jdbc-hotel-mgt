package com.hsb.model;

public class Room {
	private int rId;
	private String type; // AC / nAC / Single / Double

	public Room(int rId, String type) {
		super();
		this.rId = rId;
		this.type = type;
	}

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Room [rId=" + rId + ", type=" + type + "]";
	}

}
