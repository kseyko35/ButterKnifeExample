package com.example.butterknifeexample;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.editText)
    EditText sayi1;
    @BindView(R.id.editText2)
    EditText sayi2;
    @BindView(R.id.sonuc)
    TextView sonuc;
    String a,b;




    @OnClick(R.id.topla)
    void methodTopla() {
        sonuc.setText("");
         a = sayi1.getText().toString();
         b = sayi2.getText().toString();
         int topSayi1 = Integer.parseInt(a);
         int topSayi2 = Integer.parseInt(b);
        sonuc.setText("Sonuc = " + (topSayi1 + topSayi2));
    }

    @OnClick(R.id.cikar)
    public void methodCikar() {
        sonuc.setText("");
         a = sayi1.getText().toString();
         b = sayi2.getText().toString();
        int cikSayi1 = Integer.parseInt(a);
        int cikSayi2 = Integer.parseInt(b);

        sonuc.setText("Sonuc = " +(cikSayi1 - cikSayi2));
    }

    @OnClick(R.id.carp)
    public void methodCarp( ) {
        sonuc.setText("");
         a = sayi1.getText().toString();
         b = sayi2.getText().toString();
        int carpSayi1 = Integer.parseInt(a);
        int carpSayi2 = Integer.parseInt(b);
        sonuc.setText("Sonuc = " + (carpSayi1 * carpSayi2));
    }

    @OnClick(R.id.bol)
    public void methodBol() {
        sonuc.setText("");
         a = sayi1.getText().toString();
         b = sayi2.getText().toString();
        int bolSayi1 = Integer.parseInt(a);
        int bolSayi2 = Integer.parseInt(b);
        sonuc.setText("Sonuc = " + (bolSayi1 / bolSayi2));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }


}
