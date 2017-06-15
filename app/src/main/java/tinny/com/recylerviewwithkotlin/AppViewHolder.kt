package tinny.com.recylerviewwithkotlin

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import tinny.com.recylerviewwithkotlin.R

/**
 * Created by Rancore on 15/06/17.
 */
class AppViewHolder (view:View): RecyclerView.ViewHolder(view){

    val appName:TextView = view.findViewById(R.id.txt_app_name) as TextView
    val appImage:ImageView = view.findViewById(R.id.app_img) as ImageView

    public fun bindData(appPojo: AppPojo) {
        appName.text = appPojo.appName
        appImage.setImageDrawable(appPojo.appImage)
    }
}