package com.unbxd.model;

import java.util.HashSet;
import java.util.Set;

public class Node {

	private String userName;
	private Set<Node> friends;
	private Integer count;
	
	@Override
	public int hashCode() {
		return userName.hashCode();
	}
	
	public Node(String userName) {
		this.userName = userName;
		this.friends = new HashSet<>();
		this.count = 0;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public boolean equals(Object obj) {
		return userName.equals(((Node)obj).getUserName());
	}
	
	public String getUserName() {
		return userName;
	}
	
	public Set<Node> getFriends() {
		return friends;
	}
	
	
	
}


