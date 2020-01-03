package start;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;

import static android.os.SystemClock.sleep;

import mainview.MainActivity;


public class SplashScreen extends Activity {
    //스플래시 스크린! 일단
    @Override protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        //setContentContentView는 하지 않습니다.
        if (login_check())  //login check가 true이면 바로 메인 페이지로, 아니면 설문조사 페이지로
            startActivity(new Intent(this, MainActivity.class));
        else
            startActivity(new Intent(this, Main2Activity.class));

        sleep(2000);

        finish();


    }

    private boolean login_check(){
        return false;
    }
}

//public class SplashScreen extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_screen);
//
//        //wait for something
//        try{
//            Thread.sleep(2000);
//            Intent intent = new Intent(this, mainview.MainActivity.class);
//            startActivity(intent);
//        }catch(Exception e){};
//
//
//        finish();
//    }
//}
