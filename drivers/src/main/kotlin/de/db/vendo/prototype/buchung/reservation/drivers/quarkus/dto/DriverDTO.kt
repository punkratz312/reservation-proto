package de.db.vendo.prototype.buchung.reservation.drivers.quarkus.dto

import java.util.*

data class DriverDTO(val id: UUID, val status: String)
//data class DriverDTO(val id: UUID, val status: String) : PanacheEntity()