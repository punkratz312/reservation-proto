package de.db.vendo.prototype.buchung.reservation.divers.web.confirm.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.Service
import de.db.vendo.prototype.buchung.reservation.divers.adapters.confirm.boundary.ConfirmReservationResourceAdapter
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import jakarta.ws.rs.PUT
import jakarta.ws.rs.Path
import jakarta.ws.rs.PathParam
import org.jboss.resteasy.reactive.ResponseStatus
import org.jboss.resteasy.reactive.RestResponse.StatusCode.NO_CONTENT
import java.util.*

@ApplicationScoped
@Path("confirm/{id}")
class ConfirmReservationResource : Service<UUID> {

  @Inject
  @field: Default
  lateinit var resourceAdapter: ConfirmReservationResourceAdapter

  @PUT
  @ResponseStatus(NO_CONTENT)
  override fun serve(@PathParam("id") id: UUID) {
    resourceAdapter.serve(UUID.randomUUID())
  }
}