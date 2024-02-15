package de.db.vendo.prototype.buchung.reservation.drivers.web.confirm.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.Service
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.confirm.boundary.ConfirmReservationResourceAdapter
import de.db.vendo.prototype.buchung.reservation.drivers.dto.DriverDTO
import de.db.vendo.prototype.buchung.reservation.drivers.dto.mapper.DriverDTOMapper
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import jakarta.ws.rs.PUT
import jakarta.ws.rs.Path
import jakarta.ws.rs.PathParam
import org.jboss.resteasy.reactive.ResponseStatus
import org.jboss.resteasy.reactive.RestResponse.StatusCode.NO_CONTENT

@ApplicationScoped
@Path("confirm/{id}")
class ConfirmReservationResource @Inject constructor(
  private val resourceAdapter: ConfirmReservationResourceAdapter,
  private val mapper: DriverDTOMapper
) : Service<DriverDTO> {

  @PUT
  @ResponseStatus(NO_CONTENT)
  override fun serve(@PathParam("id") input: DriverDTO) {
    resourceAdapter.serve(mapper.toDTO(input))
  }
}
