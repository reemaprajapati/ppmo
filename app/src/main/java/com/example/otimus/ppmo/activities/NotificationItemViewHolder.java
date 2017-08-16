package com.example.otimus.ppmo.activities;


import android.app.Dialog;
import android.app.Notification;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import android.widget.TextView;
import android.widget.Toast;

import com.example.otimus.ppmo.R;

import org.w3c.dom.Text;

import static android.R.attr.id;

public class NotificationItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView nTitle;
    public TextView nDescription;
    AlertDialog alertDialog1;
    AlertDialog alertDialog2;
    CharSequence[] categories = {" Goods "," Works "," Consultancy Services ","Ration","User Committee","Other Services"};
    CharSequence[] times = {" 1 hour before "," 2 hours before "," 1 day before "};

    public NotificationItemViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        nTitle = (TextView) itemView.findViewById(R.id.titleList);
        nDescription = (TextView) itemView.findViewById(R.id.descriptionList);

    }

    @Override
    public void onClick(View view) {

        int id = getPosition();
        if (id == 0) {
            CreateAlertDialogWithRadioButtonGroup() ;



        } else if (id == 1) {
            CreateAlertDialogWithRadioButtonGroup() ;

        } else if (id == 2) {


        }
    }

    public void CreateAlertDialogWithRadioButtonGroup() {
        AlertDialog.Builder builder = new AlertDialog.Builder(itemView.getContext());
        AlertDialog.Builder builder1 = new AlertDialog.Builder(itemView.getContext());


        builder.setTitle("Select Your Category");
        builder.setSingleChoiceItems(categories, -1, new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int item) {

                switch(item)
                {
                    case 0:

                       nDescription.setText("Goods");

                        break;
                    case 1:
                        nDescription.setText("Works");

                        break;
                    case 2:

                        nDescription.setText("Consultancy Services");
                        break;
                    case 3:

                        nDescription.setText("Ration");
                        break;
                    case 4:

                        nDescription.setText("User Committee");
                        break;
                    case 5:

                        nDescription.setText("Other Services");
                        break;
                }
                alertDialog1.dismiss();
            }
        });
        alertDialog1 = builder.create();
        alertDialog1.show();

        builder1.setTitle("Set the notification time");
        builder1.setSingleChoiceItems(times, -1, new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int item) {

                switch(item)
                {
                    case 0:

                        nDescription.setText("1 hour before");

                        break;
                    case 1:
                        nDescription.setText("Works");

                        break;
                    case 2:

                        nDescription.setText("Consultancy Services");
                        break;

                }
                alertDialog1.dismiss();
            }
        });
        alertDialog2 = builder1.create();
        alertDialog2.show();

    }
}