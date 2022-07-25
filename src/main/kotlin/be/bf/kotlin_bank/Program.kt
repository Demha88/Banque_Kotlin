package be.bf.kotlin_bank

import be.bf.kotlin_bank.models.Banque
import be.bf.kotlin_bank.models.Titulaire
import be.bf.kotlin_bank.models.comptes.Compte
import be.bf.kotlin_bank.models.comptes.Courant
import be.bf.kotlin_bank.models.comptes.Epargne
import java.time.LocalDate


fun main() {
    val banque = Banque(comptes = mutableMapOf(
        "BE12 1234 1234 1324" to Epargne("BE12 1234 1234 1234", Titulaire("Ovyn", "Flavian"), 100.0),
        "BE12 1234 1234 1325" to Epargne("BE12 1234 1234 1325", Titulaire("Ovyn", "Flavian"), 100.0),
        "BE12 1234 1234 1326" to Epargne("BE12 1234 1234 1326", Titulaire("Ovyn", "Flavian"), 100.0),
        "BE12 1234 1234 1327" to Epargne("BE12 1234 1234 1327", Titulaire("Ovyn", "Flavian"), 100.0),
        "BE12 1234 1234 1328" to Epargne("BE12 1234 1234 1328", Titulaire("Ovyn", "Flavian"), 100.0),
    ));

    val courant = Courant("BE12 1234 1234 1234", Titulaire("Ovyn", "Flavian"))
    courant += 25.0

    println(courant.solde)




}