package de.db.vendo.prototype.buchung.reservation.drivers.quarkus.web.boundary.control.entity

import io.smallrye.common.constraint.NotNull
import jakarta.validation.constraints.Size
import java.util.*

data class ReservationReq(
  @field:NotNull
  val id: UUID,

  @field:NotNull
  @field:Size(min = 1, max = 36)
  val trainJourneyKey: String,

  @field:NotNull
  @field:Size(min = 1, max = 30)
  val trainNumber: String,

  val tariffCode: Optional<Int>
)

