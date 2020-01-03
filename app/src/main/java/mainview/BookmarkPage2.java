package mainview;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnTouchListener;
import android.view.MotionEvent;

import com.example.clcu.R;

public class BookmarkPage2 extends Fragment {

    //일단은 BookmarkPage에서 조금만 바꿈
    //마찬가지로 터치만 가능함.
    // 이전 북마크 페이지를 스택에서 빼옴.
    //일단은 임시로 이미지. 나중에 바꿔야함.

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_bookmark2, container, false);
        view.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                    case MotionEvent.ACTION_MOVE :
                    case MotionEvent.ACTION_UP   :
                        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                        FragmentTransaction transaction = getFragmentManager().beginTransaction();
                        fragmentManager.popBackStack("bookmark_page", FragmentManager.POP_BACK_STACK_INCLUSIVE);
                }
                return true;
            }
        });

        return view;
    }
}
