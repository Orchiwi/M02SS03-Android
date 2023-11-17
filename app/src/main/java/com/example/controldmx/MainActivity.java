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
import android.widget.SeekBar.OnSeekBarChangeListener;
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
        SeekBar seekbar=(SeekBar)findViewById(R.id.seekBar);
        SeekBar seekbar2=(SeekBar)findViewById(R.id.seekBar2);
        SeekBar seekbar3=(SeekBar)findViewById(R.id.seekBar3);
        SeekBar seekbar4=(SeekBar)findViewById(R.id.seekBar4);
        SeekBar seekbar5=(SeekBar)findViewById(R.id.seekBar5);
        SeekBar seekbar6=(SeekBar)findViewById(R.id.seekBar6);
        SeekBar seekbar7=(SeekBar)findViewById(R.id.seekBar7);
        SeekBar seekbar8=(SeekBar)findViewById(R.id.seekBar8);
        SeekBar seekbar9=(SeekBar)findViewById(R.id.seekBar9);
        SeekBar seekbar10=(SeekBar)findViewById(R.id.seekBar10);


        int [] trameDMX= {1,2,3,4,5,6,7,8,9,0};
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = binding.sampleText;
                tv.setText(stringFromJNI(text.getText().toString(),trameDMX));
            }
        });
        seekbar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Code à exécuter lorsqu'il y a un changement de progression

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Code à exécuter lorsque l'utilisateur commence à toucher la SeekBar
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Code à exécuter lorsque l'utilisateur arrête de toucher la SeekBar
                trameDMX[0]=seekBar.getProgress();
                binding.sampleText.setText(String.valueOf(trameDMX[0]));
            }
        });
        seekbar2.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Code à exécuter lorsqu'il y a un changement de progression

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Code à exécuter lorsque l'utilisateur commence à toucher la SeekBar
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Code à exécuter lorsque l'utilisateur arrête de toucher la SeekBar
                trameDMX[1]=seekBar.getProgress();
                binding.sampleText.setText(String.valueOf(trameDMX[1]));
            }
        });
        seekbar3.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Code à exécuter lorsqu'il y a un changement de progression

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Code à exécuter lorsque l'utilisateur commence à toucher la SeekBar
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Code à exécuter lorsque l'utilisateur arrête de toucher la SeekBar
                trameDMX[2]=seekBar.getProgress();
                binding.sampleText.setText(String.valueOf(trameDMX[2]));
            }
        });
        seekbar4.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Code à exécuter lorsqu'il y a un changement de progression

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Code à exécuter lorsque l'utilisateur commence à toucher la SeekBar
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Code à exécuter lorsque l'utilisateur arrête de toucher la SeekBar
                trameDMX[3]=seekBar.getProgress();
                binding.sampleText.setText(String.valueOf(trameDMX[3]));
            }
        });
        seekbar5.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Code à exécuter lorsqu'il y a un changement de progression

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Code à exécuter lorsque l'utilisateur commence à toucher la SeekBar
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Code à exécuter lorsque l'utilisateur arrête de toucher la SeekBar
                trameDMX[4]=seekBar.getProgress();
                binding.sampleText.setText(String.valueOf(trameDMX[4]));
            }
        });
        seekbar6.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Code à exécuter lorsqu'il y a un changement de progression

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Code à exécuter lorsque l'utilisateur commence à toucher la SeekBar
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Code à exécuter lorsque l'utilisateur arrête de toucher la SeekBar
                trameDMX[5]=seekBar.getProgress();
                binding.sampleText.setText(String.valueOf(trameDMX[5]));
            }
        });
        seekbar7.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Code à exécuter lorsqu'il y a un changement de progression

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Code à exécuter lorsque l'utilisateur commence à toucher la SeekBar
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Code à exécuter lorsque l'utilisateur arrête de toucher la SeekBar
                trameDMX[6]=seekBar.getProgress();
                binding.sampleText.setText(String.valueOf(trameDMX[6]));
            }
        });
        seekbar8.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Code à exécuter lorsqu'il y a un changement de progression

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Code à exécuter lorsque l'utilisateur commence à toucher la SeekBar
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Code à exécuter lorsque l'utilisateur arrête de toucher la SeekBar
                trameDMX[7]=seekBar.getProgress();
                binding.sampleText.setText(String.valueOf(trameDMX[7]));
            }
        });
        seekbar9.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Code à exécuter lorsqu'il y a un changement de progression

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Code à exécuter lorsque l'utilisateur commence à toucher la SeekBar
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Code à exécuter lorsque l'utilisateur arrête de toucher la SeekBar
                trameDMX[8]=seekBar.getProgress();
                binding.sampleText.setText(String.valueOf(trameDMX[8]));
            }
        });
        seekbar10.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Code à exécuter lorsqu'il y a un changement de progression

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Code à exécuter lorsque l'utilisateur commence à toucher la SeekBar
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Code à exécuter lorsque l'utilisateur arrête de toucher la SeekBar
                trameDMX[9]=seekBar.getProgress();
                binding.sampleText.setText(String.valueOf(trameDMX[9]));
            }
        });
        /*seekbar2.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Code à exécuter lorsqu'il y a un changement de progression

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Code à exécuter lorsque l'utilisateur commence à toucher la SeekBar
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Code à exécuter lorsque l'utilisateur arrête de toucher la SeekBar
                trameDMX[10]=seekBar.getProgress();
                binding.sampleText.setText(String.valueOf(trameDMX[10]));
            }
        });*/

    }       public native String stringFromJNI(String text, int [] trame);
}