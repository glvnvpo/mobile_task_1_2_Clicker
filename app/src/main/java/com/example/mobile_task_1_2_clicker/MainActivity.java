package com.example.mobile_task_1_2_clicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mainText;
    ImageButton mainBtn;
    ImageButton minusBtn;
    ImageButton resetBtn;

    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnadd;
    Button btnsub;
    Button btndiv;
    Button btnmul;
    Button btnCount;
    Button btnDelete;
    TextView resultText;

    private long score = 0;

    String expression = "";
    private long total = 0;
    String todos = "";
    String number1 = "";
    Boolean start = Boolean.TRUE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = (TextView) findViewById(R.id.mainText);
        mainBtn = (ImageButton) findViewById(R.id.button);
        minusBtn = (ImageButton) findViewById(R.id.button_minus);
        resetBtn = (ImageButton) findViewById(R.id.button_reset);


        View.OnClickListener clickListener_plus = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score ++;


                if ((score == 2) || (score == 3) || (score == 4)) //проверить окончания 22, 23...
                {
                    String s = "Кнопка нажата " + score +" раза.";
                    mainText.setText(s.toCharArray(),0, s.length());
                }
                else if ((score>20) && ((score % 10 == 2) || (score % 10 == 3) || (score % 10 == 4))) {
                    String s = "Кнопка нажата " + score +" раза.";
                    mainText.setText(s.toCharArray(),0, s.length());
                }
                else {
                    String s = "Кнопка нажата " + score +" раз.";
                    mainText.setText(s.toCharArray(),0, s.length());
                }

            }
        };

        View.OnClickListener clickListener_minus = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (score>0) {
                    score --;

                    if ((score == 2) || (score == 3) || (score == 4)) //проверить окончания 22, 23...
                    {
                        String s = "Кнопка нажата " + score +" раза.";
                        mainText.setText(s.toCharArray(),0, s.length());
                    }
                    else if ((score>20) && ((score % 10 == 2) || (score % 10 == 3) || (score % 10 == 4))) {
                        String s = "Кнопка нажата " + score +" раза.";
                        mainText.setText(s.toCharArray(),0, s.length());
                    }
                    else {
                        String s = "Кнопка нажата " + score +" раз.";
                        mainText.setText(s.toCharArray(),0, s.length());
                    }
                }

            }
        };

        View.OnClickListener clickListener_reset = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
                String s = "Кнопка нажата " + score + " раз.";
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };

        mainBtn.setOnClickListener(clickListener_plus);

        minusBtn.setOnClickListener(clickListener_minus);

        resetBtn.setOnClickListener(clickListener_reset);


        btn0 = (Button) findViewById(R.id.button_0);
        btn1 = (Button) findViewById(R.id.button_1);
        btn2 = (Button) findViewById(R.id.button_2);
        btn3 = (Button) findViewById(R.id.button_3);
        btn4 = (Button) findViewById(R.id.button_4);
        btn5 = (Button) findViewById(R.id.button_5);
        btn6 = (Button) findViewById(R.id.button_6);
        btn7 = (Button) findViewById(R.id.button_7);
        btn8 = (Button) findViewById(R.id.button_8);
        btn9 = (Button) findViewById(R.id.button_9);
        btnCount = (Button) findViewById(R.id.button_count);
        resultText = (TextView) findViewById(R.id.textView);
        btnadd = (Button) findViewById(R.id.button_addition);
        btnsub = (Button) findViewById(R.id.button_substraction);
        btndiv = (Button) findViewById(R.id.button_division);
        btnmul = (Button) findViewById(R.id.button_multiplication);
        btnDelete = (Button) findViewById(R.id.button_delete);



        View.OnClickListener clickListener_0 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression += "0";
                if (start == Boolean.TRUE){
                    total = Integer.parseInt(expression);
                }
                else {
                    number1 += "0";
                }

                resultText.setText(expression);
            }
        };
        View.OnClickListener clickListener_1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression += "1";

                if (start == Boolean.TRUE){
                    total = Integer.parseInt(expression);
                }
                else {
                    number1 += "1";
                }
                resultText.setText(expression);
            }
        };
        View.OnClickListener clickListener_2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression += "2";
                if (start == Boolean.TRUE){
                    total = Integer.parseInt(expression);
                }
                else {
                    number1 += "2";
                }
                resultText.setText(expression);
            }
        };
        View.OnClickListener clickListener_3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression += "3";
                if (start == Boolean.TRUE){
                    total = Integer.parseInt(expression);
                }
                else {
                    number1 += "3";
                }
                resultText.setText(expression);
            }
        };
        View.OnClickListener clickListener_4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression += "4";
                if (start == Boolean.TRUE){
                    total = Integer.parseInt(expression);
                }
                else {
                    number1 += "4";
                }
                resultText.setText(expression);
            }
        };
        View.OnClickListener clickListener_5 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression += "5";
                if (start == Boolean.TRUE){
                    total = Integer.parseInt(expression);
                }
                else {
                    number1 += "5";
                }
                resultText.setText(expression);
            }
        };
        View.OnClickListener clickListener_6 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression += "6";
                if (start == Boolean.TRUE){
                    total = Integer.parseInt(expression);
                }
                else {
                    number1 += "6";
                }
                resultText.setText(expression);
            }
        };
        View.OnClickListener clickListener_7 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression += "7";
                if (start == Boolean.TRUE){
                    total = Integer.parseInt(expression);
                }
                else {
                    number1 += "7";
                }
                resultText.setText(expression);
            }
        };
        View.OnClickListener clickListener_8 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression += "8";
                if (start == Boolean.TRUE){
                    total = Integer.parseInt(expression);
                }
                else {
                    number1 += "8";
                }
                resultText.setText(expression);
            }
        };
        View.OnClickListener clickListener_9 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression += "9";
                if (start == Boolean.TRUE){
                    total = Integer.parseInt(expression);
                }
                else {
                    number1 += "9";
                }
                resultText.setText(expression);
            }
        };
        View.OnClickListener clickListener_add = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression += "+";
                if ((expression.substring(expression.length() - 2,expression.length() - 2)=="+") || (expression.substring(expression.length() - 2,expression.length() - 2)=="-") || (expression.substring(expression.length() - 2,expression.length() - 2)=="*") || (expression.substring(expression.length() - 2,expression.length() - 2)=="/") ){
                    expression = "";
                    resultText.setText("ОШИБКА! Два идущих подряд оператора.");
                    total=0;
                    start = Boolean.TRUE;
                    number1 = "";
                    todos = "";
                }
                else if (expression.length()==1) {
                    expression = "";
                    resultText.setText("ОШИБКА! ");
                    total=0;
                    start = Boolean.TRUE;
                    number1 = "";
                    todos = "";
                }
                else {
                    if (start == Boolean.TRUE) {
                        start = Boolean.FALSE;
                    }

                    if (todos=="+"){
                        total += Integer.parseInt(number1);
                        number1 = "";
                    }
                    else if (todos=="*") {
                        total *= Integer.parseInt(number1);
                        number1 = "";
                    }
                    else if (todos=="-") {
                        total -= Integer.parseInt(number1);
                        number1 = "";
                    }
                    if ((todos=="/") && (Integer.parseInt(number1)!=0)){
                        total /= Integer.parseInt(number1);
                        number1 = "";
                    }
                    else if ((todos=="/") && (Integer.parseInt(number1)==0)) {
                        expression = "";
                        resultText.setText("Делить на 0 нельзя!");
                        total=0;
                        start = Boolean.TRUE;
                        number1 = "";
                        todos = "";
                    }
                    todos = "+";
                    number1 = "";
                    resultText.setText(expression);
                }

            }
        };
        View.OnClickListener clickListener_sub = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression += "-";
                if ((expression.substring(expression.length() - 2,expression.length() - 2)=="+") || (expression.substring(expression.length() - 2,expression.length() - 2)=="-") || (expression.substring(expression.length() - 2,expression.length() - 2)=="*") || (expression.substring(expression.length() - 2,expression.length() - 2)=="/") ){
                    expression = "";
                    resultText.setText("ОШИБКА! Два идущих подряд оператора.");
                    total=0;
                    start = Boolean.TRUE;
                    number1 = "";
                    todos = "";
                }
                else if (expression.length()==1) {
                    expression = "";
                    resultText.setText("ОШИБКА! ");
                    total=0;
                    start = Boolean.TRUE;
                    number1 = "";
                    todos = "";
                }
                else {
                    if (start == Boolean.TRUE) {
                        start = Boolean.FALSE;
                    }

                    if (todos=="+"){
                        total += Integer.parseInt(number1);
                        number1 = "";
                    }
                    else if (todos=="*") {
                        total *= Integer.parseInt(number1);
                        number1 = "";
                    }
                    else if (todos=="-") {
                        total -= Integer.parseInt(number1);
                        number1 = "";
                    }
                    if ((todos=="/") && (Integer.parseInt(number1)!=0)){
                        total /= Integer.parseInt(number1);
                        number1 = "";
                    }
                    else if ((todos=="/") && (Integer.parseInt(number1)==0)) {
                        expression = "";
                        resultText.setText("Делить на 0 нельзя!");
                        total=0;
                        start = Boolean.TRUE;
                        number1 = "";
                        todos = "";
                    }
                    todos = "-";
                    number1 = "";
                    resultText.setText(expression);
                }

            }
        };
        View.OnClickListener clickListener_div = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression += "/";
                if ((expression.substring(expression.length() - 2,expression.length() - 2)=="+") || (expression.substring(expression.length() - 2,expression.length() - 2)=="-") || (expression.substring(expression.length() - 2,expression.length() - 2)=="*") || (expression.substring(expression.length() - 2,expression.length() - 2)=="/") ){
                    expression = "";
                    resultText.setText("ОШИБКА! Два идущих подряд оператора.");
                    total=0;
                    start = Boolean.TRUE;
                    number1 = "";
                    todos = "";
                }
                else if (expression.length()==1) {
                    expression = "";
                    resultText.setText("ОШИБКА! ");
                    total=0;
                    start = Boolean.TRUE;
                    number1 = "";
                    todos = "";
                }
                else {
                    if (start == Boolean.TRUE) {
                        start = Boolean.FALSE;
                    }

                    if (todos=="+"){
                        total += Integer.parseInt(number1);
                        number1 = "";
                    }
                    else if (todos=="*") {
                        total *= Integer.parseInt(number1);
                        number1 = "";
                    }
                    else if (todos=="-") {
                        total -= Integer.parseInt(number1);
                        number1 = "";
                    }
                    if ((todos=="/") && (Integer.parseInt(number1)!=0)){
                        total /= Integer.parseInt(number1);
                        number1 = "";
                    }
                    else if ((todos=="/") && (Integer.parseInt(number1)==0)) {
                        expression = "";
                        resultText.setText("Делить на 0 нельзя!");
                        total=0;
                        start = Boolean.TRUE;
                        number1 = "";
                        todos = "";
                    }
                    todos = "/";
                    number1 = "";
                    resultText.setText(expression);
                }

            }
        };
        View.OnClickListener clickListener_mul = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression += "*";

                if ((expression.substring(expression.length() - 2,expression.length() - 2)=="+") || (expression.substring(expression.length() - 2,expression.length() - 2)=="-") || (expression.substring(expression.length() - 2,expression.length() - 2)=="*") || (expression.substring(expression.length() - 2,expression.length() - 2)=="/") ){
                    expression = "";
                    resultText.setText("ОШИБКА! Два идущих подряд оператора.");
                    total=0;
                    start = Boolean.TRUE;
                    number1 = "";
                    todos = "";
                }
                else if (expression.length()==1) {
                    expression = "";
                    resultText.setText("ОШИБКА! ");
                    total=0;
                    start = Boolean.TRUE;
                    number1 = "";
                    todos = "";
                }
                else {
                    if (start == Boolean.TRUE) {
                        start = Boolean.FALSE;
                    }

                    if (todos=="+"){
                        total += Integer.parseInt(number1);
                        number1 = "";

                    }
                    else if (todos=="*") {
                        total *= Integer.parseInt(number1);
                        number1 = "";

                    }
                    else if (todos=="-") {
                        total -= Integer.parseInt(number1);
                        number1 = "";

                    }
                    if ((todos=="/") && (Integer.parseInt(number1)!=0)){
                        total /= Integer.parseInt(number1);
                        number1 = "";

                    }
                    else if ((todos=="/") && (Integer.parseInt(number1)==0)) {
                        expression = "";
                        resultText.setText("Делить на 0 нельзя!");
                        total=0;
                        start = Boolean.TRUE;
                        number1 = "";
                        todos = "";
                    }
                    todos = "*";
                    number1 = "";
                    resultText.setText(expression);

                }

            }
        };
        View.OnClickListener clickListener_del = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression = "";
                resultText.setText(expression);
                start = Boolean.TRUE;
                number1 = "";
                todos = "";
            }
        };
        View.OnClickListener clickListener_count = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression = "";

                if (todos=="+"){
                    total += Integer.parseInt(number1);
                    number1 = "";
                    resultText.setText(Integer.toString((int) total));

                }
                else if (todos=="*") {
                    total *= Integer.parseInt(number1);
                    number1 = "";
                    resultText.setText(Integer.toString((int) total));

                }
                else if (todos=="-") {
                    total -= Integer.parseInt(number1);
                    number1 = "";
                    resultText.setText(Integer.toString((int) total));

                }
                else if (todos=="/") {
                    String str = number1;
                    String result = new StringBuilder(str).reverse().toString();
                    result = result.replaceAll("(.)(?=.*\\1)", "");
                    result = new StringBuilder(result).reverse().toString();
                    if (result.equals("0")) {
                        resultText.setText("На ноль делить нельзя!");
                    }
                    else {
                        total /= Integer.parseInt(number1);
                        number1 = "";
                        resultText.setText(Integer.toString((int) total));
                    }
                }
//                if ((todos=="/") && (number1!="0")){
//                    total /= Integer.parseInt(number1);
//                    number1 = "";
////                    resultText.setText(Integer.toString((int) total));
//                    resultText.setText("HERE");
//
//                }
//                else if (todos.equals("/")) {
//                    resultText.setText("Делить на 0 нельзя!");
//
////                    resultText.setText(Integer.parseInt(number1));
//                    total=0;
//                    start = Boolean.TRUE;
//                    number1 = "";
//                    todos = "";
//
//                }

                total=0;
                start = Boolean.TRUE;
                number1 = "";
                todos = "";


            }
        };

        btn0.setOnClickListener(clickListener_0);
        btn1.setOnClickListener(clickListener_1);
        btn2.setOnClickListener(clickListener_2);
        btn3.setOnClickListener(clickListener_3);
        btn4.setOnClickListener(clickListener_4);
        btn5.setOnClickListener(clickListener_5);
        btn6.setOnClickListener(clickListener_6);
        btn7.setOnClickListener(clickListener_7);
        btn8.setOnClickListener(clickListener_8);
        btn9.setOnClickListener(clickListener_9);

        btnCount.setOnClickListener(clickListener_count);
        btnadd.setOnClickListener(clickListener_add);
        btnsub.setOnClickListener(clickListener_sub);
        btndiv.setOnClickListener(clickListener_div);
        btnmul.setOnClickListener(clickListener_mul);
        btnDelete.setOnClickListener(clickListener_del);
    }
}

