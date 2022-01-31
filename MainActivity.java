package com.mycompany.img;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import android.app.Activity;

import com.mycompany.img.R;

public class MainActivity extends Activity {
    
    ImageButton imgbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                      	imgbtn=(ImageButton)findViewById(R.id.ImageButton);
									imgbtn.setOnClickListener(new View.OnClickListener() {
										@Override
												public void onClick(View view) {
													Toast.makeText(MainActivity.this,"This is a image",Toast.LENGTH_LONG).show();
												}
									});
				}
  }