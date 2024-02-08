package de.db.vendo.prototype.buchung.reservation.divers.web.submit.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.FunctionalService
import de.db.vendo.prototype.buchung.reservation.divers.adapters.submit.boundary.SubmitReservationResourceAdapter
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import jakarta.ws.rs.PUT
import jakarta.ws.rs.Path
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody

@ApplicationScoped
@Path("submit")
class SubmitReservationResource : FunctionalService<String, String> {

  @Inject
  @field: Default
  lateinit var resourceAdapter: SubmitReservationResourceAdapter

  @PUT
  override fun serve(@RequestBody input: String): String {
    return resourceAdapter.serve(input).toString()
  }
}