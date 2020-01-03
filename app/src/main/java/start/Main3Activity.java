package start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import com.example.clcu.R;

import org.w3c.dom.Text;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{
    //전화번호 입력 페이지

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    @Override
    public void onClick(View v){
        //엔터 치면 넘어가게 하고 싶었는데 안되길래 버튼 눌러야함 하하
        if (v.getId()==R.id.button15){
            Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
            startActivity(intent);
            finish();
        }
    }
}
