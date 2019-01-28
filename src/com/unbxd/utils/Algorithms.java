package com.unbxd.utils;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import com.unbxd.model.Node;

public class Algorithms {

	public static Integer bfs(Node root, Node target){
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		Set<Node> visited = new HashSet<>();
		while(!queue.isEmpty()){
			Node node = queue.poll();
			if(node!=null){
				if(node.getCount()>=30){
					break;
				}
				long count = node.getFriends()
					.stream()
					.filter(el -> el.getUserName().equals(target.getUserName())).count();
				
				if(count>0){
					return node.getCount()+1;
				}
				else{
					node.getFriends()
						.stream()
						.filter(el -> !visited.contains(el))
						.peek(el -> visited.add(el))
						.peek(el -> el.setCount(node.getCount()+1))
						.forEach(el -> queue.add(el));
				}
			}
		}
		return -1;
	}
}


