package br.com.digitalhouse.materialdesignexercicio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ScrollingActivity extends AppCompatActivity {

    private FloatingActionButton buttonFab;
    private TextInputEditText dNome;
    private TextInputEditText dEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        buttonFab = findViewById(R.id.fab);
        dNome = findViewById(R.id.nome);
        dEmail = findViewById(R.id.email);

        buttonFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(dNome.getText().toString().equals("")  )
                {
                    Toast.makeText(ScrollingActivity.this,"Campo deve ser preenchido!",Toast.LENGTH_SHORT).show();
                    dNome.requestFocus();
                    return;
                }
                if(dEmail.getText().toString().equals("") )
                {
                    Toast.makeText(ScrollingActivity.this,"Campo deve ser preenchido!",Toast.LENGTH_SHORT).show();
                    dEmail.requestFocus();
                    return;
                }
                if(!dEmail.getText().toString().contains("@") || !dEmail.getText().toString().contains(".com")   )
                {
                    Toast.makeText(ScrollingActivity.this,"Preencha com e-mail válido!",Toast.LENGTH_SHORT).show();
                    dEmail.requestFocus();
                    return;
                }
                Toast.makeText(ScrollingActivity.this,"Usuário Cadastrado com sucesso!",Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
