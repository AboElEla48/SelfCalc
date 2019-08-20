package eg.foureg.selfcalc.data

import android.arch.persistence.room.*

@Entity
data class Pray(
    @PrimaryKey val entryID : Int,
    @ColumnInfo(name = "date") val date : Long,
    @ColumnInfo(name = "pray_id") val prayID : Int,
    @ColumnInfo(name = "pray_name") val prayName : String,
    @ColumnInfo(name =  "status") val status : Boolean
)

interface PrayDao {
    @Query ("Select * from Pray")
    fun getAllPrays()

    @Query ("Select * from Pray where date = :dayDate")
    fun getPraysOfDay(dayDate : Long)

    @Insert
    fun insertPrays(vararg pray: Pray)

    @Delete
    fun deletePrays(vararg entryID: Int)
}