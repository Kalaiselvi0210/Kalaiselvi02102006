package com.kalai;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private EditText editTextUsername, editTextPassword;
    private Button buttonLogin;
    private TextView textViewAttempts;
    private int loginAttempts = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        textViewAttempts = findViewById(R.id.textViewAttempts);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();
                if (username.equals("admin") && password.equals("admin")) {
                    Toast.makeText(MainActivity.this, "Login Successful",
                            Toast.LENGTH_SHORT).show();
                    // You can redirect to another activity here
                } else {
                    loginAttempts--;
                    Toast.makeText(MainActivity.this, "Invalid Credentials",
                            Toast.LENGTH_SHORT).show();
                    textViewAttempts.setVisibility(View.VISIBLE);
                    textViewAttempts.setText("Attempts remaining: " + loginAttempts);
                    if (loginAttempts == 0) {
                        buttonLogin.setEnabled(false);
                        textViewAttempts.setText("No attempts left, login disabled");
                    }
                }
            }
        });
    }
}