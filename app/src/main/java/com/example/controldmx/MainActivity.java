/*package com.example.controldmx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.controldmx.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'controldmx' library on application startup.
    static {
        System.loadLibrary("controldmx");
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method
        TextView tv = binding.sampleText;
        tv.setText(stringFromJNI());
    }


        // A native method that is implemented by the 'controldmx' native library,
        // which is packaged with this application.

    public native String stringFromJNI();
}*/

package com.example.controldmx;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.controldmx.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity {
    static {
        System.loadLibrary("controldmx");
    }
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        TextView text=findViewById(R.id.sample_text);
        text.setText("clicker");
        Button button1=(Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText("bravo");
                text.setText(stringFromJNI()); //appel de la méthode C++
            }
        });
    }
    public native String stringFromJNI();
}