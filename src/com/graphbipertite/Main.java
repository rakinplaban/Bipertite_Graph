package com.graphbipertite;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Map<Character, List<Character>> adjList = new HashMap<>();
        adjList.put('r', Arrays.asList('v','s'));
        adjList.put('s', Arrays.asList('r', 'w'));
        adjList.put('t', Arrays.asList('w','x','u'));
        adjList.put('u', Arrays.asList('t','y'));
        adjList.put('v', Arrays.asList('r'));
        adjList.put('w', Arrays.asList('s','t','x'));
        adjList.put('x', Arrays.asList('t','u','w'));
        adjList.put('y', Arrays.asList('u','x'));

        Bipertite bfs = new Bipertite(adjList);
        System.out.println(bfs.traversal('x'));
	}
}
