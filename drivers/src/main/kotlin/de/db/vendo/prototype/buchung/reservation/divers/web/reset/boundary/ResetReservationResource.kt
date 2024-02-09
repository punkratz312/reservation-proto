package de.db.vendo.prototype.buchung.reservation.divers.web.reset.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.Service
import de.db.vendo.prototype.buchung.reservation.divers.adapters.reset.boundary.ResetReservationResourceAdapter
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import jakarta.ws.rs.PUT
import jakarta.ws.rs.Path
import jakarta.ws.rs.PathParam
import org.jboss.resteasy.reactive.ResponseStatus
import org.jboss.resteasy.reactive.RestResponse
import java.util.*

@ApplicationScoped
@Path("reset/{id}")
class ResetReservationResource : Service<UUID> {

  @Inject
  @field: Default
  lateinit var resourceAdapter: ResetReservationResourceAdapter

  @PUT
  @ResponseStatus(RestResponse.StatusCode.NO_CONTENT)
  override fun serve(@PathParam("id") input: UUID) {
    resourceAdapter.serve(input)
  }
}