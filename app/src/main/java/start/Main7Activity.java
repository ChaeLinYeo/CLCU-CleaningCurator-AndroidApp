package start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.clcu.R;

import mainview.MainActivity;
import mainview.MainPage;

public class Main7Activity extends AppCompatActivity implements View.OnClickListener{
    //우리집엔 이런게 있어요

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }

    @Override
    public void onClick(View v){
        Intent intent;
        switch(v.getId()){
            //다음 버튼
            case R.id.startbutton4:
                intent = new Intent(Main7Activity.this, MainActivity.class);
                startActivity(intent);
                finish();
                break;

        }
    }
}
