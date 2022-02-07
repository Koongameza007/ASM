package com.example.asm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a = ""
        var b = 0
        var c = ""
        var d: Double = 0.0
        ButtonClear.setOnClickListener {
            Textnum.text = "0"
        }
        ButtonDelete.setOnClickListener {
            if (Textnum.text == "0" || Textnum.text.length.toString() == "1") {
                Textnum.text = "0"
            } else {
                Textnum.text = Textnum.text.toString().dropLast(1)
            }
        }
        Buttonmark.setOnClickListener {
            if (!Textnum.text.toString().contains(".")) {
                Textnum.text = Textnum.text.toString() + "."
            }
        }
        ButtonMod.setOnClickListener {
            c = "%"
            a = Textnum.text.toString()
            Textnum.setText("0")
        }
        ButtonDivision.setOnClickListener {
            c = "/"
            a = Textnum.text.toString()
            Textnum.setText("0")
        }
        ButtonMultiplication.setOnClickListener {
            c = "x"
            a = Textnum.text.toString()
            Textnum.setText("0")
        }
        ButtonMinus.setOnClickListener {
            c = "-"
            a = Textnum.text.toString()
            Textnum.setText("0")
        }
        ButtonPlus.setOnClickListener {
            c = "+"
            a = Textnum.text.toString()
            Textnum.setText("0")
        }
        button9.setOnClickListener {
            if (Textnum.text == "0") {
                Textnum.text = ""
                Textnum.text = Textnum.text.toString() + "9"
            } else {
                Textnum.text = Textnum.text.toString() + "9"
            }
        }
        button8.setOnClickListener {
            if (Textnum.text == "0") {
                Textnum.text = ""
                Textnum.text = Textnum.text.toString() + "8"
            } else {
                Textnum.text = Textnum.text.toString() + "8"
            }
        }
        button7.setOnClickListener {
            if (Textnum.text == "0") {
                Textnum.text = ""
                Textnum.text = Textnum.text.toString() + "7"
            } else {
                Textnum.text = Textnum.text.toString() + "7"
            }
        }
        button6.setOnClickListener {
            if (Textnum.text == "0") {
                Textnum.text = ""
                Textnum.text = Textnum.text.toString() + "6"
            } else {
                Textnum.text = Textnum.text.toString() + "6"
            }
        }
        button5.setOnClickListener {
            if (Textnum.text == "0") {
                Textnum.text = ""
                Textnum.text = Textnum.text.toString() + "5"
            } else {
                Textnum.text = Textnum.text.toString() + "5"
            }
        }
        button4.setOnClickListener {
            if (Textnum.text == "0") {
                Textnum.text = ""
                Textnum.text = Textnum.text.toString() + "4"
            } else {
                Textnum.text = Textnum.text.toString() + "4"
            }
        }
        button3.setOnClickListener {
            if (Textnum.text == "0") {
                Textnum.text = ""
                Textnum.text = Textnum.text.toString() + "3"
            } else {
                Textnum.text = Textnum.text.toString() + "3"
            }
        }
        button2.setOnClickListener {
            if (Textnum.text == "0") {
                Textnum.text = ""
                Textnum.text = Textnum.text.toString() + "2"
            } else {
                Textnum.text = Textnum.text.toString() + "2"
            }
        }
        button1.setOnClickListener {
            if (Textnum.text == "0") {
                Textnum.text = ""
                Textnum.text = Textnum.text.toString() + "1"
            } else {
                Textnum.text = Textnum.text.toString() + "1"
            }
        }
        button0.setOnClickListener {
            if (Textnum.text == "0") {
                Textnum.text = "0"
            } else {
                Textnum.text = Textnum.text.toString() + "0"
            }
        }
        ButtonEqual.setOnClickListener {
            if (c == "/") {
                d = (a.toString().toDouble() / Textnum.text.toString().toDouble())
                Textnum.setText(d.toString())
            } else if (c == "x") {
                d = (a.toString().toDouble() * Textnum.text.toString().toDouble())
                Textnum.setText(d.toString())
            } else if (c == "-") {
                d = (a.toString().toDouble() - Textnum.text.toString().toDouble())
                Textnum.setText(d.toString())
            } else if (c == "+") {
                d = (a.toString().toDouble() + Textnum.text.toString().toDouble())
                Textnum.setText(d.toString())
            } else if (c == "%") {
                d = (a.toString().toDouble() % Textnum.text.toString().toDouble())
                Textnum.setText(d.toString())
            }

        }
    }
}