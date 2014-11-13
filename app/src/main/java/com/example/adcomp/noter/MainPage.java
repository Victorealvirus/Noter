package com.example.adcomp.noter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;


public class MainPage extends Activity {

    ArrayList note = new ArrayList();
    int noteCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        Button newNote = (Button) findViewById(R.id.BNewNote);
        newNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringIPDialog

            }
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    //adding new note

    void createNewNote(){
        String tempString = "";
        if (tempString == "")
            Toast.makeText(getBaseContext().getApplicationContext(), "There is no text in this field", Toast.LENGTH_SHORT).show();

        tempString = runWidgetToEnterString();

        addItemToList(tempString);
    }//open new page for note taking ends

    String runWidgetToEnterString(){
        String tempString = "";
        return tempString;
    }//string entry widget ends

    void addItemToList(String entry){ //runs when add new note is pressed

        note.add(noteCounter, entry);
        noteCounter++;

    }//add item ends

    //adding new note ends


    //showing notes
    void populateMenu(){

    }//population ends

    void getItemFromDB(){

    }//getting item from database ends

    void manipulateString(){

    }//string manipulation ends

    //showing notes ends

    //removing element
    void removeElement(int index){
        noteCounter--;
    }//remove element ends

    void deleteDBEntry(){

    }//deleting database entry ends

    //removing element ends


    /*reminder
    void addReminder(){

    }//add reminder ends

    void runReminder(){

    }//run reminder ends
    */ //reminder ends

}//class ends
