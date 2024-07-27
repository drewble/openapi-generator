/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (8.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
*/
package org.openapitools.api

import org.openapitools.model.User
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.http.server.reactive.ServerHttpRequest

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
interface UserApi {

    fun getDelegate(): UserApiDelegate = object: UserApiDelegate {}

    @Operation(
        tags = ["user",],
        summary = "Create user",
        operationId = "createUser",
        description = """This can only be done by the logged in user.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation")
        ],
        security = [ SecurityRequirement(name = "api_key") ]
    )
    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/user"],
            consumes = ["application/json"]
    )
    fun createUser(@Parameter(description = "Created user object", required = true) @Valid @RequestBody user: User,serverHttpRequest: ServerHttpRequest): ResponseEntity<Unit> {
        return getDelegate().createUser(user, serverHttpRequest)
    }

    @Operation(
        tags = ["user",],
        summary = "Creates list of users with given input array",
        operationId = "createUsersWithArrayInput",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation")
        ],
        security = [ SecurityRequirement(name = "api_key") ]
    )
    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/user/createWithArray"],
            consumes = ["application/json"]
    )
    fun createUsersWithArrayInput(@Parameter(description = "List of user object", required = true) @Valid @RequestBody user: kotlin.collections.List<User>,serverHttpRequest: ServerHttpRequest): ResponseEntity<Unit> {
        return getDelegate().createUsersWithArrayInput(user, serverHttpRequest)
    }

    @Operation(
        tags = ["user",],
        summary = "Creates list of users with given input array",
        operationId = "createUsersWithListInput",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation")
        ],
        security = [ SecurityRequirement(name = "api_key") ]
    )
    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/user/createWithList"],
            consumes = ["application/json"]
    )
    fun createUsersWithListInput(@Parameter(description = "List of user object", required = true) @Valid @RequestBody user: kotlin.collections.List<User>,serverHttpRequest: ServerHttpRequest): ResponseEntity<Unit> {
        return getDelegate().createUsersWithListInput(user, serverHttpRequest)
    }

    @Operation(
        tags = ["user",],
        summary = "Delete user",
        operationId = "deleteUser",
        description = """This can only be done by the logged in user.""",
        responses = [
            ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            ApiResponse(responseCode = "404", description = "User not found")
        ],
        security = [ SecurityRequirement(name = "api_key") ]
    )
    @RequestMapping(
            method = [RequestMethod.DELETE],
            value = ["/user/{username}"]
    )
    fun deleteUser(@Parameter(description = "The name that needs to be deleted", required = true) @PathVariable("username") username: kotlin.String,serverHttpRequest: ServerHttpRequest): ResponseEntity<Unit> {
        return getDelegate().deleteUser(username, serverHttpRequest)
    }

    @Operation(
        tags = ["user",],
        summary = "Get user by user name",
        operationId = "getUserByName",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = User::class))]),
            ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            ApiResponse(responseCode = "404", description = "User not found")
        ]
    )
    @RequestMapping(
            method = [RequestMethod.GET],
            value = ["/user/{username}"],
            produces = ["application/xml", "application/json"]
    )
    fun getUserByName(@Parameter(description = "The name that needs to be fetched. Use user1 for testing.", required = true) @PathVariable("username") username: kotlin.String,serverHttpRequest: ServerHttpRequest): ResponseEntity<User> {
        return getDelegate().getUserByName(username, serverHttpRequest)
    }

    @Operation(
        tags = ["user",],
        summary = "Logs user into the system",
        operationId = "loginUser",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = kotlin.String::class))]),
            ApiResponse(responseCode = "400", description = "Invalid username/password supplied")
        ]
    )
    @RequestMapping(
            method = [RequestMethod.GET],
            value = ["/user/login"],
            produces = ["application/xml", "application/json"]
    )
    fun loginUser(@NotNull @Pattern(regexp="^[a-zA-Z0-9]+[a-zA-Z0-9\\.\\-_]*[a-zA-Z0-9]+$") @Parameter(description = "The user name for login", required = true) @Valid @RequestParam(value = "username", required = true) username: kotlin.String,@NotNull @Parameter(description = "The password for login in clear text", required = true) @Valid @RequestParam(value = "password", required = true) password: kotlin.String,serverHttpRequest: ServerHttpRequest): ResponseEntity<kotlin.String> {
        return getDelegate().loginUser(username, password, serverHttpRequest)
    }

    @Operation(
        tags = ["user",],
        summary = "Logs out current logged in user session",
        operationId = "logoutUser",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation")
        ],
        security = [ SecurityRequirement(name = "api_key") ]
    )
    @RequestMapping(
            method = [RequestMethod.GET],
            value = ["/user/logout"]
    )
    fun logoutUser(serverHttpRequest: ServerHttpRequest): ResponseEntity<Unit> {
        return getDelegate().logoutUser(serverHttpRequest)
    }

    @Operation(
        tags = ["user",],
        summary = "Updated user",
        operationId = "updateUser",
        description = """This can only be done by the logged in user.""",
        responses = [
            ApiResponse(responseCode = "400", description = "Invalid user supplied"),
            ApiResponse(responseCode = "404", description = "User not found")
        ],
        security = [ SecurityRequirement(name = "api_key") ]
    )
    @RequestMapping(
            method = [RequestMethod.PUT],
            value = ["/user/{username}"],
            consumes = ["application/json"]
    )
    fun updateUser(@Parameter(description = "name that need to be deleted", required = true) @PathVariable("username") username: kotlin.String,@Parameter(description = "Updated user object", required = true) @Valid @RequestBody user: User,serverHttpRequest: ServerHttpRequest): ResponseEntity<Unit> {
        return getDelegate().updateUser(username, user, serverHttpRequest)
    }
}
