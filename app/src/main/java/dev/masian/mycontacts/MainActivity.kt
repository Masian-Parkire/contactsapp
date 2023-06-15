package dev.masian.mycontacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import dev.masian.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContacts()

        binding.ivplussy.setOnClickListener {
            val intent=Intent(this,AddActivity::class.java)
            startActivity(intent)
        }


    }


    fun displayContacts(){
        var contact1=ContactData("https://images.unsplash.com/photo-1496203695688-3b8985780d6a?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTh8fHByb2ZpbGUlMjBwaWN0dXJlcyUyMG9mJTIwYmxhcWNrJTIwcGVvcGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60","Vallary Buraje","val@gmail.com","+254798675423")
        var contact2=ContactData("https://images.unsplash.com/photo-1535295972055-1c762f4483e5?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80","Nyambura Wambui","nyambs@gmail.com","+254709876523")

        var contact3=ContactData("https://images.unsplash.com/photo-1526413232644-8a40f03cc03b?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8cHJvZmlsZSUyMHBpY3R1cmVzJTIwb2YlMjBibGFxY2slMjBwZW9wbGV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60","Eunice Keletu","keletu@gmail.com","+254798765432")
        var contact4=ContactData("https://images.unsplash.com/photo-1492106087820-71f1a00d2b11?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fHByb2ZpbGUlMjBwaWN0dXJlcyUyMG9mJTIwYmxhcWNrJTIwcGVvcGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60","Faith Kazungu","kazungu@gmail.com","+2547864533")
        var contact5=ContactData("https://images.unsplash.com/photo-1589156280159-27698a70f29e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60","Akech Atong","akech@gmail.com","+254798765432")
        var contact6=ContactData("https://images.unsplash.com/photo-1529245019870-59b249281fd3?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60","Ndemo Vero","ndemo@gmail.com","+2547864533")
        var contact7=ContactData("https://images.unsplash.com/photo-1531384441138-2736e62e0919?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80","Clarine Antiba","antiba@gmail.com","+254798765432")
        var contact8=ContactData("https://images.unsplash.com/photo-1539701938214-0d9736e1c16b?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTd8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60","Susan Maina","maina@gmail.com","+2547864533")
        var contact9=ContactData("https://images.unsplash.com/photo-1523450001312-faa4e2e37f0f?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjF8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60","Loice Kanini","kanini@gmail.com","+254798765432")
        var contact10=ContactData("https://images.unsplash.com/photo-1508970707-f6426fb47503?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjR8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60","Sonia Wanjiku","wanjiku@gmail.com","+2547864533")
        var contact11=ContactData("https://images.unsplash.com/photo-1550332781-aecd27f7434f?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mjd8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60","Christine Anne","anne@gmail.com","+254798765432")
        var contact12=ContactData("https://images.unsplash.com/photo-1583994009785-37ec30bf9342?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=388&q=80","Elizabeth Wambui","eliza@gmail.com","+2547864533")
        var contact13=ContactData("https://images.unsplash.com/photo-1589156229687-496a31ad1d1f?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=386&q=80","Faith Ndunge","ndunge@gmail.com","+254798765432")
        var contact14=ContactData("https://images.unsplash.com/photo-1589156191108-c762ff4b96ab?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mjh8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60","Juliet Olieng","olieng@gmail.com","+2547864533")
        var contact15=ContactData("https://images.unsplash.com/photo-1548259483-798906ada6bc?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mzl8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60","Purity Ndirangu","olieng@gmail.com","+2547864533")


        var contactLists= listOf<ContactData>(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,
        contact11,contact12,contact13,contact14,contact15)
          binding.rvContacts.layoutManager=LinearLayoutManager(this)
        var contactAdapter=NamesRvAdapter(contactLists)
        binding.rvContacts.adapter=contactAdapter

    }




}