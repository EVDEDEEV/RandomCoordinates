package my.project.randomcoordinates.data.dataBase

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import my.project.randomcoordinates.data.models.CoordinationModel

@Dao
interface CoordinationDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(coordinationModel: CoordinationModel)
}