package com.graphbipertite;
import java.util.*;

public class Bipertite {
	private Map<Character, List<Character>> graph;

    public Bipertite(Map<Character, List<Character>> graph) {
        this.graph = graph;
    }

    public boolean traversal(char source) {
        Map<Character, Character> color = new HashMap<>();

        color.put(source, 'G');

        Queue<Character> queue = new LinkedList<>();
        queue.add(source);

        while (!queue.isEmpty()) {
            char u = queue.remove();

            for (char v : graph.get(u)) {
                if (color.get(u) == 'G' && color.get(v)==null) {
                    color.put(v, 'R');
                    queue.add(v);
                }
                else if (color.get(u) == 'R' && color.get(v)==null){
                	color.put(v, 'G');
                	queue.add(v);
                }
                if(color.get(v)==color.get(u)) {
                	return false;
                }
            }   
            
        }
        return true;
        
    }
}
