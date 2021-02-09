package com.example.calculeterdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double input0 , input1;

    TextView edt1;

    boolean Add , Sub, Mult, Dev, mRem, Dec;

    Button  But0, But1, But2, But3, But4, But5, But6, But7, But8, But9,
            ButAdd, ButSub, ButMult, ButDev, ButmRem, ButDec, ButEqu, ButDel;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        But0 = findViewById(R.id.Buttonzero);
        But1 = findViewById(R.id.Buttonone);
        But2 = findViewById(R.id.ButtonTow);
        But3 = findViewById(R.id.ButtonThree);
        But4 = findViewById(R.id.Buttonfone);
        But5 = findViewById(R.id.Buttonfaiv);
        But6 = findViewById(R.id.Buttonsix);
        But7 = findViewById(R.id.Buttonseven);
        But8 = findViewById(R.id.Buttoneath);
        But9 = findViewById(R.id.Buttonnaith);
        ButAdd = findViewById(R.id.Buttonplus);
        ButSub =  findViewById(R.id.Buttonminus);
        ButMult = findViewById(R.id.Buttonhit);
        ButDev = findViewById(R.id.ButtonSlash);
        ButmRem = findViewById(R.id.Buttonperc);
        ButDec = findViewById(R.id.Buttoncoma);
        ButEqu = findViewById(R.id.Buttonequ);
        ButDel = findViewById(R.id.Buttondel);

        edt1 = (TextView) findViewById(R.id.ScreenVeiew);

        But1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "1");
            }
        });
        But2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "2");
            }
        });
        But3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "3");
            }
        });
        But4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "4");
            }
        });
        But5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "5");
            }
        });
        But6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "6");
            }
        });
        But7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "7");
            }
        });
        But8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "8");
            }
        });
        But9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "9");
            }
        });
        But0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "0");
            }
        });

        ButAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt1.getText().length() != 0 ){
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Add = true;
                    Dec = false;
                    edt1.setText(null);
                }//end if
            }//End OnClick
        });//setOnClickListener
        ButSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt1.getText().length() != 0 ){
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Sub = true;
                    Dec = false;
                    edt1.setText(null);
                }//end if
            }//End OnClick
        });//setOnClickListener
        ButMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt1.getText().length() != 0 ){
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Mult = true;
                    Dec = false;
                    edt1.setText(null);
                }//end if
            }//End OnClick
        });//setOnClickListener
        ButDev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt1.getText().length() != 0 ){
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Dev = true;
                    Dec = false;
                    edt1.setText(null);
                }//end if
            }//End OnClick
        });//setOnClickListener
        ButmRem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt1.getText().length() != 0 ){
                    input1 = Float.parseFloat(edt1.getText() + "");
                    mRem = true;
                    Dec = false;
                    edt1.setText(null);
                }//end if
            }//End OnClick
        });//setOnClickListener
        ButEqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Add || Sub || Mult || Dev || mRem){
                        input0 = Float.parseFloat(edt1.getText() + "");
                }
                if(Add){
                    edt1.setText(input0 + input1 +"");
                    Add = false;
                }
                if(Sub){
                    edt1.setText(input0 - input1 + "");
                    Sub = false;
                }
                if(Mult){
                    edt1.setText(input0 * input1 + "");
                    Mult = false;
                }
                if (Dev){
                    edt1.setText(input0 / input1 + "");
                    Dev = false;
                }
                if (mRem){
                    edt1.setText(input0 % input1 + "");
                    mRem = false;
                }
            }//End OnClick
        });//setOnClickListener
        ButDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              edt1.setText("");
              input1 = 0.0;
              input0 = 0.0;
            }
        });
        ButDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Dec){
                    //null
                }else {
                    edt1.setText(edt1.getText() + "");
                    Dec = true;
                }
            }//End OnClick
        });//setOnClickListener
    }// end onCreate
}// End Class