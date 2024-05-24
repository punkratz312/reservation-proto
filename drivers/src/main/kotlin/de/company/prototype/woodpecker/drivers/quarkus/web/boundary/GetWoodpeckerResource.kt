//package de.company.prototype.woodpecker.drivers.quarkus.web.boundary
//
//import de.company.prototype.woodpecker.common.bce.boundary.FunctionalService
//import de.company.prototype.woodpecker.drivers.adapters.submit.boundary.SubmitReservationResourceAdapter
//import jakarta.enterprise.context.ApplicationScoped
//import jakarta.inject.Inject
//import jakarta.ws.rs.PUT
//import jakarta.ws.rs.Path
//import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody
//
//@ApplicationScoped
//@Path("submit")
//class GetWoodpeckerResource @Inject constructor(
//  private val resourceAdapter: SubmitReservationResourceAdapter
//) : FunctionalService<String, String> {
//
//  @PUT
//  override fun serve(@RequestBody input: String): String {
//    TODO("Provide the return value")
////    return resourceAdapter.serve(input).toString()
//  }
//}
