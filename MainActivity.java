package jp.afaik.android.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.*;
import android.widget.*;
import android.text.Editable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickButton(View view) {
        TextView result = (TextView)this.findViewById(R.id.textView2);
        EditText edittext_h = (EditText)this.findViewById(R.id.editText);
        EditText edittext_w = (EditText)this.findViewById(R.id.editText2);

        String s_height, s_weight;
        s_height = edittext_h.getText().toString();
        s_weight = edittext_w.getText().toString();

        double bmi, height, weight;
        height = Double.parseDouble(s_height);
        weight = Double.parseDouble(s_weight);

        height /= 100;
        bmi = weight / (height*height);
        String msg = "BMIÇÃåvéZåãâ ÇÕÅF" + bmi + "Ç≈Ç∑ÅB";
        result.setText(msg);
    }
}
