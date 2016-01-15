package com.example.getreadynow.dialogsmenus;

//This class is used a custom dialog window

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by AlHassaneAgne on 1/15/16.
 */
public class CustomDialogFragment extends DialogFragment {


    //Override this method to create our dialog box
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        //first build the dialog
        AlertDialog.Builder  myDialog = new AlertDialog.Builder(getActivity());

        //Set the title of the dialog
        myDialog.setTitle("Custom Dialog Box");

        //Set the message for the dialog
        myDialog.setMessage("Select one of the following actions");

        //Define the response when the positive button is clicked
        myDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(getActivity(), "Clicked OK", Toast.LENGTH_SHORT).show();
            }
        });

        //Define the response when the negative button is clicked
        myDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Clicked cancel", Toast.LENGTH_SHORT).show();
            }
        });


        return myDialog.create();
    }
}
