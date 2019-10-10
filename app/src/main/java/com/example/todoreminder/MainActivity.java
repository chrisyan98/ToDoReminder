package com.example.todoreminder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button add_button;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add_button=(Button)findViewById(R.id.add_button);
        editText2=(EditText)findViewById(R.id.editText2);
        add_button.setOnClickListener(new D1());
    }

    class D1 implements View.OnClickListener{
        @Override
        public void onClick (View v){
            add_button.setText("add");
        }
    }
}
