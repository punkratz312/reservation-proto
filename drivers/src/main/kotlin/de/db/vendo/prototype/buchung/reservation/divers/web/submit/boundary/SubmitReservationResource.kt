package de.db.vendo.prototype.buchung.reservation.divers.web.submit.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.FunctionalService
import de.db.vendo.prototype.buchung.reservation.divers.adapters.submit.boundary.SubmitReservationResourceAdapter
import de.db.vendo.prototype.buchung.reservation.divers.web.submit.boundary.control.entity.ReservationReq
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import jakarta.ws.rs.PUT
import jakarta.ws.rs.Path
import org.jboss.resteasy.reactive.ResponseStatus
import org.jboss.resteasy.reactive.RestResponse.StatusCode.NO_CONTENT
import java.util.*

@ApplicationScoped
@Path("submit")
class SubmitReservationResource : FunctionalService<ReservationReq, UUID> {

  @Inject
  @field: Default
  lateinit var resourceAdapter: SubmitReservationResourceAdapter

  @PUT
  @ResponseStatus(NO_CONTENT)
  override fun serve(reference: ReservationReq): UUID {
    return resourceAdapter.serve(reference.id.toString())
  }
}