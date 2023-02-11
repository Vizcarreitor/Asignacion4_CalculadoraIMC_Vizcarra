package leobardo.vizcarra.asignacion4_calculadoraimc_vizcarra

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val height: EditText = findViewById(R.id.height)
        val weight: EditText = findViewById(R.id.weight)
        val btnCalcular: Button = findViewById(R.id.btnCalcular)
        val imc: TextView = findViewById(R.id.imc)
        val range: TextView = findViewById(R.id.range)

        btnCalcular.setOnClickListener {
            val weightVar: Double = weight.getText().toString().toDouble()
            val heightVar: Double = height.getText().toString().toDouble()

            val imcVal = calcular(heightVar, weightVar)

            imc.setText(imcVal.toString())
        }

    }

    fun calcular(height: Double, weight: Double): Double{
        return (weight / (height*height))
    }
}