* http://stackoverflow.com/questions/30417089/generating-swagger-ui-documentation-for-rest-api
* https://github.com/swagger-api/swagger-ui/issues/758
http://idratherbewriting.com/pubapis_swagger/

* http://localhost:8080/JerseyDemos/api/swagger.json
* Note: use one 1.5.8 version of swagger-jersey2-jaxrs
* https://github.com/swagger-api/swagger-core/wiki/Swagger-Core-Jersey-2.X-Project-Setup-1.5#using-swaggers-beanconfig
*

{
    "basePath": "/JerseyDemos",
    "host": "localhost:8080",
    "info": {
        "version": "1.0.2"
    },
    "paths": {
        "/message": {
            "get": {
                "operationId": "getMsg",
                "parameters": [],
                "responses": {
                    "200": {
                        "description": "successful operation",
                        "headers": {},
                        "schema": {
                            "type": "string"
                        }
                    }
                }
            }
        }
    },
    "schemes": [
        "http"
    ],
    "swagger": "2.0"
}

FOr the UI i copied over the dist folder in webapp from the swagger-UI....

java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate \
  -i /Users/hshah/Desktop/swagger.json \
  -l jaxrs \
  -o samples/server/petstore/jaxrs/jersey2

  harshil:webapps hshah$ rm -rf JerseyDemos
harshil:webapps hshah$ cp ~/git/Swagger-Jersey/target/JerseyDemos.war .
