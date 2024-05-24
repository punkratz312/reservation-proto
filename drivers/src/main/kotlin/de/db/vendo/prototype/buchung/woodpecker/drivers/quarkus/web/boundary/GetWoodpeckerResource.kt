package de.db.vendo.prototype.buchung.woodpecker.drivers.quarkus.web.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.FunctionalService
import de.db.vendo.prototype.buchung.woodpecker.drivers.adapters.submit.boundary.SubmitReservationResourceAdapter
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import jakarta.ws.rs.PUT
import jakarta.ws.rs.Path
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody

@ApplicationScoped
@Path("submit")
class GetWoodpeckerResource @Inject constructor(
  private val resourceAdapter: SubmitReservationResourceAdapter
) : FunctionalService<String, String> {

  @PUT
  override fun serve(@RequestBody input: String): String {
    TODO("Provide the return value")
//    return resourceAdapter.serve(input).toString()
  }
}
