package com.demo.login
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ViewPageAdapter() : RecyclerView.Adapter<ViewPageAdapter.PagerVH>(){

   inner class PagerVH(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun getItemViewType(position: Int): Int {
      if(position==0)
          return 0
      else
          return 1
    }

    override fun getItemCount(): Int = 2

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH {
        if (viewType == 0)  return PagerVH(LayoutInflater.from(parent.context).inflate(R.layout.login_tab_fragment, parent, false))
        else   return PagerVH(LayoutInflater.from(parent.context).inflate(R.layout.signup_tap_fragment, parent, false))
    }
    override fun onBindViewHolder(holder: PagerVH, position: Int) = holder.itemView.run {
       if(position == 0){
               LoginFragment()
       }
        if(position == 1){
            SignupFragment()
        }
    }

}







