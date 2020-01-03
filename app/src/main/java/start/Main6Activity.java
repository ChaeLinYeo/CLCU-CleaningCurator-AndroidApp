package start;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.clcu.R;

import mainview.CalanderPage;
import mainview.MainActivity;
//import mainview.OneFragment;
import android.app.Activity;
import android.app.FragmentManager;
import android.widget.TextView;

import android.app.FragmentTransaction;
import android.widget.Button;
import android.widget.LinearLayout;


public class Main6Activity extends AppCompatActivity implements View.OnClickListener{
    //매주 몇요일마다 청소할거에요

    Fragment frag; //TestFragment 참조변수
    FragmentManager manager; //FragmentManager 참조변수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }
    @Override
    public void onClick(View v){
        Intent intent;
        switch(v.getId()){
            //다음 버튼
            case R.id.startbutton3:
                intent = new Intent(Main6Activity.this, Main7Activity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.skipbutton2:
                intent = new Intent(Main6Activity.this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
            //버튼을 클릭하면 Fragment 의 Text 를 변경한다. (액티비티에서 프래그먼트로 데이터 전달하려고 하는데..프래그먼트쪽으로 간 걸 텍스트로 바꿔주는걸 못하겠음ㅠ0ㅠ
            case R.id.button:
                Fragment fragment = new Fragment(); //fragment생성
                Bundle bundle = new Bundle(1);//파라미터의 숫자는 전달하려는 값의 갯수
                bundle.putString("월요일", "월요일");//첫번째 인자는 나중에 데이터를 꺼내기 위한 키, 두번째 인자는 전달할 데이터
                fragment.setArguments(bundle);
        }
    }

//    // 버튼을 클릭하면 Fragment 의 Text 를 변경한다.
//    public void onFragmentChange(View v){
//        OneFragment oneFragment = (OneFragment) getSupportFragmentManager().findFragmentById(R.id.frag);
//        oneFragment.setTextChange("change text");
//    }
}
