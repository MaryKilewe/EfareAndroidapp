package com.example.marys.efareapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListBuses extends AppCompatActivity {

    ListView listView1;
    String buses[]={"City Hoppa", "Mash cool", "Sachin","Sumit","Tarun","Yogesh"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_buses);
        listView1=(ListView)findViewById(R.id.listView1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,buses);
        listView1.setAdapter(adapter);
        // Register the ListView  for Context menu
        registerForContextMenu(listView1);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Select The Action");
        menu.add(0, v.getId(), 0, "Show fare");//groupId, itemId, order, title
       // menu.add(0, v.getId(), 0, "SMS");
    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        if(item.getTitle()=="Show fare"){
            Intent intent = new Intent(this,PricePage.class);
            startActivity(intent);
            //Toast.makeText(getApplicationContext(),"calling code",Toast.LENGTH_LONG).show();
        }
      //  else if(item.getTitle()=="SMS"){
      //      Toast.makeText(getApplicationContext(),"sending sms code",Toast.LENGTH_LONG).show();
      //  }
        else{
            return false;
        }
        return true;
    }



    //-----------------------------------------------------------------------------------
}
