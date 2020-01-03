package mainview;

import android.os.Bundle;
import android.view.*;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import androidx.annotation.Nullable;

import com.example.clcu.R;

import java.util.Calendar;

import devs.mulham.horizontalcalendar.HorizontalCalendar;
import devs.mulham.horizontalcalendar.HorizontalCalendar.Builder;
import devs.mulham.horizontalcalendar.utils.HorizontalCalendarListener;


public class MainPage extends Fragment{

    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        Button mypage = view.findViewById(R.id.button_mypage);

        mypage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //마이페이지 버튼 클릭시 마이 페이지로 이동하는 이벤트
                //마이페이지 버튼은 임시로 마이페이지 버튼 자리에 투명으로 만들었음. 추후 이미지버튼으로 수정 요망.
                //마이 페이지 뒤로 가기 버튼을 염두해서 스택으로 만들어둠.
                MyPage frag_mypage = new MyPage();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.frame_layout, frag_mypage);
                transaction.addToBackStack("main_page");
                transaction.commit();
            }
        });
        /* starts before 1 month from now */
        Calendar startDate = Calendar.getInstance();
        startDate.add(Calendar.MONTH, -1);

        /* ends after 1 month from now */
        Calendar endDate = Calendar.getInstance();
        endDate.add(Calendar.MONTH, 1);
        HorizontalCalendar horizontalCalendar = new HorizontalCalendar.Builder(view, R.id.calendarView)
                .range(startDate, endDate)
                .datesNumberOnScreen(5)
                .build();

        horizontalCalendar.setCalendarListener(new HorizontalCalendarListener() {
            @Override
            public void onDateSelected(Calendar date, int position) {
                //do something
            }
        });

        return view;
    }

    //할일 리스트 카드 구현해야함. 아무래도 프래그먼트 따로 구현해야 할 것 같음. 이거 일 벌인 것 같아서 큰 일인데.

    //날짜랑 이름 바뀔 때 상단 바 텍스트가 바뀌는 것도 구현해야 함

//        밑 주석 처리는 스택 안 쌓고 단순히 프래그먼트만 전환하는 경우.
//        무시해도 됨. 혹시 몰라서 남겨둔거임.
//
//        FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//        MyPage mypage = new MyPage();
//        fragmentTransaction.replace(R.id.frame_layout, mypage).commit();



}