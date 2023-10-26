package com.example.ocrtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.PackageManagerCompat;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.canhub.cropper.CropImage;
import com.canhub.cropper.CropImageActivity;

public class MainActivity extends AppCompatActivity {
    Button button_capture, button_copy;
    TextView textview_data;
    private static final int REQUEST_CAMERA_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_capture = findViewById(R.id.button_capture);
        button_copy = findViewById(R.id.button_copy);
        textview_data = findViewById(R.id.text_data);

        if(ContextCompat.checkSelfPermission(MainActivity.this, android.Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{
                    android.Manifest.permission.CAMERA
            }, REQUEST_CAMERA_CODE);
        }

        button_capture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                cropImageView.setImageUriAsync(uri)
//                        val cropped: Bitmap = cropImageView.getCroppedImage();
            }
        });
    }
}