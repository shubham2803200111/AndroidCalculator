package com.example.firstcal;

import static android.widget.Toast.makeText;

import androidx.appcompat.app.AppCompatActivity;
import com.udojava.evalex.Expression;

import android.content.Context;
import android.os.Bundle;

import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private String input = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);



        // Initialize digit and operator buttons
        Button button7 = findViewById(R.id.button_7);
        // Initialize other buttons
        Button button8 = findViewById(R.id.button_8);
        Button button9 = findViewById(R.id.button_9);
        Button buttonPlus = findViewById(R.id.button_plus);
        Button button4 = findViewById(R.id.button_4);
        Button button5 = findViewById(R.id.button_5);
        Button button6 = findViewById(R.id.button_6);
        Button buttonMinus = findViewById(R.id.button_minus);
        Button button1 = findViewById(R.id.button_1);
        Button button2 = findViewById(R.id.button_2);
        Button button3 = findViewById(R.id.button_3);
        Button buttonMultiply = findViewById(R.id.button_multiply);
        Button button0 = findViewById(R.id.button_0);

        Button buttonEquals = findViewById(R.id.button_equals);
        Button buttonDivide = findViewById(R.id.button_divide);
        Button buttonClear = findViewById(R.id.button_clear);

        // Set click listeners for digit buttons (0-9)
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "1";
                updateDisplay();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "2";
                updateDisplay();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "3";
                updateDisplay();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "4";
                updateDisplay();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "5";
                updateDisplay();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "6";
                updateDisplay();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "7";
                updateDisplay();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "8";
                updateDisplay();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "9";
                updateDisplay();
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "0";
                updateDisplay();
            }
        });
        // Implement click listeners for other digit buttons (0-9) similarly

        // Set click listeners for operator buttons
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "/";
                updateDisplay();
            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "*";
                updateDisplay();
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "+";
                updateDisplay();
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "-";
                updateDisplay();
            }
        });

        // Implement click listeners for other operator buttons (+, -, *, /) similarly

        // Set click listener for the equals button
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    // Calculate the result
                    Expression expression=new Expression(input);

                    long result = expression.eval().longValue();

                    input = String.valueOf(result);
                    updateDisplay();
                } catch (Exception e) {
                    // Handle errors or invalid input
                    input = "Error";
                    updateDisplay();
                }
            }
        });

        // Set click listener for the clear button
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = "";
                updateDisplay();
            }
        });
    }

    private void updateDisplay() {
        display.setText(input);
    }

    private double evaluateExpression(String expression) {
        // Implement a method to evaluate the mathematical expression
        // You can use a library or write your own expression parser
        // For simplicity, you can use JavaScript's eval() function with a WebView

        return 0.0; // Placeholder, replace with actual logic
    }
}