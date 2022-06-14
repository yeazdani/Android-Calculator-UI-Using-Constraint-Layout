package com.example.ammgolamyeazdani.calculator;

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ammgolamyeazdani.calculator.databinding.ActivityMainBinding
import java.util.*
import kotlin.collections.ArrayList as Lis

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            val buttonList = arrayListOf<TextView>(
                one, two, three, four, five, six, seven, eight, nine, dot, div,
                multi, sub, plus, clear, equals
            )
            for (index in 0 until buttonList .size) {
                buttonList[index].setOnClickListener(this@MainActivity)

            }
            backDelete.setOnClickListener(this@MainActivity)

        }

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.one -> {
                if (binding.display.text != "") {
                    binding.display.append("1")
                } else {
                    binding.display.setText("1")
                }
            }
            R.id.two -> {
                if (binding.display.getText() != "") {
                    binding.display.append("2")
                } else {
                    binding.display.setText("2")
                }
            }
            R.id.three -> {
                if (binding.display.getText() != "") {
                    binding.display.append("3")
                } else {
                    binding.display.setText("3")
                }
            }
            R.id.four -> {
                if (binding.display.getText() != "") {
                    binding.display.append("4")
                } else {
                    binding.display.setText("4")
                }
            }
            R.id.five -> {
                if (binding.display.getText() != "") {
                    binding.display.append("5")
                } else {
                    binding.display.setText("5")
                }
            }
            R.id.six -> {
                if (binding.display.getText() != "") {
                    binding.display.append("6")
                } else {
                    binding.display.setText("6")
                }
            }
            R.id.seven -> {
                if (binding.display.getText() != "") {
                    binding.display.append("7")
                } else {
                    binding.display.setText("7")
                }
            }
            R.id.eight -> {
                if (binding.display.getText() != "") {
                    binding.display.append("8")
                } else {
                    binding.display.setText("8")
                }
            }
            R.id.nine -> {
                if (binding.display.getText() != "") {
                    binding.display.append("9")
                } else {
                    binding.display.setText("9")
                }
            }
            R.id.zero -> {
                if (binding.display.getText() != "") {
                    binding.display.append("0")
                } else {
                    binding.display.setText("0")
                }
            }
            R.id.plus -> {
                if (binding.display.getText() != "") {
                    binding.display.append("+")
                } else {
                    binding.display.setText("+")
                }
            }
            R.id.div -> {
                if (binding.display.getText() != "") {
                    binding.display.append("%")
                } else {
                    binding.display.setText("%")
                }
            }
            R.id.multi -> {
                if (binding.display.getText() != "") {
                    binding.display.append("x")
                } else {
                    binding.display.setText("x")
                }
            }
            R.id.sub -> {
                if (binding.display.getText() != "") {
                    binding.display.append("-")
                } else {
                    binding.display.setText("-")
                }
            }
            R.id.clear -> {
                binding.display.setText(null)
            }
            R.id.equals -> {
                if (binding.display.getText() != "") {
                    calculate(binding.display.getText().toString())
                } else {
                    Toast.makeText(this, "Nothing to Calculate", Toast.LENGTH_SHORT).show()
                }
            }
            R.id.dot -> {
                if (binding.display.getText() != "") {
                    binding.display.append(".")
                } else {
                    binding.display.setText(".")
                }
            }
            R.id.backDelete -> {
                if (binding.display.getText() != "") {
                    val s: String = binding.display.getText().toString()
                    if (s.length > 0) {
                        binding.display.setText(s.substring(0, s.length - 1))
                    } else {
                        Toast.makeText(this, "Nothing to remove", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(this, "nothing to remove", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }

    private fun calculate(display: String) {
        Toast.makeText(this, display, Toast.LENGTH_SHORT).show()
    }

}
