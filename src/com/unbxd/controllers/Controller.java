package com.unbxd.controllers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.unbxd.model.Node;
import com.unbxd.utils.Algorithms;

public class Controller {

	public static void main(String[] args) throws Exception {
		Node a = new Node("a");
		Node b = new Node("b");
		Node c = new Node("c");
		Node d = new Node("d");
		Node e = new Node("e");
		Node f = new Node("f");
		Node g = new Node("g");
		Node h = new Node("h");
		
		a.getFriends().add(b);
		a.getFriends().add(c);
		b.getFriends().add(d);
		b.getFriends().add(e);
		b.getFriends().add(c);
		b.getFriends().add(a);
		c.getFriends().add(a);
		c.getFriends().add(b);
		c.getFriends().add(e);
		c.getFriends().add(f);
		d.getFriends().add(b);
		d.getFriends().add(g);
		e.getFriends().add(b);
		e.getFriends().add(c);
		e.getFriends().add(f);
		e.getFriends().add(g);
		f.getFriends().add(c);
		f.getFriends().add(e);
		f.getFriends().add(h);
		g.getFriends().add(d);
		g.getFriends().add(e);
		g.getFriends().add(h);
		h.getFriends().add(g);
		h.getFriends().add(f);
		System.out.println(Algorithms.bfs(a, c));
	}
}


