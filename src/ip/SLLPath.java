package ip;

import java.util.*;

public class SLLPath {
    static HashMap<Character,Node> nodeMap =new HashMap<>();
    public static void buildLinkedList(String input){
        String []s = input.split("->");
        Node firstElement=nodeMap.get(s[0].charAt(0)) , secondElement=nodeMap.get(s[1].charAt(0)) ;
        if(firstElement==null){
            firstElement = new Node(s[0].charAt(0));
            nodeMap.put(firstElement.data, firstElement);
        }
        if(secondElement==null){
            secondElement = new Node(s[1].charAt(0));
            nodeMap.put(secondElement.data, secondElement);
        }
        firstElement.out = secondElement;
    }

    public static boolean doLinkedListsIntersect(Collection<Node> nodes){
        HashSet<Node> localVisited;
        HashSet<Node> visited = new HashSet<>();

        for(Node n: nodes){
            n = nodeMap.get(n.data);
            localVisited = new HashSet<>();
            while(n!=null && !localVisited.contains(n)){
                if(visited.contains(n)) return true;
                localVisited.add(n);
                visited.add(n);
                n = n.out;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        buildLinkedList("a->b");
        buildLinkedList("r->s");
        buildLinkedList("b->c");
        buildLinkedList("x->c");
        buildLinkedList("q->r");
        buildLinkedList("y->x");
        buildLinkedList("w->z");

        ArrayList<Node> list= new ArrayList<>();
        list.add(new Node('a'));
        list.add(new Node('q'));
        list.add(new Node('w'));

        System.out.println(doLinkedListsIntersect(list));


        list=new ArrayList<>();
        list.add(new Node('a'));
        list.add(new Node('c'));
        list.add(new Node('r'));

        System.out.println(doLinkedListsIntersect(list));


    }
}

class Node{
    public Node out;
    public Character data;

    public Node(char data){
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return data == node.data;
    }

    @Override
    public int hashCode() {
        return this.data.hashCode();
    }
}
