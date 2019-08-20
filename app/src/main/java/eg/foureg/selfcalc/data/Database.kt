package eg.foureg.selfcalc.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database (entities = [Pray::class], version = 1)
abstract class PraysDatabase : RoomDatabase() {
    abstract fun PrayDao() : PrayDao
}