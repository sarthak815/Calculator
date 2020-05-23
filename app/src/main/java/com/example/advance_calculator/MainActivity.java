package com.example.advance_calculator;

import androidx.appcompat.app.AppCompatActivity;
import java.lang.Math;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_Add,btn_Sub,btn_Mul,btn_Div,btn_calc,btn_dec,btn_clear, btn_power, btn_root, btn_log;
    EditText ed1, ans, ed2, ed3;
    String number, ans1;
    float Value1, Value2;
    boolean mAddition, mSubtract, mMultiplication, mDivision, mPower, mRoot, mLog;

    public static float parseFloat(final String value) {
        if (value.equals("")) {
            return 0;
        }
        return Float.parseFloat(value);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 = (Button) findViewById(R.id.zero);
        btn_1 = (Button) findViewById(R.id.one);
        btn_2 = (Button) findViewById(R.id.two);
        btn_3 = (Button) findViewById(R.id.three);
        btn_4 = (Button) findViewById(R.id.four);
        btn_5 = (Button) findViewById(R.id.five);
        btn_6 = (Button) findViewById(R.id.six);
        btn_7 = (Button) findViewById(R.id.seven);
        btn_8 = (Button) findViewById(R.id.eight);
        btn_9 = (Button) findViewById(R.id.nine);
        btn_Add = (Button) findViewById(R.id.plus);
        btn_Div = (Button) findViewById(R.id.div);
        btn_Sub = (Button) findViewById(R.id.sub);
        btn_Mul = (Button) findViewById(R.id.mult);
        btn_calc = (Button) findViewById(R.id.equal);
        btn_dec = (Button) findViewById(R.id.point);
        btn_power = (Button) findViewById(R.id.power);
        btn_clear = (Button) findViewById(R.id.c);
        btn_root = (Button) findViewById(R.id.root);
        btn_log = (Button) findViewById(R.id.log);
        ed3 = (EditText) findViewById(R.id.first_number);
        ans = (EditText) findViewById(R.id.answer);
        ed2 = (EditText) findViewById(R.id.operator);
        ed1 = (EditText) findViewById(R.id.second_number);
        ed1.setCursorVisible(false);
        ed1.setTextIsSelectable(true);
        ed1.setShowSoftInputOnFocus(false);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        ed2.setCursorVisible(false);
        ed2.setTextIsSelectable(true);
        ed2.setShowSoftInputOnFocus(false);
        ed3.setCursorVisible(false);
        ed3.setTextIsSelectable(true);
        ed3.setShowSoftInputOnFocus(false);
        ans.setCursorVisible(false);
        ans.setTextIsSelectable(true);
        ans.setShowSoftInputOnFocus(false);



        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.getText().toString().trim().length() > 0) {
                    ed1.setText("");
                    ed2.setText("");
                    ed3.setText("");
                    ans.setText("");
                }
                ed1.setText(ed1.getText() + "0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.getText().toString().trim().length() > 0) {
                    ed1.setText("");
                    ed2.setText("");
                    ed3.setText("");
                    ans.setText("");
                }
                ed1.setText(ed1.getText()+"1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.getText().toString().trim().length() > 0) {
                    ed1.setText("");
                    ed2.setText("");
                    ed3.setText("");
                    ans.setText("");
                }
                ed1.setText(ed1.getText()+"2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.getText().toString().trim().length() > 0) {
                    ed1.setText("");
                    ed2.setText("");
                    ed3.setText("");
                    ans.setText("");
                }
                ed1.setText(ed1.getText()+"3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.getText().toString().trim().length() > 0) {
                    ed1.setText("");
                    ed2.setText("");
                    ed3.setText("");
                    ans.setText("");
                }
                ed1.setText(ed1.getText()+"4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.getText().toString().trim().length() > 0) {
                    ed1.setText("");
                    ed2.setText("");
                    ed3.setText("");
                    ans.setText("");
                }
                ed1.setText(ed1.getText()+"5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.getText().toString().trim().length() > 0) {
                    ed1.setText("");
                    ed2.setText("");
                    ed3.setText("");
                    ans.setText("");
                }
                ed1.setText(ed1.getText()+"6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.getText().toString().trim().length() > 0) {
                    ed1.setText("");
                    ed2.setText("");
                    ed3.setText("");
                    ans.setText("");
                }
                ed1.setText(ed1.getText()+"7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.getText().toString().trim().length() > 0) {
                    ed1.setText("");
                    ed2.setText("");
                    ed3.setText("");
                    ans.setText("");
                }
                ed1.setText(ed1.getText()+"8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.getText().toString().trim().length() > 0) {
                    ed1.setText("");
                    ed2.setText("");
                    ed3.setText("");
                    ans.setText("");
                }
                ed1.setText(ed1.getText()+"9");
            }
        });

        btn_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.getText().toString().trim().length() > 0) {
                    ed1.setText("");
                    ed2.setText("");
                    ed3.setText("");
                    ans.setText("");
                }
                ed1.setText(ed1.getText()+".");
            }
        });




        btn_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = parseFloat(ed1.getText() + "");
                if(Value1>0) {
                    number = ed1.getText().toString();
                    ed3.setText(number);
                    mDivision = true;
                    ed2.setText("/");
                    ed1.setText(null);
                }
            }
        });
        btn_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = parseFloat(ed1.getText()+"");
                if(Value1>0) {
                    number = ed1.getText().toString();
                    ed3.setText(number);
                    mMultiplication = true;
                    ed2.setText("*");
                    ed1.setText(null);
                }
            }
        });
        btn_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = parseFloat(ed1.getText()+"");
                if(Value1>0) {
                    number = ed1.getText().toString();
                    ed3.setText(number);
                    mSubtract = true;
                    ed2.setText("-");
                    ed1.setText(null);
                }
            }
        });
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = parseFloat(ed1.getText()+"");
                if(Value1>0) {
                    number = ed1.getText().toString();
                    ed3.setText(number);
                    mAddition = true;
                    ed2.setText("+");
                    ed1.setText(null);
                }
            }
        });
        btn_power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = parseFloat(ed1.getText()+"");
                if(Value1>0) {
                number = ed1.getText().toString();
                ed3.setText(number);
                mPower = true ;
                ed2.setText("^");
                ed1.setText(null);
                }
            }
        });
        btn_root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.getText().toString().trim().length() > 0) {
                    ed1.setText("");
                    ed2.setText("\u221A");
                    ed3.setText("");
                    ans.setText("");
                    if (Value1> 0) {

                        Value1 = parseFloat(ed1.getText()+"");
                        mRoot = true ;
                       }
                    else{
                        mRoot = true;
                        }
                }
                else if (Value1> 0) {

                    Value1 = parseFloat(ed1.getText()+"");
                    mRoot = true ;
                    ed2.setText("\u221A");}
                else{
                    mRoot = true;
                    ed2.setText("\u221A");}
            }


        });
        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.getText().toString().trim().length() > 0) {
                    ed1.setText("");
                    ed2.setText("log");
                    ed3.setText("");
                    ans.setText("");
                    if (Value1 > 0) {

                        Value1 = parseFloat(ed1.getText() + "");
                        mLog = true;
                    } else {
                        mLog = true;
                    }
                }
                else if (Value1> 0) {

                    Value1 = parseFloat(ed1.getText()+"");
                    mLog = true ;
                    ed2.setText("log");}
                else{
                    mLog = true;
                    ed2.setText("log");}
                }

        });






        btn_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Value2 = parseFloat(ed1.getText() + "");

                if(Value1!=0 || Value2!=0) {
                    if (mAddition) {

                        ans.setText(Value1 + Value2 + "");
                        mAddition = false;
                    }


                    if (mSubtract) {
                        ans.setText(Value1 - Value2 + "");
                        mSubtract = false;
                    }

                    if (mMultiplication) {
                        ans.setText(Value1 * Value2 + "");
                        mMultiplication = false;
                    }

                    if (mDivision) {
                        ans.setText(Value1 / Value2 + "");
                        mDivision = false;
                    }
                    if (mPower) {

                        ans.setText(Math.pow(Value1, Value2) + "");
                        mPower = false;
                    }
                    if (mRoot) {
                        if (Value1 > 0) {
                            ans.setText(Math.sqrt(Value1) + "");
                            mRoot = false;
                        } else {
                            ans.setText(Math.sqrt(Value2) + "");
                            mRoot = false;
                        }
                    }
                    if (mLog) {
                        if (Value1 > 0) {
                            ans.setText(Math.log(Value1) + "");
                            mLog = false;
                        } else {
                            ans.setText(Math.log(Value2) + "");
                            mLog = false;
                        }
                    }
                }
            }

        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
                ed2.setText("");
                ed3.setText("");
                ans.setText("");
            }
        });
    }

}

