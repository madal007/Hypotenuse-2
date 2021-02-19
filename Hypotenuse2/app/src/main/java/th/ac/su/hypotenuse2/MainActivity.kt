package th.ac.su.hypotenuse2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val A_val = findViewById<EditText>(R.id.Avalue)
        val B_val = findViewById<EditText>(R.id.Bvalue)
        val Solve = findViewById<Button>(R.id.SolveButt)

        Solve.setOnClickListener(){

            var A:Double = A_val.text.toString().toDouble()
            var B:Double = B_val.text.toString().toDouble()
            var C: Double

            C = sqrt((A*A) + (B*B));

            var intent = Intent(this@MainActivity,MainActivity2::class.java)
            intent.putExtra("a",A.toString())
            intent.putExtra("b",B.toString())
            intent.putExtra("c",C.toString())
            startActivity(intent)

        }

    }
}