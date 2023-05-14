package com.example.whiteproject


import android.R
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.whiteproject.databinding.ActivityScheduleBinding
import java.util.*


class Schedule : AppCompatActivity() {
    private lateinit var binding: ActivityScheduleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScheduleBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.datebtn.setOnClickListener {
            val c = Calendar.getInstance()
            val day = c.get(Calendar.DAY_OF_MONTH)
            val month = c.get(Calendar.MONTH)
            val year = c.get(Calendar.YEAR)
            val myDatePicker =
                DatePickerDialog(this,R.style.ThemeOverlay, DatePickerDialog.OnDateSetListener { DatePicker,
                                                                                                                                               Year, Month, Day ->
                    binding.dateText.text = "$Day/ ${Month + 1} /$Year"
                }, year, month, day)
            myDatePicker.show()


        }
        binding.timebtn.setOnClickListener {
            val c = Calendar.getInstance()
            val hour = c.get(Calendar.HOUR_OF_DAY)
            val minutes = c.get(Calendar.MINUTE)
            val myTimePicker =
                TimePickerDialog(this, TimePickerDialog.OnTimeSetListener { TimePicker, hourOfDay, minute ->
                    binding.timetext.text = "$hourOfDay :  $minute"
                }, hour, minutes, true)

            myTimePicker.show()

        }


    }

}