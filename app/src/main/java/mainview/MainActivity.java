package mainview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.clcu.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity{

    //하단 바 다루는 클래스
    //하단 바 아이콘 누를 때마다 각 프래그먼트로 이동함
    //FragmentManager
    private FragmentManager fragmentManager = getSupportFragmentManager();

    //메뉴 4버튼에 들어갈 fragment
    private MainPage frag_home = new MainPage();
    private CalanderPage frag_calendar = new CalanderPage();
    private TipPage frag_tip = new TipPage();
    private BookmarkPage frag_star = new BookmarkPage();


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frame_layout, frag_home).commitAllowingStateLoss();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener()  {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                switch (menuItem.getItemId()) {
                    case R.id.bottom_homeItem:{
                        transaction.replace(R.id.frame_layout, frag_home).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.bottom_calendarItem:{
                        transaction.replace(R.id.frame_layout, frag_calendar).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.bottom_tipItem:{
                        transaction.replace(R.id.frame_layout, frag_tip).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.bottom_starItem:{
                        transaction.replace(R.id.frame_layout, frag_star).commitAllowingStateLoss();
                        break;
                    }
                }
                return true;
            }

        });
    }
}