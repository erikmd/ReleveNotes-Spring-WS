# ReleveNotes-Spring-WS

Exemple de projet Spring-WS

## Comment créer le squelette d'un tel projet ?

Il suffirait d'utiliser les archetypes Maven suivants :

* `org.codehaus.mojo.archetypes:pom-root`
* `org.apache.maven.archetypes:maven-archetype-quickstart`
* `org.springframework.ws:spring-ws-archetype`

Soit en ligne de commande :

```bash
$ mvn archetype:generate \
  -DarchetypeGroupId=org.codehaus.mojo.archetypes \
  -DarchetypeArtifactId=pom-root \
  -DarchetypeVersion=1.1 \
  -DartifactId=nom-projet-principal
$ cd nom-projet-principal
$ mvn archetype:generate \
  -DarchetypeGroupId=org.apache.maven.archetypes \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DarchetypeVersion=1.1 \
  -DartifactId=nom-projet-metier
$ mvn archetype:generate \
  -DarchetypeGroupId=org.springframework.ws \
  -DarchetypeArtifactId=spring-ws-archetype \
  -DarchetypeVersion=2.1.4.RELEASE \
  -DartifactId=nom-projet-ws
```

en saisissant le même `groupId` chaque fois que Maven vous le demande,
ou en utilisant l'option `-DgroupId=...`

Puis en s'inspirant de ce projet, mettre à jour les dépendances Maven
dans les trois fichiers `pom.xml`, et créer dans le sous-dossier
approprié un squelette de test d'intégration du Web Service.

## Liens utiles

* <http://search.maven.org/>
* <http://docs.spring.io/spring-ws/site/reference/html/tutorial.html>
* <http://docs.spring.io/spring-ws/site/reference/html/server.html#server-endpoints>
