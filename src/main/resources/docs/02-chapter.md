# Bean configuration
* XML
* Annotations
* Java Bean Configuration
* Groovy Bean configuration

# Bean Scope

* **singleton** (default) : Returns only one instance for the rest of the cycle
* **prototype** : Returns a new instance every application request
* **request** : Returns a new instance every HTTP request
* **session** : Returns a new instance in every HTTP's session
* **globalSession** : Returns a single instance per global HTTP's session

> @Scope("globalSession")
> @Scope("request")

* [scopes documentation ](https://www.baeldung.com/spring-bean-scopes)


## Code demo

* **How can I get all the bean names ?** : com\afym\manual\ManualApplication.java
* **How can I get a been in my context ?** : com\afym\manual\ManualApplication.java
* **How can I get a been in my controller ?** : doc02\controller\UserController.java
* **How can I get a service in my controller ?** : doc02\controller\MathController.java


# Externalized configuration

* **Command line arguments**
* **JNDI** (Java Naming and Directory Interface) attributes / java:com/env
* **Java System properties** : System.getProperties()
* **OS environment variables**
* **Random values** : RandomValuePropertySource random.*
* properties file
* YAML file
* Specification with SpringApplication.setDefaultProperties


## Code demo

* **How can I map my values to a class ?** : doc02\controller\PropertiesController.java
* **How can I set the values from my properties ?** : doc02\ConfigurationMapping.java


* [properties documentation ](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html)

> In your IDE (IntellJ) We can provide arguments

> Run > Edit Configurations > ExternalConfigurationApplication

> Program arguments : --myProperties.override="From my command line, nice !"

# Profiles

* [profile documentation ](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-profiles.html)

* **Setting my profiles** : resources\application.properties
    * resources\application-development.properties
    * resources\application-production.properties
* **Profile in file using annotation** : doc02\AdiConnector.java

> In your IDE (IntellJ) We can provide arguments

> Run > Edit Configurations > ExternalConfigurationApplication

> Program arguments : --spring.profiles.active=production

# Auto configuration

* [auto configuration documentation ](https://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-auto-configuration.html)