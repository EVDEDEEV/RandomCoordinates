package my.project.randomcoordinates.data.models

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize
import java.util.*
import kotlin.random.Random


@Entity(tableName = "coordination_data_table")
data class CoordinationModel(

//    @ColumnInfo(name = "coordination_latitude")
    val latitude: Double = 0.0000,

//    @ColumnInfo(name = "coordination_longitude")
    val longitude: Double = 0.0000,
) {
    @PrimaryKey(autoGenerate = true)
//    @ColumnInfo(name = "coordination_id")
    var id: Int? = null
}