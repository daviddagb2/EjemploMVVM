package com.gonzalezblanchard.ejemplomvvm.model

class QuoteProvider {
    companion object{

        fun random(): QuoteModel{
            val position = (0..10).random()
            return quote[position]
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel("El que no sabe gozar de la ventura cuando le viene, no debe quejarse si se pasa.",
                "Miguel de Cervantes"),

            QuoteModel("Como no me he preocupado de nacer, no me preocupo de morir.",
                "Federico García Lorca"),

            QuoteModel("Si pequeña es la patria, uno grande la sueña.",
                "Ruben Darío"),

            QuoteModel("El cafe con leche es como el cafe pero con leche.",
                "Paulo Coelho"),

            QuoteModel("Locura es hacer lo mismo una y otra vez y esperar resultados diferentes.",
                "Albert Einstein"),

            QuoteModel("No importa lo lento que vayas mientras no te detengas.",
                "Confucio"),

            QuoteModel("La sencillez es la máxima sofisticación.",
                "Leonardo da Vinci"),

            QuoteModel("Su carencia de fe resulta molesta.",
                "Darth Vader"),

            QuoteModel("Cuando me haya ido, el último de los Jedi serás tú",
                "Yoda"),

            QuoteModel(
                "I don’t care if it works on your machine! We are not shipping your machine!",
                "Vidiu Platon"
            ),
            QuoteModel(
                "Measuring programming progress by lines of code is like measuring aircraft building progress by weight.",
                 "Bill Gates"
            ),
        )
    }
}