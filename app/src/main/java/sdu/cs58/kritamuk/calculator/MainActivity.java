package sdu.cs58.kritamuk.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1EditText, number2EditText;
    Button addButton,minusButton,multiplyButton,divideButton;
    TextView resultTextView;
    int num1,num2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2.Initial View ผูกตัวแปรบน Java กับ element บน xml
        number1EditText = findViewById(R.id.edtNumber1);
        number2EditText = findViewById(R.id.edtNumber2);
        addButton = findViewById(R.id.btnAdd);
        minusButton = findViewById(R.id.btnMinus);
        multiplyButton = findViewById(R.id.btnMultiply);
        divideButton = findViewById(R.id.btnDivide);
        resultTextView = findViewById(R.id.txvResult);


                //3.
                addButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                        num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                        result = num1 + num2;

                        //4.
                        resultTextView.setText(result + "");

                        minusButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                                num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                                result = num1 - num2;

                                resultTextView.setText(result + "");

                                multiplyButton.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {

                                        num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                                        num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                                        result = num1 * num2;

                                        resultTextView.setText(result + "");

                                        divideButton.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {

                                                num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                                                num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                                                result = num1 / num2;

                                                resultTextView.setText(result + "");
                                            }
                                        });
                                    }
                                });
                            }
                        });

                    } //end setOnClickListener
                });
            } //end Method onCreate
        }
