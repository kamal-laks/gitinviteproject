package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public  class Entry
    {
        public int depth;
        public String text;

        public Entry(int _d, String _t)
        {
            depth = _d;
            text = _t;
        }
    }

    public class Node
    {
        public Entry entry;
        public List<Node> children;

        public Node(Entry _e)
        {
            entry = _e;
            children = new ArrayList<Node>() ;
        }
    }

    public  Node Buildtree(List<Entry> entries)
    {
        Stack<Node> st = new Stack<>();
        Entry entry = new Entry(0, "");
        Node node = new Node(entry);
        st.push(node);

        for(int i =0; i<entries.size(); i++)
        {
            Entry ent = entries.get(i);

            while(st.peek().entry.depth >= ent.depth)
            {
                st.pop();
            }
            var nd = new Node(ent);
            st.peek().children.add(nd);

        }

        return node;

    }
}
