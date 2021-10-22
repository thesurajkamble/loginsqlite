package com.example.Blockchain_App.Core;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import com.example.Blockchain_App.Blockchain_reg_verify.Blockchain_user_registration;
import com.example.Blockchain_App.Blockchain_reg_verify.Blockchain_user_verification;
import com.example.Blockchain_App.Network.NetworkClient;
import com.example.Blockchain_App.Network.UploadApis;
import com.example.Blockchain_App.R;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import static android.os.Environment.getExternalStoragePublicDirectory;

public class HomeActivity extends AppCompatActivity
{

    private Button btn_reg, btn_verify;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();

        btn_reg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent blockchain_reg_intent = new Intent(getApplicationContext(), Blockchain_user_registration.class);
                startActivity(blockchain_reg_intent);

            }
        });


        btn_verify.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent blockchain_verify_intent = new Intent(getApplicationContext(), Blockchain_user_verification.class);
                startActivity(blockchain_verify_intent);
            }
        });

    }

    private void init()
  {
       btn_reg = findViewById(R.id.btn_blockchain_reg);
       btn_verify = findViewById(R.id.btn_blockchain_verify);

   }
}
















