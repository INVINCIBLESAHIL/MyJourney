package com.example.gauravmalik.myjourney.classes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.gauravmalik.myjourney.R;

/**
 * Created by GAURAV MALIK on 25-10-2017.
 */

// This is a dialog class that can be used in any activiy for showing error messages

public final class CustomDialogue extends DialogFragment implements View.OnClickListener{

    Button okay_button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // bringing view to take control of the button
        View view = inflater.inflate(R.layout.custom_dialog,null);

        // setting dialog uncancelled so that it cannot be closed by clicking in ideal area.
        setCancelable(false);
        okay_button = (Button) view.findViewById(R.id.okay_button);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onClick(View v) {
     if (v.getId() == R.id.okay_button){
         //Perform this if okay button is pressed in Dialog
     }
    }
}




/*
 code to use this Dilaog Fragment in Activity

FragmentManager manager = getFragmentManager();
CustomDialog customDialog = new CustomDialog();
customDialog.show(manager,"custom_dialog");

  */


