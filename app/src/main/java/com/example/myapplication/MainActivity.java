package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    String b1 = "";
    String b2 = "";
    String b3 = "";
    String b4 = "";
    String b5 = "";
    String b6 = "";
    String b7 = "";
    String b8 = "";
    String b9 = "";
    int i = 1;
    int k1 = 1;
    int k2 = 1;
    int k3 = 1;
    int k4 = 1;
    int k5 = 1;
    int k6 = 1;
    int k7 = 1;
    int k8 = 1;
    int k9 = 1;

    public void start(View view) {
        displayMessage("");
        displayMessage2("");
        displayMessage3("");
        displayMessage4("");
        displayMessage5("");
        displayMessage6("");
        displayMessage7("");
        displayMessage8("");
        displayMessage9("");
        i = 1;
        k1 = 1;
        k2 = 1;
        k3 = 1;
        k4 = 1;
        k5 = 1;
        k6 = 1;
        k7 = 1;
        k8 = 1;
        k9 = 1;
        b1 = "";
        b2 = "";
        b3 = "";
        b4 = "";
        b5 = "";
        b6 = "";
        b7 = "";
        b8 = "";
        b9 = "";
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    private void displayver(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.verdict);
        priceTextView.setText(message);
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.Button1);
        priceTextView.setText(message);
    }

    private void displayMessage2(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.button2);
        priceTextView.setText(message);
    }

    private void displayMessage3(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.button3);
        priceTextView.setText(message);
    }

    private void displayMessage4(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.button4);
        priceTextView.setText(message);
    }

    private void displayMessage5(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.button5);
        priceTextView.setText(message);
    }

    private void displayMessage6(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.button6);
        priceTextView.setText(message);
    }

    private void displayMessage7(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.button7);
        priceTextView.setText(message);
    }

    private void displayMessage8(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.button8);
        priceTextView.setText(message);
    }

    private void displayMessage9(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.button9);
        priceTextView.setText(message);
    }

    public void click1(View view) {
        if (k1 == 1) {
            displayver("");
            if (i % 2 != 0) {
                b1 = "0";
                displayMessage("0");

            }
            if (i % 2 == 0) {
                b1 = "X";
                displayMessage("X");
            }
            i++;
            k1++;
            if ((b1.equals("0") && b2.equals("0") && b3.equals("0")) || (b1.equals("0") && b4.equals("0") && b7.equals("0")) || (b1.equals("0") && b5.equals("0") && b9.equals("0")) || (b2.equals("0")
                    && b5.equals("0") && b8.equals("0")) || (b3.equals("0") && b5.equals("0") && b7.equals("0")) || (b3.equals("0") && b6.equals("0") && b9.equals("0")) || (b4.equals("0") && b5.equals("0")
                    && b6.equals("0")) || (b7.equals("0") && b8.equals("0") && b9.equals("0"))) {
                display1();
            }
            if ((b1.equals("X") && b2.equals("X") && b3.equals("X")) || (b1.equals("X") && b4.equals("X") && b7.equals("X")) || (b1.equals("X") && b5.equals("X") && b9.equals("X")) || (b2.equals("X")
                    && b5.equals("X") && b8.equals("X")) || (b3.equals("X") && b5.equals("X") && b7.equals("X")) || (b3.equals("X") && b6.equals("X") && b9.equals("X")) || (b4.equals("X") && b5.equals("X")
                    && b6.equals("X")) || (b7.equals("X") && b8.equals("X") && b9.equals("X"))) {
                display2();
            }


        }
    }

    public void click2(View view) {
        if (k2 == 1) {
            displayver("");
            if (i % 2 != 0)
            {
                b2 = "0";
                displayMessage2("0");
            }
            if (i % 2 == 0)
            {
                b2 = "X";
                displayMessage2("X");
            }
            i++;
            k2++;
            if ((b1.equals("0") && b2.equals("0") && b3.equals("0")) || (b1.equals("0") && b4.equals("0") && b7.equals("0")) || (b1.equals("0") && b5.equals("0") && b9.equals("0")) || (b2.equals("0")
                    && b5.equals("0") && b8.equals("0")) || (b3.equals("0") && b5.equals("0") && b7.equals("0")) || (b3.equals("0") && b6.equals("0") && b9.equals("0")) || (b4.equals("0") && b5.equals("0")
                    && b6.equals("0")) || (b7.equals("0") && b8.equals("0") && b9.equals("0"))) {
                display1();
            }
            if ((b1.equals("X") && b2.equals("X") && b3.equals("X")) || (b1.equals("X") && b4.equals("X") && b7.equals("X")) || (b1.equals("X") && b5.equals("X") && b9.equals("X")) || (b2.equals("X")
                    && b5.equals("X") && b8.equals("X")) || (b3.equals("X") && b5.equals("X") && b7.equals("X")) || (b3.equals("X") && b6.equals("X") && b9.equals("X")) || (b4.equals("X") && b5.equals("X")
                    && b6.equals("X")) || (b7.equals("X") && b8.equals("X") && b9.equals("X")))
            {
                display2();
            }


        }
    }

    public void click3(View view) {
        if (k3 == 1) {
            displayver("");
            if (i % 2 != 0) {

                b3 = "0";
                displayMessage3("0");
            }
            if (i % 2 == 0) {
                b3 = "X";
                displayMessage3("X");
            }
            i++;
            k3++;
            if ((b1.equals("0") && b2.equals("0") && b3.equals("0")) || (b1.equals("0") && b4.equals("0") && b7.equals("0")) || (b1.equals("0") && b5.equals("0") && b9.equals("0")) || (b2.equals("0")
                    && b5.equals("0") && b8.equals("0")) || (b3.equals("0") && b5.equals("0") && b7.equals("0")) || (b3.equals("0") && b6.equals("0") && b9.equals("0")) || (b4.equals("0") && b5.equals("0")
                    && b6.equals("0")) || (b7.equals("0") && b8.equals("0") && b9.equals("0"))) {
                display1();
            }
            if ((b1.equals("X") && b2.equals("X") && b3.equals("X")) || (b1.equals("X") && b4.equals("X") && b7.equals("X")) || (b1.equals("X") && b5.equals("X") && b9.equals("X")) || (b2.equals("X")
                    && b5.equals("X") && b8.equals("X")) || (b3.equals("X") && b5.equals("X") && b7.equals("X")) || (b3.equals("X") && b6.equals("X") && b9.equals("X")) || (b4.equals("X") && b5.equals("X")
                    && b6.equals("X")) || (b7.equals("X") && b8.equals("X") && b9.equals("X"))) {
                display2();
            }


        }
    }

    public void click4(View view) {
        if (k4 == 1) {
            displayver("");
            if (i % 2 != 0) {
                b4 = "0";
                displayMessage4("0");
            }
            if (i % 2 == 0) {
                b4 = "X";
                displayMessage4("X");
            }i++;
            k4++;
            if ((b1.equals("0") && b2.equals("0") && b3.equals("0")) || (b1.equals("0") && b4.equals("0") && b7.equals("0")) || (b1.equals("0") && b5.equals("0") && b9.equals("0")) || (b2.equals("0")
                    && b5.equals("0") && b8.equals("0")) || (b3.equals("0") && b5.equals("0") && b7.equals("0")) || (b3.equals("0") && b6.equals("0") && b9.equals("0")) || (b4.equals("0") && b5.equals("0")
                    && b6.equals("0")) || (b7.equals("0") && b8.equals("0") && b9.equals("0"))) {
                display1();
            }
            if ((b1.equals("X") && b2.equals("X") && b3.equals("X")) || (b1.equals("X") && b4.equals("X") && b7.equals("X")) || (b1.equals("X") && b5.equals("X") && b9.equals("X")) || (b2.equals("X")
                    && b5.equals("X") && b8.equals("X")) || (b3.equals("X") && b5.equals("X") && b7.equals("X")) || (b3.equals("X") && b6.equals("X") && b9.equals("X")) || (b4.equals("X") && b5.equals("X")
                    && b6.equals("X")) || (b7.equals("X") && b8.equals("X") && b9.equals("X"))) {
                display2();
            }


        }
    }

    public void click5(View view) {
        if (k5 == 1) {
            displayver("");
            if (i % 2 != 0) {
                b5 = "0";
                displayMessage5("0");
            }
            if (i % 2 == 0) {
                b5 = "X";
                displayMessage5("X");
            }i++;
            k5++;
            if ((b1.equals("0") && b2.equals("0") && b3.equals("0")) || (b1.equals("0") && b4.equals("0") && b7.equals("0")) || (b1.equals("0") && b5.equals("0") && b9.equals("0")) || (b2.equals("0")
                    && b5.equals("0") && b8.equals("0")) || (b3.equals("0") && b5.equals("0") && b7.equals("0")) || (b3.equals("0") && b6.equals("0") && b9.equals("0")) || (b4.equals("0") && b5.equals("0")
                    && b6.equals("0")) || (b7.equals("0") && b8.equals("0") && b9.equals("0"))) {
                display1();
            }
            if ((b1.equals("X") && b2.equals("X") && b3.equals("X")) || (b1.equals("X") && b4.equals("X") && b7.equals("X")) || (b1.equals("X") && b5.equals("X") && b9.equals("X")) || (b2.equals("X")
                    && b5.equals("X") && b8.equals("X")) || (b3.equals("X") && b5.equals("X") && b7.equals("X")) || (b3.equals("X") && b6.equals("X") && b9.equals("X")) || (b4.equals("X") && b5.equals("X")
                    && b6.equals("X")) || (b7.equals("X") && b8.equals("X") && b9.equals("X"))) {
                display2();
            }


        }
    }

    public void click6(View view) {
        if (k6 == 1) {
            displayver("");
            if (i % 2 != 0) {

                b6 = "0";
                displayMessage6("0");
            }
            if (i % 2 == 0) {
                b6 = "X";
                displayMessage6("X");
            }i++;
            k6++;
            if ((b1.equals("0") && b2.equals("0") && b3.equals("0")) || (b1.equals("0") && b4.equals("0") && b7.equals("0")) || (b1.equals("0") && b5.equals("0") && b9.equals("0")) || (b2.equals("0")
                    && b5.equals("0") && b8.equals("0")) || (b3.equals("0") && b5.equals("0") && b7.equals("0")) || (b3.equals("0") && b6.equals("0") && b9.equals("0")) || (b4.equals("0") && b5.equals("0")
                    && b6.equals("0")) || (b7.equals("0") && b8.equals("0") && b9.equals("0"))) {
                display1();
            }
            if ((b1.equals("X") && b2.equals("X") && b3.equals("X")) || (b1.equals("X") && b4.equals("X") && b7.equals("X")) || (b1.equals("X") && b5.equals("X") && b9.equals("X")) || (b2.equals("X")
                    && b5.equals("X") && b8.equals("X")) || (b3.equals("X") && b5.equals("X") && b7.equals("X")) || (b3.equals("X") && b6.equals("X") && b9.equals("X")) || (b4.equals("X") && b5.equals("X")
                    && b6.equals("X")) || (b7.equals("X") && b8.equals("X") && b9.equals("X"))) {
                display2();
            }


        }
    }

    public void click7(View view) {
        if (k7 == 1) {
            displayver("");
            if (i % 2 != 0) {
                b7 = "0";
                displayMessage7("0");
            }
            if (i % 2 == 0) {
                b7 = "X";
                displayMessage7("X");
            }i++;
            k7++;
            if ((b1.equals("0") && b2.equals("0") && b3.equals("0")) || (b1.equals("0") && b4.equals("0") && b7.equals("0")) || (b1.equals("0") && b5.equals("0") && b9.equals("0")) || (b2.equals("0")
                    && b5.equals("0") && b8.equals("0")) || (b3.equals("0") && b5.equals("0") && b7.equals("0")) || (b3.equals("0") && b6.equals("0") && b9.equals("0")) || (b4.equals("0") && b5.equals("0")
                    && b6.equals("0")) || (b7.equals("0") && b8.equals("0") && b9.equals("0"))) {
                display1();
            }
            if ((b1.equals("X") && b2.equals("X") && b3.equals("X")) || (b1.equals("X") && b4.equals("X") && b7.equals("X")) || (b1.equals("X") && b5.equals("X") && b9.equals("X")) || (b2.equals("X")
                    && b5.equals("X") && b8.equals("X")) || (b3.equals("X") && b5.equals("X") && b7.equals("X")) || (b3.equals("X") && b6.equals("X") && b9.equals("X")) || (b4.equals("X") && b5.equals("X")
                    && b6.equals("X")) || (b7.equals("X") && b8.equals("X") && b9.equals("X"))) {
                display2();
            }


        }
    }

    public void click8(View view) {
        if (k8 == 1) {
            displayver("");
            if (i % 2 != 0) {
                b8 = "0";
                displayMessage8("0");
            }
            if (i % 2 == 0) {
                b8 = "X";
                displayMessage8("X");
            }
            i++;
            k8++;
            if ((b1.equals("0") && b2.equals("0") && b3.equals("0")) || (b1.equals("0") && b4.equals("0") && b7.equals("0")) || (b1.equals("0") && b5.equals("0") && b9.equals("0")) || (b2.equals("0")
                    && b5.equals("0") && b8.equals("0")) || (b3.equals("0") && b5.equals("0") && b7.equals("0")) || (b3.equals("0") && b6.equals("0") && b9.equals("0")) || (b4.equals("0") && b5.equals("0")
                    && b6.equals("0")) || (b7.equals("0") && b8.equals("0") && b9.equals("0"))) {
                display1();
            }
            if ((b1.equals("X") && b2.equals("X") && b3.equals("X")) || (b1.equals("X") && b4.equals("X") && b7.equals("X")) || (b1.equals("X") && b5.equals("X") && b9.equals("X")) || (b2.equals("X")
                    && b5.equals("X") && b8.equals("X")) || (b3.equals("X") && b5.equals("X") && b7.equals("X")) || (b3.equals("X") && b6.equals("X") && b9.equals("X")) || (b4.equals("X") && b5.equals("X")
                    && b6.equals("X")) || (b7.equals("X") && b8.equals("X") && b9.equals("X"))) {
                display2();
            }


        }
    }

    public void click9(View view) {
        if (k9 == 1) {
            displayver("");
            if (i % 2 != 0) {
                b9 = "0";
                displayMessage9("0");
            }
            if (i % 2 == 0) {
                b9 = "X";
                displayMessage9("X");
            }
            i++;
            k9++;
            if ((b1.equals("0") && b2.equals("0") && b3.equals("0")) || (b1.equals("0") && b4.equals("0") && b7.equals("0")) || (b1.equals("0") && b5.equals("0") && b9.equals("0")) || (b2.equals("0")
                    && b5.equals("0") && b8.equals("0")) || (b3.equals("0") && b5.equals("0") && b7.equals("0")) || (b3.equals("0") && b6.equals("0") && b9.equals("0")) || (b4.equals("0") && b5.equals("0")
                    && b6.equals("0")) || (b7.equals("0") && b8.equals("0") && b9.equals("0"))) {
                display1();
            }
            if ((b1.equals("X") && b2.equals("X") && b3.equals("X")) || (b1.equals("X") && b4.equals("X") && b7.equals("X")) || (b1.equals("X") && b5.equals("X") && b9.equals("X")) || (b2.equals("X")
                    && b5.equals("X") && b8.equals("X")) || (b3.equals("X") && b5.equals("X") && b7.equals("X")) || (b3.equals("X") && b6.equals("X") && b9.equals("X")) || (b4.equals("X") && b5.equals("X")
                    && b6.equals("X")) || (b7.equals("X") && b8.equals("X") && b9.equals("X"))) {
                display2();
            }


        }
    }

    public void display1() {

        displayver("player 1 wins");
        displayMessage("");
        displayMessage2("");
        displayMessage3("");
        displayMessage4("");
        displayMessage5("");
        displayMessage6("");
        displayMessage7("");
        displayMessage8("");
        displayMessage9("");
        i=1;k1=1;k2=1;k3=1;k4=1;k5=1;k6=1;k7=1;k8=1;k9=1;
        b1="";b2="";b3="";b4="";b5="";b6="";b7="";b8="";b9="";
    }

    public void display2()
    {
        displayver("player 2 wins");
        displayMessage("");
        displayMessage2("");
        displayMessage3("");
        displayMessage4("");
        displayMessage5("");
        displayMessage6("");
        displayMessage7("");
        displayMessage8("");
        displayMessage9("");
        i=1;k1=1;k2=1;k3=1;k4=1;k5=1;k6=1;k7=1;k8=1;k9=1;
        b1="";b2="";b3="";b4="";b5="";b6="";b7="";b8="";b9="";
    }
}