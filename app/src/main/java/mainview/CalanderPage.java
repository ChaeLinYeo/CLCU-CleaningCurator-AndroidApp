package mainview;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import android.widget.Button;
import android.widget.TextView;

import com.example.clcu.R;



import start.Main7Activity;

//public class CalanderPage extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_calendar);
//    }
//}

public class CalanderPage extends Fragment{
    Fragment frag; //TestFragment 참조변수
    FragmentManager manager; //FragmentManager 참조변수
    TextView text;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        if(getArguments() != null){
            String param1 = getArguments().getString("월요일"); // 전달받은 key 값
            text.setText(param1);
        }
        return inflater.inflate(R.layout.fragment_calendar, container, false);
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_rssitem_detail, container, false);
//        Button button = (Button) view.findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//
//            }
//        });
//
//        return view;
//    }
//    @Override
//    public void onClick(View v){
//        Intent intent;
//        switch(v.getId()){
//            //캘린더 클릭 버튼
//            case R.id.fakebutton:
//                intent = new Intent(getActivity(), activity_todolist.class);
//                startActivity(intent);
//                getActivity().finish();
//                break;
//        }
//    }

}
