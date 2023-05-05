package com.example.muara_mbaduk.view.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.muara_mbaduk.R;
import com.example.muara_mbaduk.utils.UtilMethod;

public class LoginActivity extends AppCompatActivity {
    private TextView kebijakanTextView;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        kebijakanTextView = findViewById(R.id.kebijakanTextView);

        String text = "Dengan melanjutkan tahap ini, Anda setuju dengan Syarat Penggunaan dan Kebijakan Privasi kami.";
        int lastIndexSyarat = UtilMethod.getLastIndex(text, "Syarat");
        int startIndexSyarat = UtilMethod.getStartIndex(text, "Syarat");
        int lastIndexKebijakan = UtilMethod.getLastIndex(text, "Kebijakan");
        int startIndexKebijakan = UtilMethod.getStartIndex(text, "Kebijakan");
        SpannableString spannableString = new SpannableString(text);
        ForegroundColorSpan colorSpan = new ForegroundColorSpan(R.color.splash_background);
        spannableString.setSpan(colorSpan, startIndexSyarat, lastIndexSyarat, Spanned.SPAN_PRIORITY_SHIFT);
        kebijakanTextView.setText(spannableString);
    }
}