package com.bignerdranch.android.criminalintent

import android.app.Dialog
import android.app.TimePickerDialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import java.sql.Time
import java.util.Calendar

class TimePickerFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val time = Calendar.getInstance()
        val initialHour = time.get(Calendar.HOUR)
        val initialMinutes = time.get(Calendar.MINUTE)
        return TimePickerDialog(
            requireContext(),
            null,
            initialHour,
            initialMinutes,
            false
        )
    }
}