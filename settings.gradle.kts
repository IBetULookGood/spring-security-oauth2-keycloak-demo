/*
 * This file was generated by the Gradle 'init' task.
 */

rootProject.name = "spring-security-oauth2-keycloak"
include(":oauth2-authorization-code-demo")
include(":oauth2-pkce-demo")
include(":microservice-1")
include(":oauth2-client-credentials-demo")
project(":microservice-1").projectDir = file("oauth2-client-credentials-demo/microservice-1")
