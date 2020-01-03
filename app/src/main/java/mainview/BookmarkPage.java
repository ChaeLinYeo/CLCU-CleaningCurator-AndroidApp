package mainview;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnTouchListener;
import android.view.MotionEvent;

import com.example.clcu.R;


public class BookmarkPage extends Fragment {

    //뭐지 이거 대체 어떻게 구현해야하는거지
    //일단은 터치 이벤트로 프래그먼트 전환만 전환함

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_bookmark, container, false);
        view.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                    case MotionEvent.ACTION_MOVE :
                    case MotionEvent.ACTION_UP   :
                        BookmarkPage2 frag_book2 = new BookmarkPage2();
                        FragmentTransaction transaction = getFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_layout, frag_book2);
                        transaction.addToBackStack("bookmark_page");
                        transaction.commit();
                }
                return true;
            }
        });

        return view;
    }



}