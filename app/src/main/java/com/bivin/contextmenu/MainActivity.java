package com.bivin.contextmenu;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout constraintLayout=findViewById(R.id.conlayout);
        registerForContextMenu(constraintLayout);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        //Method 1
        /*menu.setHeaderTitle("Select Any Option");
        menu.setHeaderIcon(R.mipmap.ic_launcher);
        menu.add("view More");
        menu.add("view less");
        menu.add("view High");*/
//Method 2
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.context_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        //Method 1
/*
        if(item.getTitle()=="view More"){
            Toast.makeText(getApplicationContext(),"View more",Toast.LENGTH_LONG).show();
        }*/

//Method 2
       // AdapterView.AdapterContextMenuInfo adapterContextMenuInfo= (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()){
            case R.id.viewmore:
                Toast.makeText(getApplicationContext(),"View Moere",Toast.LENGTH_LONG).show();
                break;
        }
        return super.onContextItemSelected(item);
    }
}
