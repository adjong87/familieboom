## Inleiding

In de les hebben we het gehad over Maven en unitTesten. 

Iedere applicatie die we maken, willen we opleveren inclusief testen. Omdat dit een groot aantal bugs uit de applicatie kan halen, voordat de applicatie in productie gaat.

## Java

We gaan een applicatie maken om een familie boom te maken. Iedereen heeft familie, van sommige houden we heel veel en van sommige misschien wat minder. Maar hoe dan ook hebben we allemaal familie.
Voor deze applicatie hoeven we niet allerlei moeilijke opties toe te voegen. 

## Opdracht voorwaarden

In de uitgewerkte opdracht moet minimaal zitten:

- 1 `Person` 
- 1 `Pet` 
- alle methodes worden getest door een unittest

De `Person` moet de volgende attributen krijgen:

- name
- middleName
- lastName
- sex
- age
- mother
- father
- sibblings
- children
- pets

De `Pet` heeft minimaal de volgende attributen:

- name
- age
- species
- owner

De `Person` bevat daarnaast het volgende:

- constructor met name, lastname, age en sex
- constructor met name, middleName, lastname, age en sex
- getters & setters
- addParents methode
- addChild methode
- addPet methode
- addSibling methode
- getGrandChildren methode

De `Pet` bevat naast de attributen minimaal:

- een constructor met alle attributen op owner na
- getters & setters
- een methode om de owner toe te voegen

## Hieronder volgt het stappenplan, maar ik daag je graag uit om zelf een stappenplan te maken




## Stappenplan

1. Maak de benodigde klassen aan

2. Geef de klassen de juiste attributen

3. Maak de constructors aan binnen de klassen

4. Maak alle Getters & Setters

5. Schrijf de benodigde methodes in de juiste klassen

6. Voeg Maven toe aan het project

6. Schrijf voor alle methodes unittesten op de juiste locatie in de project structuur



## Moeilijkere vragen
Als je de moeilijkere vragen maakt, zorg dan dat deze ook getest worden!

1. Schrijf een methode om alle dieren van de kleinkinderen terug te geven van een persoon. 
2. Schrijf een methode om alle nichtjes terug te geven van een persoon.
3. Voeg een partner toe aan de `Person` implementeer deze partner door de gehele applicatie inclusief getter & setter en benodigde methodes
