package tinny.com.recylerviewwithkotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import tinny.com.recylerviewwithkotlin.R
import java.text.FieldPosition

/**
 * Created by Rancore on 15/06/17.
 */
class AppsAdapter(val list: ArrayList<AppPojo>) : RecyclerView.Adapter<AppViewHolder>() {


    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): AppViewHolder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.app_row,parent,false)
        return  AppViewHolder(view)
    }

    override fun onBindViewHolder(appViewHolder: AppViewHolder ,position: Int) {
        appViewHolder.bindData(list.get(position))
    }

}