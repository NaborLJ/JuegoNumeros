package com.example.nlopezjimenez.juegonumeros;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

        ArrayList random = new ArrayList();
        ArrayList respuesta = new ArrayList();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        }
        public void Random() {
        for (int i = 0; i < 5; i++) {
            int valor = (int) Math.floor(Math.random() * 9);
            while (random.contains(valor)) {
                valor = (int) Math.floor(Math.random() * 9);
            }
            random.add(valor);
        }

    }
        void eventoComenzar(View s) {
            Random();
            Toast.makeText(getApplicationContext(), random.toString(), Toast.LENGTH_LONG).show();
            Button button0 = (Button) findViewById(R.id.button0);
            Button button1 = (Button) findViewById(R.id.button1);
            Button button2 = (Button) findViewById(R.id.button2);
            Button button3 = (Button) findViewById(R.id.button3);
            Button button4 = (Button) findViewById(R.id.button4);
            Button button5 = (Button) findViewById(R.id.button5);
            Button button6 = (Button) findViewById(R.id.button6);
            Button button7 = (Button) findViewById(R.id.button7);
            Button button8 = (Button) findViewById(R.id.button8);
            button0.setBackgroundColor(Color.WHITE);
            button1.setBackgroundColor(Color.WHITE);
            button2.setBackgroundColor(Color.WHITE);
            button3.setBackgroundColor(Color.WHITE);
            button4.setBackgroundColor(Color.WHITE);
            button5.setBackgroundColor(Color.WHITE);
            button6.setBackgroundColor(Color.WHITE);
            button7.setBackgroundColor(Color.WHITE);
            button8.setBackgroundColor(Color.WHITE);
            button0.setEnabled(true);
            button1.setEnabled(true);
            button2.setEnabled(true);
            button3.setEnabled(true);
            button4.setEnabled(true);
            button5.setEnabled(true);
            button6.setEnabled(true);
            button7.setEnabled(true);
            button8.setEnabled(true);
            ((Button) s).setEnabled(false);

        }


        void evento0(View a) {
            respuesta.add(((Button) a).getText());
            ((Button) a).setBackgroundColor(Color.GRAY);
            ((Button) a).setEnabled(false);
        }

        void evento1(View b) {
            respuesta.add(((Button) b).getText());
            ((Button) b).setBackgroundColor(Color.GRAY);
            ((Button) b).setEnabled(false);
        }

        void evento2(View c) {
            respuesta.add(((Button) c).getText());
            ((Button) c).setBackgroundColor(Color.GRAY);
            ((Button) c).setEnabled(false);
        }

        void evento3(View d) {
            respuesta.add(((Button) d).getText());
            ((Button) d).setBackgroundColor(Color.GRAY);
            ((Button) d).setEnabled(false);
        }

        void evento4(View e) {
            respuesta.add(((Button) e).getText());
            ((Button) e).setBackgroundColor(Color.GRAY);
            ((Button) e).setEnabled(false);
        }

        void evento5(View f) {
            respuesta.add(((Button) f).getText());
            ((Button) f).setBackgroundColor(Color.GRAY);
            ((Button) f).setEnabled(false);
        }

        void evento6(View g) {
            respuesta.add(((Button) g).getText());
            ((Button) g).setBackgroundColor(Color.GRAY);
            ((Button) g).setEnabled(false);
        }

        void evento7(View h) {
            respuesta.add(((Button) h).getText());
            ((Button) h).setBackgroundColor(Color.GRAY);
            ((Button) h).setEnabled(false);
        }

        void evento8(View i) {
            respuesta.add(((Button) i).getText());
            ((Button) i).setBackgroundColor(Color.GRAY);
            ((Button) i).setEnabled(false);
        }

        void eventoComprobar(View j) {
            String ran = random.toString();
            String res = respuesta.toString();

            if (ran.equals(res)) {
                Toast.makeText(getApplicationContext(), "Correcto!", Toast.LENGTH_SHORT).show();

            } else {
                Toast.makeText(getApplicationContext(), "Error!", Toast.LENGTH_SHORT).show();
            }
            Button Comenzar = (Button) findViewById(R.id.Comenzar);
            Comenzar.setEnabled(true);

            respuesta.clear();
            random.clear();
        }



    }



