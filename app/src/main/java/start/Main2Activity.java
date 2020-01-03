package start;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;

import android.content.Intent;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.clcu.R;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    //시작하기 페이지

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public void onClick(View v){
        if (v.getId()==R.id.startbutton){
            Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
            startActivity(intent);
            finish();
        }
    }

}
