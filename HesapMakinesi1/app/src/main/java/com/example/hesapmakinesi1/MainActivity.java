package com.example.hesapmakinesi1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    TextView tvSonuc,tvSonuc1;
    String islem="";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvSonuc = findViewById(R.id.tv_sonuc);
        tvSonuc1=findViewById(R.id.textView2);
    }

    public void sifir(View view) {
            if(tvSonuc.length()==0){
                tvSonuc.setText("0");
            }
            else{
                String text= tvSonuc.getText().toString();
                tvSonuc.setText(text+"0");
            }
        }

    public void bir(View view) {
        if(tvSonuc.length()==0){
            tvSonuc.setText("1");
        }
        else{
            String text= tvSonuc.getText().toString();
            tvSonuc.setText(text+"1");
        }
    }

    public void iki(View view) {
        if(tvSonuc.length()==0){
            tvSonuc.setText("2");
        }
        else{
            String text= tvSonuc.getText().toString();
            tvSonuc.setText(text+"2");
        }
    }

    public void uc(View view) {
        if(tvSonuc.length()==0){
            tvSonuc.setText("3");
        }
        else{
            String text= tvSonuc.getText().toString();
            tvSonuc.setText(text+"3");
        }
    }

    public void dort(View view) {
        if(tvSonuc.length()==0){
            tvSonuc.setText("4");
        }
        else{
            String text= tvSonuc.getText().toString();
            tvSonuc.setText(text+"4");
        }
    }

    public void bes(View view) {
        if(tvSonuc.length()==0){
            tvSonuc.setText("5");
        }
        else{
            String text= tvSonuc.getText().toString();
            tvSonuc.setText(text+"5");
        }
    }

    public void alti(View view) {
        if(tvSonuc.length()==0){
            tvSonuc.setText("6");
        }
        else{
            String text= tvSonuc.getText().toString();
            tvSonuc.setText(text+"6");
        }
    }

    public void yedi(View view) {
        if(tvSonuc.length()==0){
            tvSonuc.setText("7");
        }
        else{
            String text= tvSonuc.getText().toString();
            tvSonuc.setText(text+"7");
        }
    }

    public void sekiz(View view) {
        if(tvSonuc.length()==0){
            tvSonuc.setText("8");
        }
        else{
            String text= tvSonuc.getText().toString();
            tvSonuc.setText(text+"8");
        }
    }

    public void dokuz(View view) {
        if(tvSonuc.length()==0){
            tvSonuc.setText("9");
        }
        else{
            String text= tvSonuc.getText().toString();
            tvSonuc.setText(text+"9");
        }
    }

    public void nokta(View view) {
        String ifade = tvSonuc.getText().toString();
        String sayilar[]= ifade.split("\\.");
        if(ifade.endsWith(".")){
            tvSonuc.setText(ifade);
        }
        else {
            if (tvSonuc.length() == 0) {
                tvSonuc.setText("");
            } else {
                String text = tvSonuc.getText().toString();
                tvSonuc.setText(text + ".");
            }
        }
    }

    public void arti(View view) {
        if(tvSonuc.length()==0 && tvSonuc1.length()!=0){
            String ifade = tvSonuc1.getText().toString();
            String sayilar[]= ifade.split("\\+");
            if(ifade.endsWith(".")){
                tvSonuc.setText(ifade);
            }
            else {
                if (islem.equals("")) {
                    String text = tvSonuc1.getText().toString();
                    tvSonuc.setText(text + "+");
                    tvSonuc1.setText("");
                    islem = "+";
                } else {
                    tvSonuc.setText(tvSonuc.getText().toString().replace(islem, "+"));
                    islem = "+";
                }
            }
        }
        if(tvSonuc.length()!=0){
            String ifade = tvSonuc.getText().toString();
            String sayilar[]= ifade.split("\\+");
            if(ifade.endsWith(".")){
                tvSonuc.setText(ifade);
            }
            else {
                if (islem.equals("")) {
                    String text = tvSonuc.getText().toString();
                    tvSonuc.setText(text + "+");
                    islem = "+";
                }
                else {
                    tvSonuc.setText(tvSonuc.getText().toString().replace(islem, "+"));
                    islem = "+";
                }
            }
        }
    }

    public void eksi(View view) {
        if(tvSonuc.length()==0 && tvSonuc1.length()!=0){
            String ifade = tvSonuc1.getText().toString();
            String sayilar[]= ifade.split("\\-");
            if(ifade.endsWith(".")){
                tvSonuc.setText(ifade);
            }
            else {
                if (islem.equals("")) {
                    String text = tvSonuc1.getText().toString();
                    tvSonuc.setText(text + "-");
                    tvSonuc1.setText("");
                    islem = "-";
                } else {
                    tvSonuc.setText(tvSonuc.getText().toString().replace(islem, "-"));
                    islem = "-";
                }
            }
        }
        if(tvSonuc.length()!=0){
            String ifade = tvSonuc.getText().toString();
            String sayilar[]= ifade.split("\\-");
            if(ifade.endsWith(".")){
                tvSonuc.setText(ifade);
            }
            else {
                if (islem.equals("")) {
                    String text = tvSonuc.getText().toString();
                    tvSonuc.setText(text + "-");
                    islem = "-";
                } else {
                    tvSonuc.setText(tvSonuc.getText().toString().replace(islem, "-"));
                    islem = "-";
                }
            }
        }
    }

    public void carpi(View view) {
        if(tvSonuc.length()==0 && tvSonuc1.length()!=0){
            String ifade = tvSonuc1.getText().toString();
            String sayilar[]= ifade.split("\\*");
            if(ifade.endsWith(".")){
                tvSonuc.setText(ifade);
            }
            else {
                if (islem.equals("")) {
                    String text = tvSonuc1.getText().toString();
                    tvSonuc.setText(text + "*");
                    tvSonuc1.setText("");
                    islem = "*";
                } else {
                    tvSonuc.setText(tvSonuc.getText().toString().replace(islem, "*"));
                    islem = "*";
                }
            }
        }
        if(tvSonuc.length()!=0){
            String ifade = tvSonuc.getText().toString();
            String sayilar[]= ifade.split("\\*");
            if(ifade.endsWith(".")){
                tvSonuc.setText(ifade);
            }
            else {
                if (islem.equals("")) {
                    String text = tvSonuc.getText().toString();
                    tvSonuc.setText(text + "*");
                    islem = "*";
                } else {
                    tvSonuc.setText(tvSonuc.getText().toString().replace(islem, "*"));
                    islem = "*";
                }
            }
        }
    }

    public void bolme(View view) {
        if(tvSonuc.length()==0 && tvSonuc1.length()!=0){
            String ifade = tvSonuc1.getText().toString();
            String sayilar[]= ifade.split("\\÷");
            if(ifade.endsWith(".")){
                tvSonuc.setText(ifade);
            }
            else {
                if (islem.equals("")) {
                    String text = tvSonuc1.getText().toString();
                    tvSonuc.setText(text + "÷");
                    tvSonuc1.setText("");
                    islem = "÷";
                } else {
                    tvSonuc.setText(tvSonuc.getText().toString().replace(islem, "÷"));
                    islem = "÷";
                }
            }
        }
        if(tvSonuc.length()!=0){
            String ifade = tvSonuc.getText().toString();
            String sayilar[]= ifade.split("\\÷");
            if(ifade.endsWith(".")){
                tvSonuc.setText(ifade);
            }
            else {
                if (islem.equals("")) {
                    String text = tvSonuc.getText().toString();
                    tvSonuc.setText(text + "÷");
                    islem = "÷";
                } else {
                    tvSonuc.setText(tvSonuc.getText().toString().replace(islem, "÷"));
                    islem = "÷";
                }
            }
        }
    }

    public void ctusu(View view) {

        tvSonuc.setText("");
        tvSonuc1.setText("");
        islem="";
    }

    public void esittir(View view) {
        if(!islem.equals("")){
            switch (islem){
                case "+":
                    String ifade = tvSonuc.getText().toString();
                    String sayilar[]= ifade.split("\\+");
                    if(ifade.endsWith("+") ||ifade.endsWith("-") ||ifade.endsWith("*") ||ifade.endsWith("÷") ||ifade.endsWith(".")){
                        tvSonuc.setText(ifade);
                        islem="+";
                        break;
                    }
                    else{
                        tvSonuc1.setText(String.valueOf(Double.parseDouble(sayilar[0])+Double.parseDouble(sayilar[1])));
                        tvSonuc.setText("");
                        islem="";
                        break;
                    }

                case "-":
                    String ifade1 =tvSonuc.getText().toString();
                    String sayilar1[]=ifade1.split(("\\-"));
                    if(ifade1.endsWith("+") ||ifade1.endsWith("-") ||ifade1.endsWith("*") ||ifade1.endsWith("÷") ||ifade1.endsWith(".")){
                        tvSonuc.setText(ifade1);
                        islem="-";
                        break;
                    }
                    else {
                        if (ifade1.startsWith("-")) {
                            tvSonuc1.setText("-"+String.valueOf(Double.parseDouble(sayilar1[1]) +Double.parseDouble(sayilar1[2])));
                            tvSonuc.setText("");
                            islem = "";
                            break;
                        }
                        else {
                            tvSonuc1.setText(String.valueOf(Double.parseDouble(sayilar1[0]) - Double.parseDouble(sayilar1[1])));
                            tvSonuc.setText("");
                            islem = "";
                            break;
                        }
                    }
                case "*":
                    String ifade2 =tvSonuc.getText().toString();
                    String sayilar2[]=ifade2.split(("\\*"));
                    if(ifade2.endsWith("+") ||ifade2.endsWith("-") ||ifade2.endsWith("*") ||ifade2.endsWith("÷") ||ifade2.endsWith(".")){
                        tvSonuc.setText(ifade2);
                        islem="*";
                        break;
                    }
                    else{
                        tvSonuc1.setText(String.valueOf(Double.parseDouble(sayilar2[0])*Double.parseDouble(sayilar2[1])));
                        tvSonuc.setText("");
                        islem="";
                        break;
                    }
                case "÷":
                    String ifade3 =tvSonuc.getText().toString();
                    String sayilar3[]=ifade3.split(("\\÷"));
                    if(ifade3.endsWith("+") ||ifade3.endsWith("-") ||ifade3.endsWith("*") ||ifade3.endsWith("÷") ||ifade3.endsWith(".")){
                        tvSonuc.setText(ifade3);
                        islem="÷";
                        break;
                    }
                    else{
                        tvSonuc1.setText(String.valueOf(Double.parseDouble(sayilar3[0])/Double.parseDouble(sayilar3[1])));
                        tvSonuc.setText("");
                        islem="";
                        break;
                    }
            }
        }
    }

    public void delete(View view){
        if(tvSonuc.length()!=0)
            {
                char[] text= tvSonuc.getText().toString().toCharArray();
                char[] newArray = Arrays.copyOfRange(text,0,text.length-1);
                tvSonuc.setText(String.valueOf(newArray));
            }
        else if(tvSonuc1.length()!=0)
            {
                char[] text= tvSonuc1.getText().toString().toCharArray();
                char[] newArray = Arrays.copyOfRange(text,0,text.length-1);
                tvSonuc1.setText(String.valueOf(newArray));
            }
        else
        {
            tvSonuc.setText("");
        }
    }
}
