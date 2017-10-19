package ws.wolfsoft.creative;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import nrew.Otovent.R;

public class MainActivity extends AppCompatActivity {
    TextView signin;
    TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        signin = (TextView) findViewById(R.id.signin);
        signup = (TextView) findViewById(R.id.Signup);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(MainActivity.this, signup.class);
                startActivity(it);

            }
        });


        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(MainActivity.this, signin.class);
                startActivity(it);


            }
        });

    }
}
