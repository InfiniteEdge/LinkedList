package com.example.awesomefat.linkedlist;

import android.widget.LinearLayout;

/**
 * Created by Nick on 2/17/2016.
 */
public class Stack extends LinkedList
{
    public Stack(LinearLayout layout)
    {
        super(layout);
    }

    public Node peek()
    {
        return this.getAtIndex(1);
    }

    public Node pop()
    {
        return this.removeFront();
    }

    public void push(String value)
    {
        this.addFront(value);
    }
}
