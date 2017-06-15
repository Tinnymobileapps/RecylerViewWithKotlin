package tinny.com.recylerviewwithkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Space
import tinny.com.recylerviewwithkotlin.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recylcer: RecyclerView = findViewById(R.id.rcv) as RecyclerView;
        recylcer.layoutManager = GridLayoutManager(this,3)
        recylcer.addItemDecoration(SpacesItemDecoration(3,50,true))
        recylcer.adapter = AppsAdapter(LoadApps.lofAppsInstance.loadApps(this))
    }
}
