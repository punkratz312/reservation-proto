package de.company.prototype.woodpecker.drivers.quarkus.web.boundary

import de.company.prototype.woodpecker.common.bce.boundary.FunctionalService
import de.company.prototype.woodpecker.drivers.adapters.submit.boundary.FindAllHawksResourceAdapter
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody

@ApplicationScoped
@Path("woodpeckers/findAllHawks")
class FindAllHawksResource @Inject constructor(
  private val resourceAdapter: FindAllHawksResourceAdapter
) : FunctionalService<Unit, Any> {

  @GET
  override fun serve(@RequestBody input: Unit): Any {
    return resourceAdapter.serve()
  }
}
