package com.example.phj_1.s305068s315303mappe1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

public class FinishDialog extends DialogFragment {

    private DialogClickListener callback;

    public interface DialogClickListener {
        public void onconfirm();

        public void newgame();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            callback = (DialogClickListener) getActivity();
        } catch (ClassCastException e) {
            throw new ClassCastException("Kallende klasse må implementere interfacet!");
        }
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity()).setTitle(R.string.quit)
                .setPositiveButton(R.string.confirm,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                callback.onconfirm();
                            }
                        }
                )
                .setNegativeButton(R.string.quit,
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog,int whichButton){
                                callback.newgame();
                            }
                        }
                )
                .create();
    }
}
