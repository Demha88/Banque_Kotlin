package be.bf.kotlin_bank.models

import java.time.LocalDate

data class Titulaire(
    var nom: String,
    var _prenom: String,
) {

    //ajout perso Titulaire
    var prenom: String = _prenom
    set(value) {
        if (value.isNotBlank()) {
            field = value;
        }
    }

    var dateNaissance: LocalDate?= null
    var ssin: String?= null
    constructor(nom: String, prenom:String, dateNaissance: LocalDate= LocalDate.now(), ssin: String):this(nom, prenom){
        this.dateNaissance= dateNaissance
        this.ssin=ssin
    }
    // fin ajout titulaire
    constructor(): this("Ovyn", "Flavian") {}

    override fun toString(): String {
        return "Titulaire(nom='$nom', _prenom='$_prenom', prenom='$prenom', dateNaissance=$dateNaissance, ssin=$ssin)"
    }


}

