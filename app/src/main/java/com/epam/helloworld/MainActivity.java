package com.epam.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button1:
                        textView.setText(R.string.button1);

                        Toast toast = Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER, 0, 200);
                        LinearLayout toastImage = (LinearLayout) toast.getView();
                        ImageView imageView = new ImageView(MainActivity.this);
                        imageView.setImageResource(R.drawable.epam);
                        toastImage.addView(imageView, 105, 60);
                        toast.show();

                        break;
                    case R.id.button2:
                        textView.setText(R.string.button2);

                        Toast toast1 = Toast.makeText(MainActivity.this, "Hello EPAM!", Toast.LENGTH_SHORT);
                        toast1.setGravity(Gravity.CENTER, 0, 175);
                        toast1.show();

                        break;

                }

            }
        };

        button1.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(R.string.textView);
            }
        }

        );

    }
}
