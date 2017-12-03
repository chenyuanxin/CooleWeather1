package com.example.c00288128.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HelloWorldActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
        //return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
        //return super.onOptionsItemSelected(item);
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case 1:
                if (resultCode == RESULT_OK){
                    String strReturendData = data.getStringExtra("data_return");
                    Toast.makeText(HelloWorldActivity.this, "strReturendData", Toast.LENGTH_SHORT).show();
                }
                default:
        }
       // super.onActivityResult(requestCode, resultCode, data);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        Button button1 = (Button)findViewById(R.id.button_1);
//        button1.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                finish();
//            }
//        });
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Intent intent_second = new Intent(HelloWorldActivity.this, SecondActivity.class);
                String data = "Hello SecondActivity";
               // intent_second.putExtra("extra_data", data);
                Intent intentResult = new Intent(HelloWorldActivity.this, SecondActivity.class);
                startActivityForResult(intentResult, 1);
                //startActivity(intent_second);
                //Intent intent = new Intent(Intent.ACTION_VIEW);
                //intent.setData(Uri.parse("http://www.baidu.com"));
                //startActivity(intent);
                //Toast.makeText(HelloWorldActivity.this, "You clicked Button 1",Toast.LENGTH_SHORT).show();
            }
        });



        Log.d("HelloWorldActivity","OnCreate Excute");
    }

}
