package com.king.mysimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Onclick for Button Add
        mBtnAdd.setOnClickListener {
            //Take the entered values and put them on variables
            var first_number = mEdtFnum.text.toString()
            var second_number = mEdtSnum.text.toString()

            if (first_number.isEmpty() || second_number.isEmpty()){
                //Display an error on mTvTitle
                mTvTitle.text = "Please fill all the inputs!!!"
            }else {
                var jibu = first_number.toDouble() + second_number.toDouble()

                mTvTitle.text = jibu.toString()
            }
        }

        //Onclick for Button subtract
        mBtnSubtract.setOnClickListener {

            //Take the entered values and put them on variables
            var first_number = mEdtFnum.text.toString()
            var second_number = mEdtSnum.text.toString()

            if (first_number.isEmpty() || second_number.isEmpty()){
                //Display an error on mTvTitle
                mTvTitle.text = "Please fill all the inputs!!!"
            }else{
                var jibu = first_number.toDouble() - second_number.toDouble()

                mTvTitle.text = jibu.toString()
            }
        }


        //Onclick for Button divide
        mBtnDivide.setOnClickListener {

            //Take the entered values and put them on variables
            var first_number = mEdtFnum.text.toString()
            var second_number = mEdtSnum.text.toString()

            if (first_number.isEmpty() || second_number.isEmpty()){
                //Display an error on mTvTitle
                mTvTitle.text = "Please fill all the inputs!!!"
            }else {
                var jibu = first_number.toDouble() / second_number.toDouble()

                mTvTitle.text = jibu.toString()
            }
        }

        //Onclick for Button multiply
        mBtnMultiply.setOnClickListener {
            //Take the entered values and put them on variables
            var first_number = mEdtFnum.text.toString()
            var second_number = mEdtSnum.text.toString()

            if (first_number.isEmpty() || second_number.isEmpty()){
                //Display an error on mTvTitle
                mTvTitle.text = "Please fill all the inputs!!!"
            }else {
                var jibu = first_number.toDouble() * second_number.toDouble()

                mTvTitle.text = jibu.toString()
            }
        }
    }
}
