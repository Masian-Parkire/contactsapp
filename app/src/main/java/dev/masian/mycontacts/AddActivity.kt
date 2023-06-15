package dev.masian.mycontacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import dev.masian.mycontacts.databinding.ActivityAddBinding

class AddActivity : AppCompatActivity() {
    lateinit var binding: ActivityAddBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    override fun onResume() {
        super.onResume()
        binding.tvAddContact.setOnClickListener {
            val intent =Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        validateSignUp()
        clearErrorOnType()
    }

    fun validateSignUp() {
        val firstName = binding.etFirstName.text.toString()
        val lastName = binding.etLastName.text.toString()
        val phoneno = binding.etPhoneNumber.text.toString()
        val email = binding.etEmail.text.toString()
        var error = false

        if (firstName.isBlank()) {
            binding.tilFirstName.error = "First name is required"
            error = true
        } else {
            binding.tilFirstName.error = null
        }
        if (lastName.isBlank()) {
            binding.tillLastName.error = "Last name is required"
            error = true
        } else {
            binding.tillLastName.error = null
        }
        if (email.isBlank()) {
            binding.tillEmail.error = "Email is required"
            error = true
        } else {
            binding.tillEmail.error = null
        }
        if (phoneno.isBlank()) {
            binding.tilPhoneNumber.error = "Phone Number is required"
            error = true
        } else {
            binding.tilPhoneNumber.error = null
        }

        if (!error) {
            Toast.makeText(this, "$firstName $lastName $email", Toast.LENGTH_LONG).show()
        }
    }

    fun clearErrorOnType() {
        binding.tilFirstName.editText?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilFirstName.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })

        binding.tillLastName.editText?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tillLastName.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })

        binding.tilPhoneNumber.editText?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilPhoneNumber.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })

        binding.tillEmail.editText?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tillEmail.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }

}
