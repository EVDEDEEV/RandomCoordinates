package my.project.randomcoordinates.other

import android.location.Geocoder
import java.util.*
import kotlin.random.Random

class CoordinatesCalculation {

    private val randLatValue: Double = Random.nextDouble(-90.0, 90.0)
    private val randLatValueRounded = String.format(Locale.US, "%.4f", randLatValue)
    val latitude = randLatValueRounded.toDouble()

    private val randLonValue: Double = Random.nextDouble(-180.0, 180.0)
    private val randLonValueRounded = String.format(Locale.US, "%.4f", randLonValue)
    val longitude = randLonValueRounded.toDouble()

    fun checkLatVal(): String {
        val lat = if (randLatValueRounded.contains("-")) {
            randLatValueRounded.replace("-", "S")
        } else {
            "N$randLatValueRounded"
        }
        return lat
    }

    private fun checkLonVal(): String {
        val lon = if (randLonValueRounded.contains("-")) {
            randLonValueRounded.replace("-", "W")
        } else {
            "E$randLonValueRounded"
        }
        return lon
    }

    val latLong = listOf(latitude, longitude)

    private val coordinatesList: MutableList<List<Double>> = mutableListOf()

    fun addCoordinates(): MutableList<List<Double>> {
        val randLatValue: Double = Random.nextDouble(-90.0, 90.0)
        val randLatValueRounded = String.format(Locale.US, "%.4f", randLatValue)
        val lat = randLatValueRounded.toDouble()

        val randLonValue: Double = Random.nextDouble(-180.0, 180.0)
        val randLonValueRounded = String.format(Locale.US, "%.4f", randLonValue)
        val lon = randLonValueRounded.toDouble()

        coordinatesList.add(listOf(lat, lon))
        return coordinatesList
    }
}

