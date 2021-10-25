package cmsc.com.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void currencyConvert(View view){

        EditText amountBox = (EditText) findViewById(R.id.amountBox);

        String result = amountBox.getText().toString();

        Log.i("info","you Entered  "+result);

        Toast.makeText(this, "The value of the US $"+result+" Dollars,"+" In Nepalese Rupee is Rs."+currNepal(result), Toast.LENGTH_LONG).show();
        }

        public static String currNepal(String num){
        double value = Double.parseDouble(num) * 120.63;
         String finalRet = String.format("%.2f",value);
        return finalRet ;
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}