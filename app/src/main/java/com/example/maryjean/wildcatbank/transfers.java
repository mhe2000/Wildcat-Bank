package com.example.maryjean.wildcatbank;

/**
 * Created by Maryjean on 4/13/2016.
 */
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

/**
 * Created by hp1 on 21-01-2015.
 */
public class transfers extends Fragment {
    Button btn;
    int year_x,month_x,day_x;
    int hour_x,minute_x;
    static final int DIALOG_ID = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_transfers,container,false);
        return v;
    }

//    public void showDialogOnButtonClick() {
//        btn = (Button) findViewById(R.id.date_pick_button);
//
//        btn.setOnClickListener(
//            new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        showDialog(DIALOG_ID);
//                    }
//             }
//        );
//    }
//
//    @Override
//    protected Dialog onCreateDialog(int id){
//        if (id == DIALOG_ID)
//            return new DatePickerDialog(this, dpickerListner, year_x, month_x, day_x);
//        return null;
//    }
//
//    private DatePickerDialog.OnDateSetListener dpickerListner
//            = new DatePickerDialog.OnDateSetListener() {
//        @Override
//        public void onDateSet (DatePicker view, int year, int monthOfYear, int dayOfMonth){
//            year_x = year;
//            month_x = monthOfYear;
//            day_x = dayOfMonth;
//            Toast.makeText(transfers.this, year_x + "/" + month_x + "/" + day_x, Toast.LENGTH_SHORT).show();
//        }
//    };
}
