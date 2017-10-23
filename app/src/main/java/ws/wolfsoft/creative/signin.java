package ws.wolfsoft.creative;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.akaiona.user_timeline.R;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import ws.wolfsoft.creative.API.Impl.ServiceImpl;
import ws.wolfsoft.creative.API.Service;

public class signin extends AppCompatActivity {
    private ProgressDialog progressDialog = null;
    TextView create;
    TextView login;
    Typeface fonts1;
    Service service;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
        progressDialog = new ProgressDialog(signin.this,R.style.AppTheme);
        service = new ServiceImpl();
        create = (TextView) findViewById(R.id.create);
        login = (TextView) findViewById(R.id.signin1);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(signin.this, signup.class);
                startActivity(it);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                service.authToBackend("users/login","aldi","wkadokaw",signin.this,progressDialog);
            }
        });
        fonts1 = Typeface.createFromAsset(signin.this.getAssets(),
                "fonts/Lato-Regular.ttf");
        TextView t4 = (TextView) findViewById(R.id.create);
        t4.setTypeface(fonts1);
    }

}
