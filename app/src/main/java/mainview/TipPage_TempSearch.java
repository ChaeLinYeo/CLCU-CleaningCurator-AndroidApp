package mainview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.clcu.R;

//public class TipPage extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_tip);
//    }
//}

public class TipPage_TempSearch extends Fragment {

    //temp인 이유는 혹시 구현 방법이 바뀔까봐...

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_tip_temp, container, false);

        //뒤로가기 -> 팁 페이지
        ImageButton backspace = view.findViewById(R.id.backspace);
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.popBackStack("tip_page", FragmentManager.POP_BACK_STACK_INCLUSIVE);
                //뒤로가기 눌렀을 시 스택에 쌓아둔 "tip page"가 pop됨.

            }
        });

        //키워드 서치는 나중에 구현... 뭐야 이건 또 어떻게 구현함... 진심 9월 안에 우리가 이걸 구현할 수 있을거라 생각하나... 몰라... 어떻게든 되겠지...
        //정 안되면 서치 빼거나 하자.. 실제 청소 안내만 해주는 어플같은거 보면 서치 없이 목록만 띄워주는것들 있도라..
        return view;
    }

}