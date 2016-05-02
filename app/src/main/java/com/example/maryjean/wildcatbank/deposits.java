package com.example.maryjean.wildcatbank;

/**
 * Created by Maryjean on 4/13/2016.
 */

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by hp1 on 21-01-2015.
 */

public class deposits extends Fragment {


    Button btnTakePhoto;
    ImageView imgTakenPhoto;
    private static final int CAM_REQUEST = 1313;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.deposits, container, false);
        btnTakePhoto = (Button) v.findViewById(R.id.button1);
        imgTakenPhoto = (ImageView) v.findViewById(R.id.imageview1);
        btnTakePhoto.setOnClickListener(new btnTakePhotoClicker());
        return v;
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == CAM_REQUEST) {
            Bitmap thumbnail = (Bitmap) data.getExtras().get("data");
            imgTakenPhoto.setImageBitmap(thumbnail);
        }
    }

    class btnTakePhotoClicker implements Button.OnClickListener {
        @Override
        public void onClick(View v)

        {
            Intent cameraintent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(cameraintent, CAM_REQUEST);
        }
    }
}
