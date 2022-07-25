package be.bf.kotlin_bank.models.comptes

import be.bf.kotlin_bank.models.Titulaire

class Courant(
    numero: String,
    titulaire: Titulaire,
    solde: Double = 0.0,
    ligneCredit: Double = 0.0
): Compte(numero, titulaire, solde) {
    var ligneCredit: Double = ligneCredit
        private set(value) { field = if (value >= 0) value else 0.0 }

    override fun retrait(montant: Double) {
        if (solde - montant <= - ligneCredit) return

        super.retrait(montant)
    }
}