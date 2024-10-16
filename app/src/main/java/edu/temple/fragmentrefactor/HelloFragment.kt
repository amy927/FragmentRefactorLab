package edu.temple.fragmentrefactor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class HelloFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val layout = inflater.inflate(R.layout.fragment_hello, container, false).apply {
            findViewById<Button>(R.id.nameChangeButton).setOnClickListener{
                val displayTextView = findViewById<TextView>(R.id.helloTextView)
                val nameEditText = findViewById<EditText>(R.id.nameEditText)
                val name = nameEditText.text

                displayTextView.text = if (name.isNotBlank()) {
                    "Hello, $name!"
                } else {
                    "Please enter your name"
                }
            }
        }

        val helloText = layout.findViewById<TextView>(R.id.helloTextView)

        return layout
    }
}