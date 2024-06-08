class Animal {

    //declaração das variaveis privadas
    #especie
    #nome
    #barulho

    //construtor da classe
    constructor(especie, nome, barulho) {
        this.#especie = especie
        this.#nome = nome
        this.#barulho = barulho
    }
    // getters e setters
    get especie() {
        return this.#especie
    }

    set especie(especie) {
        if (especie === "") {
            // lanca um erro
            throw new Error("parametro especi nao pode ser vazio")

        }

    }
    get nome() {
        if (nome === "") {
            // lanca um erro
            throw new Error("parametro nome nao pode ser vazio")


        }
        this.#nome = nome
    }
    get barulho() {
        return this.#barulho
    }
    set barulho(barulho) {
        this.#barulho = barulho
    }
    fazerBarulho() {
        //console com string template
        console.log(`${this.#nome} fazendo barulho:${this.#barulho}`)
    }

}