# TP3 bis : Classes et Objets (Playlist musicale)

### Objectifs

Même objectifs que le TP3, avec un autre contexte :

- Créer une classe et instancier un objet.
- Définir des attributs (propriétés).
- Implémenter des constructeurs (simples et surchargés).
- Définir des méthodes (comportement de l'objet).
- Redéfinir les méthodes standards equals() et toString().
- Utiliser des tableaux d'objets.

### Prérequis

- Cloner le projet sur votre poste dans le répertoire de votre choix
- Ouvrir le projet :
  * Sur l'écran d'accueil d'IntelliJ, cliquer sur **Open**
  * Sélectionner le dossier de votre projet qui a été copié depuis GitHub puis cliquer sur **OK**.
  * Le projet s'ouvre
  * Aller vérifier que le SDK est bien sélectionné dans **File > Project Structure** onglet **Project**

### Utilisation de GIT

- Créer une nouvelle branche **prenomNom**
- Faire **1 commit** par exercice
- Ouvrir une *pull request* sur github :
  - Aller sur votre projet sur GitHub
  - Cliquer sur **New Pull Request**,
  - Sélectionner base repository = **harf18/ECUE2-TP3**
  - Sélectionner compare = votre branche **prenomNom**
---

### Modalités du TP

- Utiliser la méthode *main()* de la classe **Exec** pour tester vos développements : création d'objets, appel de méthodes, etc. au rythme où vous le désirez, ce n'est pas précisé dans chaque exercice.
- Toutes les classes des exercices doivent être ajoutées au package **net.lecnam.ecue2.tp3bis**

> Si vous ne l'avez pas encore fait, pensez à créer une nouvelle branche **prenomNom**

### Exercice 1

- Créer une classe **Duree**.
- Attributs : une durée est composée de **minutes** et de **secondes** (choisissez le bon type).
- Ajouter un **constructeur** qui prend en paramètre les minutes et les secondes.
- Ajouter un second **constructeur** (surcharge) qui prend en paramètre un nombre total de secondes. Exemple : `new Duree(187)` donne 3 minutes et 7 secondes.
- Écrire une méthode **enSecondes()** qui retourne la durée totale en secondes.
- Écrire une méthode **ajouter(Duree d)** qui ajoute la durée passée en paramètre à la durée courante. Attention : 2:45 + 0:30 doit donner 3:15, pas 2:75 !
- Écrire une méthode **estPlusLongueQue(Duree d)** qui retourne vrai si la durée courante est plus longue que celle passée en paramètre.
- Redéfinir la méthode **equals(Object o)** pour tester l'égalité de deux durées.
- Redéfinir la méthode **toString()** pour qu'elle retourne la durée au format `3:07` (*aide : regardez du côté de String.format()*).

> Pensez à tester dans Exec en créant 2 durées, en les additionnant et en affichant le résultat
>
> Pensez à faire votre 1er commit !!

### Exercice 2

- Créer une classe **Morceau**.
- Attributs : un morceau possède un **titre**, un **artiste**, une **Duree** et un **nombre d'écoutes**.

> Pensez à faire un commit !!

### Exercice 3

Dans la classe **Morceau**, créer 2 constructeurs :

- Constructeur 1 : prend en paramètre le titre, l'artiste et une **Duree**.
- Constructeur 2 (surcharge) : prend en paramètre le titre, l'artiste, puis les minutes et les secondes.

Dans les deux cas, le nombre d'écoutes d'un nouveau morceau vaut 0.
On considère que les paramètres sont toujours corrects, **ne pas gérer les cas d'erreur**.

> Pensez à faire un commit !!

### Exercice 4

Dans la classe **Morceau** :

- Écrire une méthode **ecouter()** qui augmente de 1 le nombre d'écoutes du morceau.
- Écrire une méthode **estDe(String artiste)** qui retourne vrai si le morceau est de l'artiste passé en paramètre, sans tenir compte des majuscules/minuscules.

> Pensez à faire un commit !!

### Exercice 5

Dans la classe **Morceau** :

- Redéfinir la méthode **equals(Object)** : deux morceaux sont égaux s'ils ont le même titre et le même artiste.
- Redéfinir la méthode **toString()** pour qu'elle retourne une chaîne du type : `Bohemian Rhapsody - Queen (5:55) - 12 écoutes`

> Pensez à faire un commit !!

### Exercice 6

Créer une classe **Playlist**. Une playlist possède un **nom**, un tableau de 20 **Morceaux** (merci de bien utiliser un tableau même si vous connaissez les List) et une propriété qui indique le nombre de morceaux présents dans la playlist.

Ajouter un constructeur qui prend en paramètre le nom de la playlist.

> Pensez à faire un commit !!

### Exercice 7

Dans la classe **Playlist**, écrire une méthode **ajout(Morceau)** qui ajoute un morceau dans le premier indice libre du tableau.

La méthode retourne un booléen :
- **false** si la playlist est pleine ou si le morceau est déjà dans la playlist (pensez à réutiliser votre méthode equals()),
- **true** si le morceau a bien été ajouté.

> Pensez à faire un commit !!

### Exercice 8

Dans la classe **Playlist** :

- Écrire une méthode **retourneDureeTotale()** qui retourne la durée totale de la playlist sous forme d'un objet **Duree** (réutilisez vos méthodes !).
- Écrire une méthode **retourneNbMorceauxDe(String artiste)** qui retourne le nombre de morceaux d'un artiste dans la playlist.

> Pensez à faire un commit !!

### Exercice 9

Dans la classe **Playlist** :

- Écrire une méthode **retourneMorceauLePlusLong()**.
- Écrire une méthode **retourneMorceauLePlusEcoute()**.
- Écrire une méthode **ecouterTout()** qui écoute une fois chaque morceau de la playlist.

> Pensez à faire un commit !!

### Exercice 10

Effacer vos tests de la méthode **main()** de la classe **Exec** et :

- Instancier une Playlist
- Ajouter plusieurs morceaux, dont un en double (vérifier qu'il est refusé)
- Afficher la durée totale de la playlist
- Écouter certains morceaux plusieurs fois, puis toute la playlist
- Afficher le morceau le plus écouté et le morceau le plus long
- Afficher le nombre de morceaux d'un artiste

> Pensez à faire votre commit !!
> Pensez à faire un push (`git push origin prenomNom`)
> Si elle n'est pas déjà ouverte, ouvrez une pull request (branche **prenomNom** vers **master**) NE PAS LA FERMER/MERGER !

### Exercice 11 (bonus)

Dans la classe **Playlist**, écrire une méthode **supprimer(Morceau)** qui retire un morceau de la playlist. Décaler les morceaux suivants pour ne pas laisser de trou dans le tableau.

> Pensez à faire un commit !!

### Exercice 12 (bonus)

Dans la classe **Playlist**, écrire une méthode **melanger()** qui mélange aléatoirement l'ordre des morceaux (*aide : Math.random() et l'échange de deux cases du tableau*).

> Pensez à faire un commit !!

### Exercice 13 (bonus)

Sans utiliser l'héritage (pour ceux qui connaissent), créer une classe **Podcast** : un podcast a un titre, un animateur, un numéro d'épisode, une **Duree** et un nombre d'écoutes.

Modifier la classe **Playlist** pour qu'elle puisse contenir aussi bien des **Morceaux** que des **Podcasts**, dans un seul tableau (*aide : de quel type doit être le tableau ? regardez du côté de instanceof*).

Adapter **retourneDureeTotale()** pour qu'elle prenne en compte les podcasts.

**Question** : qu'avez-vous remarqué en écrivant ce code ? Répondez en commentaire dans la classe **Podcast**. Gardez votre réponse en tête pour le cours sur l'héritage…

> Pensez à faire un commit !!
