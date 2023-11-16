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

/*package com.example.controldmx;
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
}*/

package com.example.controldmx;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import com.example.controldmx.databinding.ActivityMainBinding;
import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    static {System.loadLibrary("controldmx");}
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Button button1=(Button) findViewById(R.id.button);
        TextInputEditText text=(TextInputEditText)findViewById(R.id.textInputEditText);
        SeekBar seekBar=(SeekBar)findViewById(R.id.seekBar);
        SeekBar seekbar2=(SeekBar)findViewById(R.id.seekBar2);
        int [] trameDMX= {1,2,0,0,0,0,0,0,0,0};
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = binding.sampleText;
                tv.setText(stringFromJNI(text.getText().toString(),trameDMX));
            }
        });
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onstopTrackingTouch(SeekBar seekBar) {
                trameDMX[0]=seekBar.getProgress();
                binding.sampleText.setText(String.valueOf(trameDMX[0]));
            }
        });
        seekbar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                trameDMX[1]=seekBar.getProgress();
                binding.sampleText.setText(String.valueOf(trameDMX[1]));
            }
        });
    }       public native String stringFromJNI(String text, int [] trame);
}