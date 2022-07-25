package be.bf.kotlin_bank.models

data class Titulaire(
    var nom: String,
    var prenom: String
) {
    constructor(): this("Ovyn", "Flavian") {}
}