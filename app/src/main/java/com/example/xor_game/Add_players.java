package com.example.xor_game;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class Add_players extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_players);
        final EditText playerOne = findViewById(R.id.playerOneNameInt);
        final EditText playerTwo = findViewById(R.id.playerTwoNameInt);
        final Button start_game_btn = findViewById(R.id.start_game_btn);
        start_game_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String getPlayerOneName = playerOne.getText().toString();
                final String getPlayerTwoName = playerTwo.getText().toString();

                if (getPlayerOneName.isEmpty() || getPlayerTwoName.isEmpty()){
                    Toast.makeText(Add_players.this,"Please Enter Player Names",Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(Add_players.this,MainActivity.class);
                    intent.putExtra("playerOne ",getPlayerOneName);
                    intent.putExtra("playerTwo ",getPlayerTwoName);
                    startActivity(intent);
                }
            }
        });
    }
}