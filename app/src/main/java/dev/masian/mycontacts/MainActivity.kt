package dev.masian.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
    }


    fun displayContacts(){
        var contact1=ContactData("","Vallary Buraje","val@gmail.com","+254798675423")
        var contact2=ContactData("","Nyambura Wambui","nyambs@gmail.com","+254709876523")

        var contact3=ContactData("","Eunice Keletu","keletu@gmail.com","+254798765432")
        var contact4=ContactData("","Faith Kazungu","kazungu@gmail.com","+2547864533")
        var contact5=ContactData("","Akech Atong","akech@gmail.com","+254798765432")
        var contact6=ContactData("","Ndemo Vero","ndemo@gmail.com","+2547864533")
        var contact7=ContactData("","Clarine Antiba","antiba@gmail.com","+254798765432")
        var contact8=ContactData("","Susan Maina","maina@gmail.com","+2547864533")
        var contact9=ContactData("","Loice Kanini","kanini@gmail.com","+254798765432")
        var contact10=ContactData("","Sonia Wanjiku","wanjiku@gmail.com","+2547864533")
        var contact11=ContactData("","Christine Anne","anne@gmail.com","+254798765432")
        var contact12=ContactData("","Elizabeth Wambui","eliza@gmail.com","+2547864533")
        var contact13=ContactData("","Faith Ndunge","ndunge@gmail.com","+254798765432")
        var contact14=ContactData("","Juliet Olieng","olieng@gmail.com","+2547864533")
        var contact15=ContactData("","Purity Ndirangu","olieng@gmail.com","+2547864533")


        var contactLists= listOf<ContactData>(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,
        contact11,contact12,contact13,contact14,contact15)
          binding.rvContacts.layoutManager=LinearLayoutManager(this)
        var contactAdapter=NamesRvAdapter(contactLists)
        binding.rvContacts.adapter=contactAdapter

    }

}