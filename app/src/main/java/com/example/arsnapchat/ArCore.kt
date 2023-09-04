
import android.content.Context
import com.google.ar.core.ArCoreApk


object ARCoreUtils {
    fun checkARCore(context: Context?): Boolean {
        val availability: ArCoreApk.Availability = ARCoreApk.getInstance().checkAvailability(context)
        return availability.isSupported()
    }
}
