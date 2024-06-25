# Utiliser une image de base Java
FROM openjdk:15-jdk-alpine

# Définir le répertoire de travail
WORKDIR /app

# Copier le fichier JAR généré par Maven
COPY target/myapp-*.jar /app/myapp.jar

# Exposer le port de l'application
EXPOSE 8080

# Commande pour exécuter l'application
ENTRYPOINT ["java", "-jar", "/app/myapp.jar"]
