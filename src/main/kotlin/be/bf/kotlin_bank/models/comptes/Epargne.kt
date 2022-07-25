package be.bf.kotlin_bank.models.comptes

import be.bf.kotlin_bank.models.Titulaire
import java.time.LocalDate
import java.time.LocalDateTime

class Epargne(
    numero: String,
    titulaire: Titulaire,
    solde: Double = 0.0
): Compte(numero, titulaire, solde) {
    var dateDernierRetrait = LocalDateTime.now()
        private set

    override fun retrait(montant: Double) {
        if (solde - montant <= 0) return

        super.retrait(montant)
        dateDernierRetrait = LocalDateTime.now()
    }
}