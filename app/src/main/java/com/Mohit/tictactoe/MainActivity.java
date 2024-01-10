package com.Mohit.tictactoe;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.Mohit.tictactoe.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        EditText Oplayer=findViewById(R.id.firstname);
        EditText Xplayer=findViewById(R.id.Secondname);
        Button Play=findViewById(R.id.play);
        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String firstplayer=Oplayer.getText().toString();
                String Secondplayer=Xplayer.getText().toString();

                if(firstplayer.isEmpty() || Secondplayer.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Please Enter Player Name !! ",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Intent intent = new Intent(MainActivity.this, TicTacToe.class);
                    intent.putExtra("Oplayer",firstplayer);
                    intent.putExtra("Xplayer",Secondplayer);
                    startActivity(intent);

                }
            }
        });



    }
}