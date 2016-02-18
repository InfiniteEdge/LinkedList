package com.example.awesomefat.linkedlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class StackActivity extends AppCompatActivity
{
    private Button push;
    private Button peek;
    private Button pop;
    private TextView peekText;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack);

        this.push = (Button)this.findViewById(R.id.push);
        this.peek = (Button)this.findViewById(R.id.peek);
        this.pop = (Button)this.findViewById(R.id.pop);
        ListCore.newValueEditText2 = (EditText)this.findViewById(R.id.newValueET2);

        ListCore.inflater = this.getLayoutInflater();

        LinearLayout svLL2 = (LinearLayout)this.findViewById(R.id.scrollViewLL2);
        ListCore.ll = new LinkedList(svLL2);

        ListCore.ll.addEnd("6");
        ListCore.ll.addEnd("7");
        ListCore.ll.addEnd("8");
        ListCore.ll.display();


    }


    public void cButtonClicked(View sender)
    {
        if(sender == this.push)
        {
            System.out.println("**** push button pushed");
            System.out.println("adding: " + ListCore.newValueEditText2.getText());
            ListCore.ll.addFront(ListCore.newValueEditText2.getText().toString());
        }
        else if(sender == this.peek)
        {
            System.out.println("**** peek button pushed");

            Toast.makeText(getApplicationContext(),
                    "Your Number :  " + ListCore.newValueEditText2.getText().toString()+ " is at position : "
                    + ListCore.ll.getAtIndex(1),
                    Toast.LENGTH_LONG).show();

        }
        else if(sender == this.pop)
        {
            System.out.println("**** pop button pushed");
            ListCore.ll.removeFront();
        }
        ListCore.ll.display();
    }
}
