package com.keegan.android.todov1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId( );
        switch ( id ) {
            case R.id.action_add:
                Intent insertIntent = new Intent( this, InsertActivity.class );
                this.startActivity( insertIntent );
                return true;
            case R.id.action_delete:
                Intent deleteIntent = new Intent( this, DeleteActivity.class );
                this.startActivity( deleteIntent );
                return true;
            case R.id.action_exit:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected( item );
        }
    }
}