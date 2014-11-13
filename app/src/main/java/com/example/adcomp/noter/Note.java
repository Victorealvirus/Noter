package com.example.adcomp.noter;

import android.content.Context;
import android.widget.Toast;

import java.util.Date;

/**
 * Created by Adwait Nadkarni on 11/12/2014.
 */
public class Note {
    public String theNote;
    public int index;
    public Date creationTime;

    void Note(String argTheNote, int argIndex){
        setTheNote(argTheNote);
        creationTime = new Date();
    }//constructor ends

    void setTheNote(String argTheNote){


        theNote = argTheNote;



    }//setter

}//class ends
