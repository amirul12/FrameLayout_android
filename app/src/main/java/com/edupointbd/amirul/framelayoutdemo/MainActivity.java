package com.edupointbd.amirul.framelayoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = (LinearLayout)findViewById(R.id.linearID);
    }

    public  void seeAction(View view){
        if(linearLayout.getVisibility() == view.GONE){
            linearLayout.setVisibility(view.VISIBLE);
        }else{
            linearLayout.setVisibility(view.GONE);
        }
    }
}
