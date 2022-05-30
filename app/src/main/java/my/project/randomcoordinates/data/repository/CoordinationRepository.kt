package my.project.randomcoordinates.data.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import my.project.randomcoordinates.data.dataBase.CoordinationDAO
import my.project.randomcoordinates.data.models.CoordinationModel
import my.project.randomcoordinates.other.CoordinatesCalculation

class CoordinationRepository(private val coordinationDAO: CoordinationDAO)  {


    suspend fun insert(coordinationModel: CoordinationModel) {
        coordinationDAO.insert(coordinationModel)

    }
}






