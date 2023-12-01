package com.example.pokedex

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Pokedex : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pokedex)

        val recyclerView = findViewById<RecyclerView>(R.id.rvPokemons)

        val pokemons = listOf(
            Pokemon(
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/017.png",
                15,
                "Pidgeotto",
                listOf(
                    PokemonType("Fire")
                )
            )
        )

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = PokemonAdapter(pokemons)
    }
}