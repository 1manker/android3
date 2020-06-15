package com.calculator;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class mainFrag extends Fragment {

    TextView textview;
    Button ac;
    Button b0;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button bplus;
    Button bminus;
    Button bdiv;
    Button bequals;
    Button bmult;
    Button bdot;
    Button bpow;
    Button bneg;

    String var1 = "";
    String var2 = "";
    String op = "";
    Boolean opSelected = false;
    Boolean resultGiven = false;

    public mainFrag() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        textview = rootView.findViewById(R.id.textView);
        ac = rootView.findViewById(R.id.ac);
        b0 = rootView.findViewById(R.id.b0);
        b1 = rootView.findViewById(R.id.b1);
        b2 = rootView.findViewById(R.id.b2);
        b3 = rootView.findViewById(R.id.b3);
        b4 = rootView.findViewById(R.id.b4);
        b5 = rootView.findViewById(R.id.b5);
        b6 = rootView.findViewById(R.id.b6);
        b7 = rootView.findViewById(R.id.b7);
        b8 = rootView.findViewById(R.id.b8);
        b9 = rootView.findViewById(R.id.b9);
        bplus = rootView.findViewById(R.id.bplus);
        bminus = rootView.findViewById(R.id.bminus);
        bdiv = rootView.findViewById(R.id.bdiv);
        bequals = rootView.findViewById(R.id.bequals);
        bmult= rootView.findViewById(R.id.bmult);
        bdot = rootView.findViewById(R.id.bdot);
        bpow = rootView.findViewById(R.id.bpow);
        bneg = rootView.findViewById(R.id.bneg);
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    textview.setText("");
                    var1 = "";
                    resultGiven = false;
                    opSelected = false;

            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opSelected){
                    textview.setText("0");
                    opSelected = false;
                    resultGiven = false;
                }
                else {
                    String temp = (String) textview.getText();
                    textview.setText(temp + "0");
                }

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opSelected || resultGiven){
                    textview.setText("1");
                    opSelected = false;
                    resultGiven = false;
                }
                else {
                    String temp = (String) textview.getText();
                    textview.setText(temp + "1");
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opSelected || resultGiven){
                    textview.setText("2");
                    opSelected = false;
                    resultGiven = false;
                }
                else {
                    String temp = (String) textview.getText();
                    textview.setText(temp + "2");
                }

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opSelected || resultGiven){
                    textview.setText("3");
                    opSelected = false;
                    resultGiven = false;
                }
                else {
                    String temp = (String) textview.getText();
                    textview.setText(temp + "3");
                }

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opSelected || resultGiven){
                    textview.setText("4");
                    opSelected = false;
                    resultGiven = false;
                }
                else {
                    String temp = (String) textview.getText();
                    textview.setText(temp + "4");
                }

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opSelected || resultGiven){
                    textview.setText("5");
                    opSelected = false;
                    resultGiven = false;
                }
                else {
                    String temp = (String) textview.getText();
                    textview.setText(temp + "5");
                }

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opSelected || resultGiven){
                    textview.setText("6");
                    opSelected = false;
                    resultGiven = false;
                }
                else {
                    String temp = (String) textview.getText();
                    textview.setText(temp + "6");
                }

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opSelected || resultGiven){
                    textview.setText("7");
                    opSelected = false;
                    resultGiven = false;
                }
                else {
                    String temp = (String) textview.getText();
                    textview.setText(temp + "7");
                }

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opSelected || resultGiven){
                    textview.setText("8");
                    opSelected = false;
                    resultGiven = false;
                }
                else {
                    String temp = (String) textview.getText();
                    textview.setText(temp + "8");
                }

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opSelected || resultGiven){
                    textview.setText("9");
                    opSelected = false;
                    resultGiven = false;
                }
                else {
                    String temp = (String) textview.getText();
                    textview.setText(temp + "9");
                }

            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = (String) textview.getText();
                if(!temp.contains(".") && !opSelected && !resultGiven){
                    textview.setText(temp + ".");
                }
                else if(opSelected || resultGiven){
                    textview.setText(".");
                    opSelected = false;
                    resultGiven = false;
                }
                else textview.setText(temp);
            }
        });
        bneg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = (String) textview.getText();
                if(!temp.contains("-") && !opSelected && !resultGiven){
                    textview.setText("-" + temp);
                }
                else if(opSelected || resultGiven){
                    opSelected = false;
                    textview.setText("-");
                    resultGiven = false;
                }
                else textview.setText(temp);
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double result = 0.0;
                String temp = (String) textview.getText();
                Log.v("This is the op symbol", op);
                Log.v("var1 empty?", Boolean.toString(var1.isEmpty()));
                if(!var1.isEmpty()){
                    try{
                        Double dub1 = Double.parseDouble(var1);
                        Double dub2 = Double.parseDouble(temp);
                        if(op.equals("+")) {
                            result = dub1 + dub2;
                            op = "+";
                        }
                        else if(op.equals("-")) {
                            result = dub1 - dub2;
                            op = "+";
                        }
                        else if(op.equals("*")) {
                            result = dub1 * dub2;
                            op = "+";
                        }
                        else if(op.equals("/")) {
                            result = dub1 / dub2;
                            op = "+";
                        }
                        else if(op.equals("^")) {
                            result = Math.pow(dub1, dub2);
                            op = "+";
                        }
                        else{
                            result = dub1 + dub2;
                            op = "+";
                        }
                        textview.setText(String.valueOf(result));
                        var1 = String.valueOf(result);
                        resultGiven = true;
                    }
                    catch(NumberFormatException e){
                    }
                }
                else {
                    try {
                        Double.parseDouble(temp);
                        var1 = temp;
                        op = "+";
                        opSelected = true;
                    }
                    catch (NumberFormatException e) {
                    }
                }
            }
        });
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double result = 0.0;
                String temp = (String) textview.getText();
                if(!var1.isEmpty()){
                    try{
                        Double dub1 = Double.parseDouble(var1);
                        Double dub2 = Double.parseDouble(temp);
                        if(op.equals("+")) {
                            result = dub1 + dub2;
                            op = "-";
                        }
                        else if(op.equals("-")) {
                            result = dub1 - dub2;
                            op = "-";
                        }
                        else if(op.equals("*")) {
                            result = dub1 * dub2;
                            op = "-";
                        }
                        else if(op.equals("/")) {
                            result = dub1 / dub2;
                            op = "-";
                        }
                        else if(op.equals("^")) {
                            result = Math.pow(dub1, dub2);
                            op = "-";
                        }
                        else{
                            result = dub1 - dub2;
                            op = "-";
                        }
                        textview.setText(String.valueOf(result));
                        var1 = String.valueOf(result);
                        resultGiven = true;
                    }
                    catch(NumberFormatException e){
                    }
                }
                else {
                    try {
                        Double.parseDouble(temp);
                        var1 = temp;
                        op = "-";
                        opSelected = true;
                    }
                    catch (NumberFormatException e) {
                    }
                }
            }
        });
        bmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double result = 0.0;
                String temp = (String) textview.getText();
                if(!var1.isEmpty()){
                    try{
                        Double dub1 = Double.parseDouble(var1);
                        Double dub2 = Double.parseDouble(temp);
                        if(op.equals("+")) {
                            result = dub1 + dub2;
                            op = "*";
                        }
                        else if(op.equals("-")) {
                            result = dub1 - dub2;
                            op = "*";
                        }
                        else if(op.equals("*")) {
                            result = dub1 * dub2;
                            op = "*";
                        }
                        else if(op.equals("/")) {
                            result = dub1 / dub2;
                            op = "*";
                        }
                        else if(op.equals("^")) {
                            result = Math.pow(dub1, dub2);
                            op = "*";
                        }
                        else{
                            result = dub1 * dub2;
                            op = "*";
                        }
                        textview.setText(String.valueOf(result));
                        var1 = String.valueOf(result);
                        resultGiven = true;
                    }
                    catch(NumberFormatException e){
                    }
                }
                else {
                    try {
                        Double.parseDouble(temp);
                        var1 = temp;
                        op = "*";
                        opSelected = true;
                    }
                    catch (NumberFormatException e) {
                    }
                }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double result = 0.0;
                String temp = (String) textview.getText();
                if(!var1.isEmpty()){
                    try{
                        Double dub1 = Double.parseDouble(var1);
                        Double dub2 = Double.parseDouble(temp);
                        if(op.equals("+")) {
                            result = dub1 + dub2;
                            op = "/";
                        }
                        else if(op.equals("-")) {
                            result = dub1 - dub2;
                            op = "/";
                        }
                        else if(op.equals("*")) {
                            result = dub1 * dub2;
                            op = "/";
                        }
                        else if(op.equals("/")) {
                            result = dub1 / dub2;
                            op = "/";
                        }
                        else if(op.equals("^")) {
                            result = Math.pow(dub1, dub2);
                            op = "/";
                        }
                        else{
                            result = dub1 / dub2;
                            op = "/";
                        }
                        textview.setText(String.valueOf(result));
                        var1 = String.valueOf(result);
                        resultGiven = true;
                    }
                    catch(NumberFormatException e){
                    }
                }
                else {
                    try {
                        Double.parseDouble(temp);
                        var1 = temp;
                        op = "/";
                        opSelected = true;
                    }
                    catch (NumberFormatException e) {
                    }
                }
            }
        });
        bpow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double result = 0.0;
                String temp = (String) textview.getText();
                if(!var1.isEmpty()){
                    try{
                        Double dub1 = Double.parseDouble(var1);
                        Double dub2 = Double.parseDouble(temp);
                        if(op.equals("+")) {
                            result = dub1 + dub2;
                            op = "^";
                        }
                        else if(op.equals("-")) {
                            result = dub1 - dub2;
                            op = "^";
                        }
                        else if(op.equals("*")) {
                            result = dub1 * dub2;
                            op = "^";
                        }
                        else if(op.equals("/")) {
                            result = dub1 / dub2;
                            op = "^";
                        }
                        else if(op.equals("^")) {
                            result = Math.pow(dub1, dub2);
                            op = "^";
                        }
                        else{
                            result = Math.pow(dub1, dub2);
                            op = "^";
                        }
                        textview.setText(String.valueOf(result));
                        var1 = String.valueOf(result);
                        resultGiven = true;
                    }
                    catch(NumberFormatException e){
                    }
                }
                else {
                    try {
                        Double.parseDouble(temp);
                        var1 = temp;
                        op = "^";
                        opSelected = true;
                    }
                    catch (NumberFormatException e) {
                    }
                }
            }
        });
        bequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = (String) textview.getText();
                if(!var1.isEmpty()){
                    Double dub1 = Double.parseDouble(var1);
                    Double dub2 = Double.parseDouble(temp);
                    if(op.equals("+")){
                        Double result = dub1 + dub2;
                        if((result == Math.floor(result)) && !Double.isInfinite(result) &&
                                (String.valueOf(result).length() <= 9)){
                            int intResult = result.intValue();
                            textview.setText(String.valueOf(intResult));
                            resultGiven = true;
                            var1 = "";
                        }
                        else if(String.valueOf(result).length() <= 9){
                            textview.setText(String.valueOf(result));
                            resultGiven = true;
                            var1 = "";
                        }
                        else{
                            textview.setText("Error");
                            resultGiven = true;
                            var1 = "";
                        }
                    }
                    if(op.equals("-")){
                        Double result = dub1 - dub2;
                        if((result == Math.floor(result)) && !Double.isInfinite(result) &&
                                (String.valueOf(result).length() <= 9)){
                            int intResult = result.intValue();
                            textview.setText(String.valueOf(intResult));
                            resultGiven = true;
                            var1 = "";
                        }
                        else if(String.valueOf(result).length() <= 9){
                            textview.setText(String.valueOf(result));
                            resultGiven = true;
                            var1 = "";
                        }
                        else{
                            textview.setText("Error");
                            resultGiven = true;
                            var1 = "";
                        }
                    }
                    if(op.equals("*")){
                        Double result = dub1 * dub2;
                        if((result == Math.floor(result)) && !Double.isInfinite(result) &&
                                (String.valueOf(result).length() <= 9)){
                            int intResult = result.intValue();
                            textview.setText(String.valueOf(intResult));
                            resultGiven = true;
                            var1 = "";
                        }
                        else if(String.valueOf(result).length() <= 9){
                            textview.setText(String.valueOf(result));
                            resultGiven = true;
                            var1 = "";
                        }
                        else{
                            textview.setText("Error");
                            resultGiven = true;
                            var1 = "";
                        }
                    }
                    if(op.equals("^")){
                        Double result = Math.pow(dub1, dub2);
                        if((result == Math.floor(result)) && !Double.isInfinite(result) &&
                                (String.valueOf(result).length() <= 9)){
                            int intResult = result.intValue();
                            textview.setText(String.valueOf(intResult));
                            resultGiven = true;
                            var1 = "";
                        }
                        else if(String.valueOf(result).length() <= 9){
                            textview.setText(String.valueOf(result));
                            resultGiven = true;
                            var1 = "";
                        }
                        else{
                            textview.setText("Error");
                            resultGiven = true;
                            var1 = "";
                        }
                    }
                    if(op.equals("/")){
                        if(dub2 != 0) {
                            Double result = dub1 / dub2;
                            if((result == Math.floor(result)) && !Double.isInfinite(result) &&
                                    (String.valueOf(result).length() <= 9)){
                                int intResult = result.intValue();
                                textview.setText(String.valueOf(intResult));
                                resultGiven = true;
                                var1 = "";
                            }
                            else if(String.valueOf(result).length() <= 9){
                                textview.setText(String.valueOf(result));
                                resultGiven = true;
                                var1 = "";
                            }
                            else{
                                textview.setText(String.valueOf(result));
                                resultGiven = true;
                                var1 = "";
                            }
                        }
                        else textview.setText("Div 0"); opSelected = true;
                        resultGiven = true;
                    }
                    op = "";
                }
            }
        });
        return rootView;
    }

}
