package br.com.philippesis.databindingexaple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import br.com.philippesis.databindingexaple.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this,
            R.layout.activity_main)

        val user = User("Roger Philippe", 34)
        binding.setVariable(BR.user, user)
        binding.executePendingBindings()

    }
}
