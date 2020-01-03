package mainview;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.clcu.R;

public class MyPage extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_mypage, container, false);

        Button back = view.findViewById(R.id.backspace);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.popBackStack("main_page", FragmentManager.POP_BACK_STACK_INCLUSIVE);
                //뒤로가기 눌렀을 시 스택에 쌓아둔 "main page"가 pop됨.
                //생각해보니 마이페이지 메인페이지에서 불러오는 것뿐만 아니라 todolist 페이지에서도 써서 이 방법으로는 안 될 것 같음.. 그냥 전체 스택을 쌓을까
            }
        });

        //프로필 수정, 주소 편집, 관심구역 편집, 알람 설정 구현해야 함

        return view;
    }

}
