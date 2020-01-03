package mainview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.clcu.R;

import content.Main13Activity;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;

import android.app.FragmentManager;


public class TipPageB extends Fragment implements View.OnClickListener{

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_tip2);
//    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onClick(View v){
        Intent intent;
        switch(v.getId()){
            //캘린더 클릭 버튼
            case R.id.imageButton:
                intent = new Intent(getActivity(), Main13Activity.class);
                startActivity(intent);
                getActivity().finish();
                break;
        }
    }
}
