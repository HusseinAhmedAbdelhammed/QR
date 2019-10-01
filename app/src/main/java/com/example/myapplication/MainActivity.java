package com.example.myapplication;

import android.graphics.Bitmap;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.journeyapps.barcodescanner.BarcodeEncoder;

public class MainActivity extends AppCompatActivity {

    String cont ="sonic and dlight";

//MultiFormatWriter writer=new MultiFormatWriter();
  QRCodeWriter writer=new QRCodeWriter();
public void gene(View sonic) throws WriterException{
    TextInputLayout in1= (TextInputLayout) findViewById(R.id.in1);
    TextInputLayout in2= (TextInputLayout) findViewById(R.id.in2);
    String con1="Name:"+in1.getEditText().getText().toString();
    String con2="Id:"+in2.getEditText().getText().toString();
    BitMatrix matrix= writer.encode(con1+"\n"+con2, BarcodeFormat.QR_CODE,311,364);
    BarcodeEncoder encoder=new BarcodeEncoder();
    Bitmap ffinal=encoder.createBitmap(matrix);

    ImageView qr= (ImageView) findViewById(R.id.qr);
    qr.setImageBitmap(ffinal);
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }}
