package start;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.clcu.R;

import mainview.MainActivity;
import mainview.MainPage;
import mainview.MyPage;

public class Main8Activity extends AppCompatActivity implements View.OnClickListener {
    //직접 정하기

//    public void setShownWeekCount(int count) {
//
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
//        setShownWeekCount(1);
    }

    @Override
    public void onClick(View v){
        Intent intent;
        switch(v.getId()){
            //다음 버튼
            case R.id.startbutton4:
                intent = new Intent(Main8Activity.this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }


}
