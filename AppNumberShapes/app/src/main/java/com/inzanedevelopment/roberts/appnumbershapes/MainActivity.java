package com.inzanedevelopment.roberts.appnumbershapes;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int inputNumber;

    public void AppNumberShapes(View view) {
        EditText convertNumber = (EditText) findViewById(R.id.inputField);
        inputNumber = Integer.parseInt(convertNumber.getText().toString());

        if (isItSquare() && isItTriangular()) {
            Toast.makeText(getApplicationContext(),"This number is square and triangular!",Toast.LENGTH_LONG).show();
        } else if (isItSquare()) {
            Toast.makeText(getApplicationContext(),"This number is square",Toast.LENGTH_LONG).show();
        } else if (isItTriangular()) {
            Toast.makeText(getApplicationContext(),"This number is triangular",Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(),"This number is neither square or triangular",Toast.LENGTH_LONG).show();
        }
    }

    public boolean isItSquare() {
        double squareRoot = Math.sqrt(inputNumber);
        if (squareRoot == Math.floor(squareRoot)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isItTriangular() {
        int x = 1;
        int triangularNumber = 1;
        while (triangularNumber < inputNumber) {
            x++;
            triangularNumber = triangularNumber + x;
        }
        if (triangularNumber == inputNumber) {
            return true;
        } else {
            return false;

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}