package be.bf.kotlin_bank.models.comptes

import be.bf.kotlin_bank.models.Titulaire

abstract class Compte (
    val numero: String,
    val titulaire: Titulaire,
    private var _solde: Double = 0.0
) {
    val solde: Double
        get() = _solde

    fun depot(montant: Double) {
        this += montant
    }

    open fun retrait(montant: Double) {
        this -= montant
    }

    operator fun plus(v: Double): Double = if (v >= 0) this.solde + v else this.solde
    operator fun minus(v: Double): Double = if (v >= 0) this.solde - v else this.solde

    operator fun plusAssign(v: Double) {
        this._solde = this + v
    }
    operator fun minusAssign(v: Double) {
        this._solde = this - v
    }
}