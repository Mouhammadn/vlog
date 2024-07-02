# On va Utiliser une image de base Java d'AdoptOpenJDK
FROM eclipse-temurin:15-jdk

# Définition du répertoire de travail
WORKDIR /app

# Copie du fichier JAR généré par Maven
COPY target/myapp-*.jar /app/myapp.jar

# Exposer le port de l'application
EXPOSE 8080

# Commande pour exécuter l'application
ENTRYPOINT ["java", "-jar", "/app/myapp.jar"]
