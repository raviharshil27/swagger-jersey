package com.howtodoinjava.jersey;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * http://localhost:8080/JerseyDemos/api/swagger.json
 * Note: use one 1.5.8 version of swagger-jersey2-jaxrs
 * https://github.com/swagger-api/swagger-core/wiki/Swagger-Core-Jersey-2.X-Project-Setup-1.5#using-swaggers-beanconfig
 * http://localhost:8080/JerseyDemos/index.html#!/default/getMsg
 *
 * Created by hshah on 11/17/16.
 */

@Path("/message")
//             @Api(value="message", description="Sample hello world application")
public class JerseyService {

  /**
   * This will be generated by the java Doc.
   * @param id
   * @return
   */
  @GET
  @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM})
  @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM})
//    @ApiOperation(value="just to test the sample api")
  public String getMsg(@QueryParam("id") String id) {
    return "Hello World !! - Jersey 2";
  }
}
