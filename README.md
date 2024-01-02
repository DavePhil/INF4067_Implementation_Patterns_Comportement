# INF4067_Implementation_Patterns_Comportement
Implémentation des modèles de comportement (Design patterns) en Java


## A savoir:
Tous nos devoirs sont stockés sur le repository : https://github.com/DavePhil/INF4067_Implementation_Patterns_Comportements.
Pour les fichiers et les branches sous la forme **_1, ils présentent la première version des implémentations et ceux
sous la forme **_2 la seconde version. Chaque commit a une description (cliquer les 3 petits points pour
la lire).

Dans le dossier modèle (de la branche main), on aura un fichier pdf contenant tous les modèles UML pour chaque
version d'implémentation.
Le README de la branche main représente une description globale, et chaque sous branche a un
readme spécifique.

### Prérequis
Avoir l'environnement Java correctement installé (JDK, JRE). Si ce n'est pas le cas, veuillez
suivre les étapes d'installation indiquées sur le site donc le lien est le suivant:
https://www.java.com/fr/download/help/download_options_fr.html.

### Tests
Chaque branche représente une version d'implémentation et un module, l'exécution se fait simplement en téléchargeant
le module sur la branche et/ou en exécutant le main correspondant.
Pour exécuter:

1. Ouvrir le projet dans un terminal (Placer vous à la racine du projet)
2. Exécuter la commande `cd src` (Pour se placer dans le dossier contenant l'exécutable)
3. (Optional) verifier avec la commande `ls` si le fichier main.java est bien présent.
4. Exécuter la commande `javac Main.java`
5. Enfin exécuter la commande `java Main`

NB : Dans le pdf du dossier model, un résultat des différentes exécutions a été présenté.

## Introduction
Dans le cadre de l'unité d'enseignement INF4067 intitulé : UML et Design Patterns, il nous a été
demandé dans cette troisième partie du cours d'implémenter des modèles de comportement. Travail étant fait,
il sera question pour nous ici de présenter un résumé.

### 1. Template
Il permet de reporter dans des sous-classes certaines étapes de l’une des opérations d’un objet, ces
étapes étant alors décrites dans les sous classes. Son modèle génerique est formé de
deux classes : une classe abstraite qui introduit la méthode patron ainsi que la signature
des méthodes abstraites que le la méthode patron invoque et une classe concrète qui implémente
les méthodes abstraites utilisées par la méthode patron.

#### Template_1
Il s'agit de l'exemple du cours, ou on a un système de ventes de véhicules en lignes.
Le système gère des commandes venant du Cameroun et du Gabon. On se rend ainsi compte que
calcule le prix d'un article est dépendant de la TVA. Or la TVA est différente pour chaque
pays. Une solution avec deux classes disctinctes entraine une duplication du code. Nous utiliserons
donc le template pour résoudre ce problème.
L'implémentation se trouve sur la branche template_1 du dépôt git.


### 2. Strategy
C'est un patron qui permet d'adapter la façon de faire en fonction de la situation. Il le fait 
en définissant un ensemble d'implémentations d'un concept spécifique. Les participants de son
modèle générique sont : Le contexte qui est la classe définissant l'objet dont le comportement 
doit être modifié dynamiquement. La strategy qui est l'interface ou la classe abstraite qui définit
toutes les méthodes communes à tous les algorithmes pouvant être utilisés par l'objet de type Contexte.
Les ConcreteStrategy qui implémentent les méthodes de la strategy.

#### Strategy_1
Il s'agit de l'implémentation de l'exemple du cours d'une application de sauvegarde d'images. 
L'application doit compresser selon le format de l'image et appliquer des filtres. 
L'implémentation se trouve sur la branche strategy_1 du dépôt git.

