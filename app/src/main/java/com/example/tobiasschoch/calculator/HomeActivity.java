package com.example.tobiasschoch.calculator;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

public class HomeActivity extends Activity implements View.OnClickListener {

    private TextView tvExpression;
    private TextView tvResult;
    private TextView tvClear;
    private TextView tvOpen;
    private TextView tvNegative;
    private TextView tvDivide;
    private TextView tvSeven;
    private TextView tvEight;
    private TextView tvNine;
    private TextView tvMul;
    private TextView tvFour;
    private TextView tvFive;
    private TextView tvSix;
    private TextView tvMinus;
    private TextView tvOne;
    private TextView tvTwo;
    private TextView tvThree;
    private TextView tvPlus;
    private TextView tvDot;
    private TextView tvZero;
    private ImageView tvBack;
    private TextView tvEquals;

    String zahl11 = "";
    String zahl22 = "";
    double zahl1 = 0;
    double zahl2 = 0;
    double result = 0;
    char add = 'T';
    String zusammen = "";
    String test = "";
    int einfachso = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvExpression = findViewById(R.id.tvExpression);
        tvResult = findViewById(R.id.tvResult);
        tvClear = findViewById(R.id.tvClear);
        tvOpen = findViewById(R.id.tvOpen);
        tvNegative = findViewById(R.id.tvNegative);
        tvDivide = findViewById(R.id.tvDivide);
        tvSeven = findViewById(R.id.tvSeven);
        tvEight = findViewById(R.id.tvEight);
        tvNine = findViewById(R.id.tvNine);
        tvMul = findViewById(R.id.tvMul);
        tvFour = findViewById(R.id.tvFour);
        tvFive = findViewById(R.id.tvFive);
        tvSix = findViewById(R.id.tvSix);
        tvMinus = findViewById(R.id.tvMinus);
        tvOne = findViewById(R.id.tvOne);
        tvThree = findViewById(R.id.tvThree);
        tvPlus = findViewById(R.id.tvPlus);
        tvTwo = findViewById(R.id.tvTwo);
        tvDot = findViewById(R.id.tvDot);
        tvZero = findViewById(R.id.tvZero);
        tvBack = findViewById(R.id.tvBack);
        tvEquals = findViewById(R.id.tvEquals);

        tvEquals.setOnClickListener(this);
        tvClear.setOnClickListener(this);
        tvOpen.setOnClickListener(this);
        tvNegative.setOnClickListener(this);
        tvDivide.setOnClickListener(this);
        tvSeven.setOnClickListener(this);
        tvEight.setOnClickListener(this);
        tvNine.setOnClickListener(this);
        tvMul.setOnClickListener(this);
        tvFour.setOnClickListener(this);
        tvFive.setOnClickListener(this);
        tvSix.setOnClickListener(this);
        tvMinus.setOnClickListener(this);
        tvOne.setOnClickListener(this);
        tvThree.setOnClickListener(this);
        tvPlus.setOnClickListener(this);
        tvTwo.setOnClickListener(this);
        tvDot.setOnClickListener(this);
        tvZero.setOnClickListener(this);
        tvBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == tvOne) {
            switch (add) {
                case 'T':
                    zahl11 = zahl11 + "1";
                    tvExpression.setText(zahl11);
                    break;
                default:
                    zahl22 = zahl22 + "1";
                    tvExpression.setText(zusammen + zahl22);
            }
        } else if (view == tvTwo) {
            switch (add) {
                case 'T':
                    zahl11 = zahl11 + "2";
                    tvExpression.setText(zahl11);
                    break;
                default:
                    zahl22 = zahl22 + "2";
                    tvExpression.setText(zusammen + zahl22);
            }
        } else if (view == tvThree) {
            switch (add) {
                case 'T':
                    zahl11 = zahl11 + "3";
                    tvExpression.setText(zahl11);
                    break;
                default:
                    zahl22 = zahl22 + "3";
                    tvExpression.setText(zusammen + zahl22);
            }
        } else if (view == tvFour) {
            switch (add) {
                case 'T':
                    zahl11 = zahl11 + "4";
                    tvExpression.setText(zahl11);
                    break;
                default:
                    zahl22 = zahl22 + "4";
                    tvExpression.setText(zusammen + zahl22);
            }
        } else if (view == tvFive) {
            switch (add) {
                case 'T':
                    zahl11 = zahl11 + "5";
                    tvExpression.setText(zahl11);
                    break;
                default:
                    zahl22 = zahl22 + "5";
                    tvExpression.setText(zusammen + zahl22);
            }
        } else if (view == tvSix) {
            switch (add) {
                case 'T':
                    zahl11 = zahl11 + "6";
                    tvExpression.setText(zahl11);
                    break;
                default:
                    zahl22 = zahl22 + "6";
                    tvExpression.setText(zusammen + zahl22);
            }
        } else if (view == tvSeven) {
            switch (add) {
                case 'T':
                    zahl11 = zahl11 + "7";
                    tvExpression.setText(zahl11);
                    break;
                default:
                    zahl22 = zahl22 + "7";
                    tvExpression.setText(zusammen + zahl22);
            }
        } else if (view == tvEight) {
            switch (add) {
                case 'T':
                    zahl11 = zahl11 + "8";
                    tvExpression.setText(zahl11);
                    break;
                default:
                    zahl22 = zahl22 + "8";
                    tvExpression.setText(zusammen + zahl22);
            }
        } else if (view == tvNine) {
            switch (add) {
                case 'T':
                    zahl11 = zahl11 + "9";
                    tvExpression.setText(zahl11);
                    break;
                default:
                    zahl22 = zahl22 + "9";
                    tvExpression.setText(zusammen + zahl22);
            }
        } else if (view == tvZero && zahl11 != "0" && zahl22 != "0") {
            switch (add) {
                case 'T':
                    zahl11 = zahl11 + "0";
                    tvExpression.setText(zahl11);
                    break;
                default:
                    zahl22 = zahl22 + "0";
                    tvExpression.setText(zusammen + zahl22);
            }
        } else if (view == tvDot) {
            try {
                if (zahl11.substring(zahl11.length(), zahl11.length()) == "." || zahl22.substring(zahl22.length(), zahl22.length()) == ".") {
                    tvExpression.setText(zahl11);
                } else {
                    switch (add) {
                        case 'T':
                            zahl11 = zahl11 + ".";
                            tvExpression.setText(zahl11);
                            break;
                        default:
                            zahl22 = zahl22 + ".";
                            tvExpression.setText(zusammen + zahl22);
                    }
                }
            } catch (Exception e) {
                System.out.println("Fehler aufgetreten");
            }
        } else if (view == tvNegative) {
            if (zahl11 == "" && zahl22 == "") {
                zahl11 = "-";
                tvExpression.setText(zahl11);
            } else if (zahl11 == "-") {
                zahl11 = "";
                tvExpression.setText(zahl11);
            } else if (zusammen != "" && zahl22 == "") {
                zahl22 = "-";
                tvExpression.setText(zusammen + zahl22);
            } else if (zahl22 == "-") {
                zahl22 = "";
                tvExpression.setText(zusammen + zahl22);
            } else {
                einfachso = 0;
            }

        } else if (view == tvBack) {
            try {
                if (zahl22 == "" && zahl11 != "" && add == 'T') {
                    zahl11 = zahl11.substring(0, zahl11.length() - 1);
                    tvExpression.setText(zahl11);
                } else if (add != 'T' && zahl11 != "" && zahl22 == "") {
                    zusammen = zusammen.substring(0, zusammen.length() - 1);
                    add = 'T';
                    tvExpression.setText(zusammen);
                } else if (zahl22 != "" && zahl11 != "" && add != 'T') {
                    zahl22 = zahl22.substring(0, zahl22.length() - 1);
                    tvExpression.setText(zusammen + zahl22);
                }
            } catch (Exception e) {
                System.out.println("Fehler aufgetreten");
            }
        } else if (view == tvOpen) {
            int einfachso = 0;
        } else if (view == tvClear) {
            zahl1 = 0;
            zahl11 = "";
            zahl2 = 0;
            zahl22 = "";
            zusammen = "";
            result = 0;
            add = 'T';
            tvExpression.setText("");
            tvResult.setText("0");
        } else if (view == tvPlus) {
            try {
                if (zahl11 == "") {
                    tvResult.setText(0 + "");
                } else if (zahl11 != "") {
                    add = '+';
                    zahl1 = (Double.parseDouble(zahl11));
                    if (zahl1 == (int) zahl1) {
                        zahl1 = Double.parseDouble(zahl11);
                        zusammen = (int) zahl1 + "+";
                    } else {
                        zahl1 = Double.parseDouble(zahl11);
                        zusammen = zahl1 + "+";
                    }
                }
                tvExpression.setText(zusammen);
            } catch (Exception e) {
                System.out.println("Fehler aufgetreten");
            }
        } else if (view == tvMinus) {
            try {
                if (zahl11 == "") {
                    tvResult.setText(0 + "");
                } else if (zahl11 != "") {
                    add = '-';
                    zahl1 = (Double.parseDouble(zahl11));
                    if (zahl1 == (int) zahl1) {
                        zahl1 = Double.parseDouble(zahl11);
                        zusammen = (int) zahl1 + "-";
                    } else {
                        zahl1 = Double.parseDouble(zahl11);
                        zusammen = zahl1 + "-";
                    }
                }
                tvExpression.setText(zusammen);
            } catch (Exception e) {
                System.out.println("Fehler aufgetreten");
            }
        } else if (view == tvMul) {
            try {
                if (zahl11 == "") {
                    tvResult.setText(0 + "");
                } else if (zahl11 != "") {
                    add = '*';
                    zahl1 = (Double.parseDouble(zahl11));
                    if (zahl1 == (int) zahl1) {
                        zahl1 = Double.parseDouble(zahl11);
                        zusammen = (int) zahl1 + "*";
                    } else {
                        zahl1 = Double.parseDouble(zahl11);
                        zusammen = zahl1 + "*";
                    }
                }
                tvExpression.setText(zusammen);
            } catch (Exception e) {
                System.out.println("Fehler aufgetreten");
            }
        } else if (view == tvDivide) {
            try {
                if (zahl11 == "") {
                    tvResult.setText(0 + "");
                } else if (zahl11 != "") {
                    add = '/';
                    zahl1 = (Double.parseDouble(zahl11));
                    if (zahl1 == (int) zahl1) {
                        zahl1 = Double.parseDouble(zahl11);
                        zusammen = (int) zahl1 + "/";
                    } else {
                        zahl1 = Double.parseDouble(zahl11);
                        zusammen = zahl1 + "/";
                    }
                }
                tvExpression.setText(zusammen);
            } catch (Exception e) {
                System.out.println("Fehler aufgetreten");
            }
        } else if (view == tvEquals && add != 'T') {
            try {
                zahl2 = Double.parseDouble(zahl22);
                switch (add) {
                    case '+':
                        result = zahl1 + zahl2;
                        break;
                    case '-':
                        result = zahl1 - zahl2;
                        break;
                    case '*':
                        result = zahl1 * zahl2;
                        break;
                    case '/':
                        result = zahl1 / zahl2;
                        break;
                }

                if (result == (int) result) {
                    tvResult.setText((int) result + "");
                } else {
                    tvResult.setText(result + "");
                }

                zahl11 = String.valueOf(result);
                zahl1 = result;
                zahl2 = 0;
                add = 'T';
                zahl22 = "";
            } catch (Exception e) {
                System.out.println("Fehler aufgetreten");
            }
        } else if (view == tvEquals && add == 'T' && zahl22 == "") {
            try {
                if (zahl11 == "") {
                    tvResult.setText(0 + "");
                } else {
                    zahl1 = Double.parseDouble(zahl11);
                    if (zahl1 == (int) zahl1) {
                        result = zahl1;
                        tvResult.setText((int) result + "");

                    } else {
                        result = zahl1;
                        tvResult.setText(result + "");
                    }

                    zahl11 = String.valueOf(result);
                    add = 'T';
                    zahl2 = 0;
                    zahl22 = "";
                }
            } catch (Exception e) {
                System.out.println("Fehler aufgetreten");
            }
        }
    }
}
