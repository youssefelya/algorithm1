package string;

import java.util.Set;

public class TriePattern {
    private Set<Node> graph;


    private static class Node{
        String data;
        Node next;
        Node(String symbol){this.data=symbol;}
    }

    private TriePattern TrieContraction(String[] patterns){
        TriePattern g =  new TriePattern();
        for(String s : patterns){

            for(int i=0; i<s.length(); i++){
                String currentSymbol = s.charAt(i)+"";
                Node currentNode = new Node(currentSymbol);
                for(Node node : graph){
                    if(node.data == currentSymbol){

                    }else{

                    }
                }
            }
        }
        return null;
    }
}
