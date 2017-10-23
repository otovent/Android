package ws.wolfsoft.creative;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.akaiona.user_timeline.R;

import java.util.HashMap;
import java.util.Map;

import ws.wolfsoft.creative.API.Impl.ServiceImpl;
import ws.wolfsoft.creative.API.Service;

public class signup extends AppCompatActivity {
    TextView signinhere;
    TextView signUp;
    Typeface fonts1;
    EditText email;
    EditText username;
    EditText password;
    Service service;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        signinhere = (TextView) findViewById(R.id.signinhere);
        signUp = (TextView) findViewById(R.id.signup1);
        email = (EditText) findViewById(R.id.email);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        progressDialog = new ProgressDialog(signup.this,R.style.AppTheme);
        service = new ServiceImpl();

        signinhere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent it = new Intent(signup.this, signin.class);
            startActivity(it);
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Map<String,String> postBody = new HashMap<String, String>();
                postBody.put("email",email.getText().toString());
                postBody.put("username",username.getText().toString());
                postBody.put("password",password.getText().toString());
                service.addOrEditUser("users/add",
                        postBody,signup.this,progressDialog);
            }
        });

        fonts1 = Typeface.createFromAsset(signup.this.getAssets(),
                "fonts/Lato-Regular.ttf");
        TextView t1 = (TextView) findViewById(R.id.signinhere);
        t1.setTypeface(fonts1);
    }
}
