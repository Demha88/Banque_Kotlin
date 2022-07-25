package be.bf.kotlin_bank.models

import be.bf.kotlin_bank.models.comptes.Compte

class Banque (
    val nom: String = "PicsouBank",
    private val comptes: MutableMap<String, Compte> = mutableMapOf()
) {

    operator fun get(numero: String): Compte? {
        if (numero !in comptes.keys) return null

        return comptes.get(numero)
    }
    operator fun set(numero: String, compte: Compte) {
        add(compte)
    }

    fun add(compte: Compte) {
        if (comptes.containsKey(compte.numero)) return

        comptes.put(compte.numero, compte)
    }
    fun remove(numero: String) {
        if (!comptes.containsKey(numero)) return

        comptes.remove(numero)
    }
}