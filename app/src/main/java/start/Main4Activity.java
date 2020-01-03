package start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.clcu.R;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {
    //일정 정하기 페이지

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    @Override
    public void onClick(View v){
        Intent intent;
        switch(v.getId()){
            //내가 정하기
            case R.id.imageButton12:
                intent = new Intent(Main4Activity.this, Main8Activity.class);
                startActivity(intent);
                finish();
                break;

            //자동 정하기
            case R.id.imageButton13:
                intent = new Intent(Main4Activity.this, Main5Activity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}
