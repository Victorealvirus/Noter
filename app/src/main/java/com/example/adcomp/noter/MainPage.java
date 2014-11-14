package com.example.adcomp.noter;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;


public class MainPage extends Activity {

    ArrayList<Note> note = new ArrayList<Note>();
    int noteCounter = 0; //points to the last element(still have to figure out how to get the real value on repopulate
    Activity mainPageActivity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);



        Button newNote = (Button) findViewById(R.id.BNewNote);
        newNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runIPPopup();
            }
        });

        Toast.makeText(getBaseContext().getApplicationContext(), "Back on main page", Toast.LENGTH_SHORT).show();
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


    void runIPPopup(){

        final EditText noteIPET = new EditText(mainPageActivity);
        noteIPET.setHint("Note");

        new AlertDialog.Builder(mainPageActivity)
                .setTitle("ENTER YOUR NOTE HERE")
                .setView(noteIPET)
                .setPositiveButton("DONE", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
         //               String temp = String.valueOf(noteIPET.getText());
                            String temp = "abc";
                        Toast.makeText(getBaseContext().getApplicationContext(), temp.length(), Toast.LENGTH_SHORT).show();

                        if (temp.equals(""))
                            Toast.makeText(getBaseContext().getApplicationContext(), "PLEASE ENTER NOTE", Toast.LENGTH_SHORT).show();
                        else

                            createNewNote(temp);
                    }
                }).setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int whichButton) {

            }//onclick cancel ends
        }).show();

    }//IP popup ends

    void createNewNote(String entry){ //runs when add new note is pressed
        //Note n1 = new Note(entry, noteCounter);
        //note.add(n1);
        noteCounter++;
        Toast.makeText(getBaseContext().getApplicationContext(), "new note created and the counter is " + noteCounter + " note is " + entry, Toast.LENGTH_SHORT).show();

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
