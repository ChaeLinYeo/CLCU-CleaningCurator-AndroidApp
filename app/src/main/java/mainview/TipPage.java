package mainview;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.example.clcu.R;
import android.widget.Button;


import content.Main13Activity;

//public class TipPage extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_tip);
//    }
//}

public class TipPage extends Fragment implements View.OnClickListener {
    public TipPage(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tip, container, false);

        ImageButton bedroom01 = (ImageButton) view.findViewById(R.id.bedroom01);
        bedroom01.setOnClickListener(this);


        //키워드 서치가 눌렸을 때 팁-검색 페이지로 넘어감
        //팁-검색 페이지에서 뒤로가기를 위해 스택 만듬
        ImageButton search = view.findViewById(R.id.검색창);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TipPage_TempSearch frag_searchpage = new TipPage_TempSearch();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.frame_layout, frag_searchpage);
                transaction.addToBackStack("tip_page");
                transaction.commit();
            }
        });
        //카테고리 별 팁 페이지가 넘어가도록 구현 -> 밑에 onClick이 그 기능! 맞게 한 것 같은데 안됨..!ㅠ
        //당신만을 위한 추천 뭐지 이거 어떻게 해야 함 -> 이거 뒤로 가기 하면 팁 메인 페이지가 나오는게 아니라 카테고리 별 페이지가 나옴. 스택 쓰면 안 될 듯. 걍 바로 전환 하면 되려나
        return view;
    }


    //https://stackoverflow.com/questions/32700818/how-to-open-a-fragment-on-button-click-from-a-fragment-in-android 여기 참고함.
    @Override
    public void onClick(View view) {
        Fragment fragment = null;
        switch (view.getId()) {
            case R.id.bedroom01:
                fragment = new TipPageB();      //TipPageB == AboutFragment
                replaceFragment(fragment);
                break;
        }
    }
    public void replaceFragment(Fragment somefragment){
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, somefragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

//    @Override
//    public void onClick(View v){
//        Intent intent;
//        switch(v.getId()){
//            //캘린더 클릭 버튼
//            case R.id.bedroom01:
//                intent = new Intent(getActivity(), TipPageB.class);
//                startActivity(intent);
//                getActivity().finish();
//                break;
//            case R.id.washing01:
//                intent = new Intent(getActivity(), TipPageB.class);
//                startActivity(intent);
//                getActivity().finish();
//                break;
//
//        }
//    }
}