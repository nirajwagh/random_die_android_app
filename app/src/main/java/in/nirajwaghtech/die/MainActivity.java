package in.nirajwaghtech.die;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private ImageView myDice;
    private Random random= new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDice=findViewById(R.id.myDice);

        myDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int myRandomNumber=random.nextInt(6)+1;

                switch(myRandomNumber){

                    case 1:
                        myDice.setImageResource(R.drawable.one);
                        toaster("ONE");
                        break;

                    case 2:
                        myDice.setImageResource(R.drawable.two);
                        toaster("TWO");
                        break;
                    case 3:
                        myDice.setImageResource(R.drawable.three);
                        toaster("THREE");
                        break;
                    case 4:
                        myDice.setImageResource(R.drawable.four);
                        toaster("FOUR");
                        break;
                    case 5:
                        myDice.setImageResource(R.drawable.five);
                        toaster("FIVE");
                        break;
                    case 6:
                        myDice.setImageResource(R.drawable.six);
                        toaster("SIX");
                        break;
                }
            }
        });
    }

    public void toaster(String text){

        LayoutInflater inflater= getLayoutInflater();
        View layout= inflater.inflate(R.layout.toast, (ViewGroup) findViewById(R.id.myToast));

        TextView toastText=layout.findViewById(R.id.toastText);
        toastText.setText(text);
        Toast toast= new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM,0,110);

        toast.setDuration(Toast.LENGTH_SHORT);

        toast.setView(layout);
        toast.show();
    }
}
