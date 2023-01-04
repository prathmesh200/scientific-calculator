package com.example.scientific_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bequal,bsin,bcos,btan,bac,bc,bone,btwo,bpy,badd,bsub,bdiv,bmul,blog,bantilog,bx1,bx2,bsqroot,binverse;
    TextView tone,ttwo;
    Button secound;
    String pi="3.141592653589793238";
    Boolean hasdot=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b0=findViewById(R.id.b0);
        bdot=findViewById(R.id.bdot);
        bequal=findViewById(R.id.bequal);
        bsin=findViewById(R.id.bsin);
        bcos=findViewById(R.id.bcos);
        btan=findViewById(R.id.btan);
        bac=findViewById(R.id.bac);
        bc=findViewById(R.id.bc);
        bone=findViewById(R.id.bb1);
        btwo=findViewById(R.id.bb2);
        bpy=findViewById(R.id.bpi);
        badd=findViewById(R.id.badd);
        bsub=findViewById(R.id.bsub);
        bdiv=findViewById(R.id.bx5);
        bmul=findViewById(R.id.bmul);
        blog=findViewById(R.id.blog);
        bantilog=findViewById(R.id.bIn);
        bx1=findViewById(R.id.bx1);
        bx2=findViewById(R.id.bx2);
        bsqroot=findViewById(R.id.bx3);
        binverse=findViewById(R.id.bx4);
        secound=findViewById(R.id.bpj);




        tone=findViewById(R.id.first);
        ttwo=findViewById(R.id.secound);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tone.setText(tone.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tone.setText(tone.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tone.setText(tone.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tone.setText(tone.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tone.setText(tone.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tone.setText(tone.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tone.setText(tone.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tone.setText(tone.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tone.setText(tone.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tone.setText(tone.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tone.setText(tone.getText()+".");
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tone.setText("");
                ttwo.setText("");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=tone.getText().toString();
                val=val.substring(0,val.length()-1);
                tone.setText(val);
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tone.setText(tone.getText()+"+");
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tone.setText(tone.getText()+"-");
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tone.setText(tone.getText()+"*");
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tone.setText(tone.getText()+"÷");
            }
        });
        bsqroot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=tone.getText().toString();
                double r=Math.sqrt(Double.parseDouble(val));
                tone.setText(String.valueOf(r));
            }
        });
        bone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tone.setText(tone.getText()+"(");
            }
        });
        btwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tone.setText(tone.getText()+")");
            }
        });
        bpy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ttwo.setText(bpy.getText());
                tone.setText(tone.getText()+pi);
            }
        });
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tone.setText(tone.getText()+"sin");
            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tone.setText(tone.getText()+"cos");
            }
        });
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tone.setText(tone.getText()+"tan");
            }
        });
        binverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tone.setText(tone.getText()+"^"+"(-1)");
            }
        });
        bx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val=Integer.parseInt(tone.getText().toString());
                int fact=factorial(val);
                tone.setText(String.valueOf(fact));
                ttwo.setText(val+"!");

            }
        });

        bx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double d=Double.parseDouble(tone.getText().toString());
                double square=d*d;
                tone.setText(String.valueOf(square));
                ttwo.setText(d+"2");
            }
        });

        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tone.setText(tone.getText()+"log");
            }
        });

        bantilog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tone.setText(tone.getText()+"In");
            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=tone.getText().toString();
                String a=val.replace('÷','/').replace('x','*');
                double result=eval(a);
                tone.setText(String.valueOf(result));
                ttwo.setText(val);
            }
        });




    }








    //factorial function
    int factorial(int n){
        return(n==1 || n==0) ? 1: n*factorial(n-1);
    }

    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}


