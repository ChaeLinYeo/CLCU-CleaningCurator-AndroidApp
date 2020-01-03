package start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.clcu.R;

import mainview.MainActivity;
import mainview.MainPage;

public class Main5Activity extends AppCompatActivity implements View.OnClickListener {
    //우리집 구성은 이래요

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    @Override
    public void onClick(View v){
        Intent intent;
        switch(v.getId()){
            //다음 버튼
            case R.id.startbutton2:
                intent = new Intent(Main5Activity.this, Main6Activity.class);
                startActivity(intent);
                finish();
                break;

            //얘는 무시해요 나중에 다른애 쓸까봐 남긴거임
            case R.id.button2:

                break;

            case R.id.skipbutton1:
                intent = new Intent(Main5Activity.this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }

}
