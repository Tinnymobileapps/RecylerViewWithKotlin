package tinny.com.recylerviewwithkotlin
import android.content.Context
import android.content.Context.INPUT_METHOD_SERVICE
import android.content.Intent
import android.content.pm.PackageManager
import android.view.inputmethod.InputMethodManager


/**
 * Created by Rancore on 12/06/17.
 */
class LoadApps {

    companion object {

        private var loadApps: LoadApps? = null

        val lofAppsInstance: LoadApps
            get() {
                if (loadApps == null) {
                    loadApps = LoadApps()
                }
                return loadApps as LoadApps
            }
    }

    public fun loadApps(context: Context): ArrayList<AppPojo> {
        var manager: PackageManager = context.packageManager
        var apps: ArrayList<AppPojo> = ArrayList<AppPojo>()

        val i = Intent(Intent.ACTION_MAIN, null)
        i.addCategory(Intent.CATEGORY_LAUNCHER)

        val availableActivities = manager.queryIntentActivities(i, 0)
        for (ri in availableActivities) {
              val name = ri.loadLabel(manager);
              val packageName = ri.activityInfo.packageName;
              val image= ri.activityInfo.loadIcon(manager);
            val app = AppPojo(name.toString(),packageName,image)
            apps.add(app)
        }

        return apps
    }

}