package th.ac.su.hypotenuse2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val A_ans = findViewById<TextView>(R.id.ansa)
        val B_ans = findViewById<TextView>(R.id.ansb)
        val C_ans = findViewById<TextView>(R.id.ansc)
        val Okbutt = findViewById<Button>(R.id.OkButt)

        val a = intent.getStringExtra("a")
        A_ans.setText(a)
        val b = intent.getStringExtra("b")
        B_ans.setText(b)
        val c = intent.getStringExtra("c")
        C_ans.setText(c)

//        -------------------------------------------

        Okbutt.setOnClickListener{

            var intent = Intent()
            setResult(Activity.RESULT_OK,intent)
            finish()
        }
    }
}