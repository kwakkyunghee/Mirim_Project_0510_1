package kr.hs.emirims2117.mirim_project_0510_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout baseLayout=new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                                                                        ViewGroup.LayoutParams.MATCH_PARENT);
        setContentView(baseLayout, params);
        EditText edit=new EditText(this);
        Button btn=new Button(this);
        TextView text=new TextView(this);
        edit.setTextSize(20);
        edit.setTextColor(Color.BLACK);
        btn.setBackgroundColor(Color.YELLOW);
        btn.setText("버튼입니다");
        text.setTextSize(25);
        text.setTextColor(Color.MAGENTA);
        text.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);

        baseLayout.addView(edit);
        baseLayout.addView(btn);
        baseLayout.addView(text);

    }
}