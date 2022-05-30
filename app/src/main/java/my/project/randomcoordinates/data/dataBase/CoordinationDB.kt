package my.project.randomcoordinates.data.dataBase

import androidx.room.Database
import androidx.room.RoomDatabase
import my.project.randomcoordinates.data.models.CoordinationModel

@Database(entities = [CoordinationModel::class], version = 1, exportSchema = false)
abstract class CoordinationDB : RoomDatabase() {

    abstract fun coordinationDao(): CoordinationDAO
}