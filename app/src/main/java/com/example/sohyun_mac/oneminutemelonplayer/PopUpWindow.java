package com.example.sohyun_mac.oneminutemelonplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class PopUpWindow extends AppCompatActivity {

    private final String popUpText = "더들으려면 돈줘~!!!!";
    private TextView textView_popUp;
    private Button btn_popUpClose;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_pop_up_window);
        textView_popUp = (TextView)findViewById(R.id.textview_popUp);
        textView_popUp.setText(popUpText);
        btn_popUpClose = (Button)findViewById(R.id.btn_popUpClose);
        btn_popUpClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
