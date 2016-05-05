package com.example.maryjean.wildcatbank;



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
import android.widget.Toast;


public class deposits extends Fragment {


    Button frontBtnTakePhoto;
    ImageView frontImgTakenPhoto;
    Button backBtnTakePhoto;
    ImageView backImgTakenPhoto;
    Button submitBtn;
    boolean WAS_LAST_IMAGE_FRONT = false;
    private static final int CAM_REQUEST = 1313;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.deposits, container, false);
        frontBtnTakePhoto = (Button) v.findViewById(R.id.button1);
        frontImgTakenPhoto = (ImageView) v.findViewById(R.id.imageview1);
        backBtnTakePhoto = (Button) v.findViewById(R.id.button2);
        backImgTakenPhoto = (ImageView) v.findViewById(R.id.imageview2);
        submitBtn = (Button) v.findViewById(R.id.button3);
        frontBtnTakePhoto.setOnClickListener(new frontBtnTakePhotoClicker());
        backBtnTakePhoto.setOnClickListener(new backBtnTakePhotoClicker());
        submitBtn.setOnClickListener(new submitBtn());
        return v;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CAM_REQUEST) {
            Bitmap thumbnail = (Bitmap) data.getExtras().get("data");
            if (WAS_LAST_IMAGE_FRONT) {
                frontImgTakenPhoto.setImageBitmap(thumbnail);
            } else {
                backImgTakenPhoto.setImageBitmap(thumbnail);
            }
        }
    }

    class frontBtnTakePhotoClicker implements Button.OnClickListener {
        @Override
        public void onClick(View v)

        {
            Intent cameraintent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            WAS_LAST_IMAGE_FRONT = true;
            startActivityForResult(cameraintent, CAM_REQUEST);
        }
    }

    class backBtnTakePhotoClicker implements Button.OnClickListener {
        @Override
        public void onClick(View v)

        {
            Intent cameraintent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            WAS_LAST_IMAGE_FRONT = false;
            startActivityForResult(cameraintent, CAM_REQUEST);
        }
    }

    class submitBtn implements Button.OnClickListener {
        @Override
        public void onClick(View v)

        {
            Toast.makeText(getActivity(), "Submitted!", Toast.LENGTH_LONG).show();
            frontImgTakenPhoto.setImageResource(android.R.color.transparent);
            backImgTakenPhoto.setImageResource(android.R.color.transparent);

        }
    }
}
