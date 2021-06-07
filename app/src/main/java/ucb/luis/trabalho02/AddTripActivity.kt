package ucb.luis.trabalho02


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.datepicker.MaterialDatePicker
import kotlinx.android.synthetic.main.activity_add_trip.*

class AddTripActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_trip)

        var datePicker = MaterialDatePicker.Builder.datePicker()
        val finalDate = datePicker.setTitleText("Seleciona Data").build()
        date.setOnClickListener{
            finalDate.show(supportFragmentManager, "DATE_PICKER")
        }


    }
}