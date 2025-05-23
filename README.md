# ARP3

http://localhost:8080/
edu.eci.cvds

# Comandos git
 - git init
 - git remote add origin https://github.com/NOMBRE_USUARIO/NOMBRE_PROYECTO.git
 - git add .
 - git commit -m "mensaje, lo que hiciste con el archivo"
 - git push "url repositorio"

# Comandos Maven
 - Mvn clean test jacoco:report

# Links
https://start.spring.io

# Mongo
spring.data.mongodb.uri= mongodb+srv://Yojhan:Yojhan15243@cluster0.slucqjy.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0

spring.data.mongodb.database=userdb




# Etiquetas
    @PathVariable int id, @RequestBody
    
    @RestController
    
    @RequestMapping("/inventory")
  
    @PostMapping("/products") addProduct

    @PutMapping("/products/{id}") updateProduct

    @DeleteMapping("/products/{id}") deleteProduct

    @GetMapping("/products") getAllProducts() 

npx create-react-app my-app

<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>

			<plugin>
				<groupId>org.jacoco</groupId>
				<artifactId>jacoco-maven-plugin</artifactId>
				<version>0.8.12</version>
				<executions>
					<execution>
						<goals>
							<goal>prepare-agent</goal>
						</goals>
					</execution>
					<execution>
						<id>report</id>
						<phase>test</phase>
						<goals>
							<goal>report</goal>
						</goals>
						<configuration>
							<excludes>
								<exclude>/configurators/</exclude>
							</excludes>
						</configuration>
					</execution>
					<execution>
						<id>jacoco-check</id>
						<goals>
							<goal>check</goal>
						</goals>
						<configuration>
							<rules>
								<rule>
									<element>PACKAGE</element>
									<limits>
										<limit>
											<counter>CLASS</counter>
											<value>COVEREDRATIO</value>
											<minimum>0.10</minimum><!--Porcentaje mínimo de cubrimiento para construir el proyecto-->
										</limit>
									</limits>
								</rule>
							</rules>
						</configuration>
					</execution>
				</executions>
			</plugin>

