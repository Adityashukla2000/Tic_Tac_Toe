package in.adityashukla.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    int flag = 0;
    int count = 0;
    String bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }


    public void restart(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");

        if(flag ==1){
            flag=0;
        }else {
            flag =1;
        }

        count =0;
    }

    public void onCheck(View view) {
        Button btn = (Button) view;
        count++;

        if (flag == 0) {


            btn.setText("X");
            btn.setTextColor(getResources().getColor(R.color.x));
            if(flag ==0){
                flag = 1;
            }

        } else {
            flag = 0;
            btn.setText("O");
            btn.setTextColor(getResources().getColor(R.color.o));
        }

        if (count > 4) {
            bt1 = btn1.getText().toString();
            bt2 = btn2.getText().toString();
            bt3 = btn3.getText().toString();
            bt4 = btn4.getText().toString();
            bt5 = btn5.getText().toString();
            bt6 = btn6.getText().toString();
            bt7 = btn7.getText().toString();
            bt8 = btn8.getText().toString();
            bt9 = btn9.getText().toString();

            // Conditions
            if (bt1.equals(bt2) && bt2.equals(bt3) && !bt1.equals("")) {
                Toast.makeText(this, "Winner is :" + bt1, Toast.LENGTH_SHORT).show();
                restart();


            } else if (bt4.equals(bt5) && bt5.equals(bt6) && !bt4.equals("")) {
                Toast.makeText(this, "Winner is :" + bt4, Toast.LENGTH_SHORT).show();
                restart();

            } else if (bt7.equals(bt8) && bt8.equals(bt9) && !bt7.equals("")) {
                Toast.makeText(this, "Winner is :" + bt7, Toast.LENGTH_SHORT).show();
                restart();

            } else if (bt1.equals(bt4) && bt4.equals(bt7) && !bt1.equals("")) {
                Toast.makeText(this, "Winner is :" + bt1, Toast.LENGTH_SHORT).show();
                restart();

            } else if (bt2.equals(bt5) && bt5.equals(bt8) && !bt2.equals("")) {
                Toast.makeText(this, "Winner is :" + bt2, Toast.LENGTH_SHORT).show();
                restart();

            } else if (bt3.equals(bt6) && bt6.equals(bt9) && !bt3.equals("")) {
                Toast.makeText(this, "Winner is :" + bt3, Toast.LENGTH_SHORT).show();
                restart();

            } else if (bt1.equals(bt5) && bt5.equals(bt9) && !bt1.equals("")) {
                Toast.makeText(this, "Winner is :" + bt1, Toast.LENGTH_SHORT).show();
                restart();

            } else if (bt3.equals(bt5) && bt5.equals(bt7) && !bt3.equals("")) {
                Toast.makeText(this, "Winner is :" + bt3, Toast.LENGTH_SHORT).show();
                restart();

            }else if(count==9){
                Toast.makeText(this,"Game is Over",Toast.LENGTH_SHORT).show();
                restart();
            }
        }


    }


}