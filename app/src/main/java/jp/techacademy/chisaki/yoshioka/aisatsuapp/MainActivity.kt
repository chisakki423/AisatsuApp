package jp.techacademy.chisaki.yoshioka.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            showTimePickerDialog()
        }

    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener{view, hour, minute ->
                //Log.d("UI_PARTS","$hour:$minute")
                if(hour >= 2 && hour <=9){
                    Log.d("UI_PARTS","おはよう")
                    textView.text = "おはよう"
                }else if(hour >=10 && hour <= 17){
                    Log.d("UI_PARTS","こんにちは")
                    textView.text = "こんにちは"
                }else if(hour >= 18 || hour <=1){
                    Log.d("UI_PARTS","こんばんは")
                    textView.text = "こんばんは"
                }

            },
            13,0,true)
        timePickerDialog.show()
    }

}