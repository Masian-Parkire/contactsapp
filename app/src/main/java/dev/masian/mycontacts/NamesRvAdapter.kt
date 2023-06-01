package dev.masian.mycontacts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import dev.masian.mycontacts.databinding.ContactListItemBinding

class NamesRvAdapter(var contactLists: List<ContactData>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding= ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var contactt =contactLists[position]
//        holder.binding.ivAvatar.toString()
        holder.binding.tvName.text=contactt.displayName
        holder.binding.tvEmail.text=contactt.email
        holder.binding.tvNumber.text=contactt.number


    }

    override fun getItemCount(): Int {
        return  contactLists.size
    }
}




class ContactViewHolder(var binding: ContactListItemBinding):ViewHolder(binding.root){}