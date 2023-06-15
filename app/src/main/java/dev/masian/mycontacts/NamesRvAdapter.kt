package dev.masian.mycontacts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.squareup.picasso.Picasso
import dev.masian.mycontacts.databinding.ContactListItemBinding
import jp.wasabeef.picasso.transformations.CropCircleTransformation as CropCircleTransformation1

class NamesRvAdapter(var contactLists: List<ContactData>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding= ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var contactt =contactLists[position]
        var binding=holder.binding
//        holder.binding.ivAvatar.toString()
        holder.binding.tvName.text=contactt.displayName
        holder.binding.tvEmail.text=contactt.email
        holder.binding.tvNumber.text=contactt.number
        Picasso
            .get()
            .load(contactt.avatar)
            .resize(80,80)
            .centerCrop()
            .transform(CropCircleTransformation1())
            .into(binding.ivAvatar)


    }

    override fun getItemCount(): Int {
        return  contactLists.size
    }
}




class ContactViewHolder(var binding: ContactListItemBinding):ViewHolder(binding.root){}