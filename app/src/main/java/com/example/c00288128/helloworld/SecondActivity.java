package com.example.c00288128.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        Intent intentResult = new Intent();
        intentResult.putExtra("data_return", "Hello First Activity");
        setResult(RESULT_OK, intentResult);
        finish();
        //super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        //Intent intentShowText = getIntent();
        //String strData = intentShowText.getStringExtra("extra_data");
        //Toast.makeText(SecondActivity.this, strData, Toast.LENGTH_SHORT).show();
        //Log.d("In to SecondActivity", strData);

        Button button2 = (Button)findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//                Intent intent_second = new Intent(Intent.ACTION_DIAL);
//                intent_second.setData(Uri.parse("tel:10086"));
//                startActivity(intent_second);

                //返回值
                Intent intentResult = new Intent();
                intentResult.putExtra("data_return", "Hello First Activity");
                setResult(RESULT_OK, intentResult);
                finish();
                }
        });

    }


}
