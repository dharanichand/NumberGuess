package tt.test.com.numberguess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
int randomNumber;
    public void makeToast(String string)
    {
        Toast.makeText(MainActivity.this,string,Toast.LENGTH_SHORT).show();

    }
     public void guessNumber(View view)
     {
         EditText et1= (EditText) findViewById(R.id.et1);
         int guess = Integer.parseInt(et1.getText().toString());

         if(guess>20 || guess<0)
              {
                  makeToast("Number Between 1 and 20");
             }
        else if(guess>randomNumber)
         {
             makeToast(" Guess Lower Number");
         }
         else if (guess<randomNumber)
         {
             makeToast(" Guess Higher Number");
         }

         else
         {
             makeToast("Yes Right. Try again!");
             Random rand = new Random();
             randomNumber=rand.nextInt(20)+1;
         }
     }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        randomNumber=rand.nextInt(20)+1;
    }
}
