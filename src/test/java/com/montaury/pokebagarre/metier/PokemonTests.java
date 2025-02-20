package com.montaury.pokebagarre.metier;

import com.montaury.pokebagarre.fixtures.ConstructeurDePokemon;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @brief Tests unitaires pour la classe Pokemon
 * @details Tests unitaires pour la classe Pokemon
 *
 */


class PokemonTests {


    @Test
    void pokemon1_vainqueur_par_attaque_superieur_sur_pokemon2(){

        // GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(10).avecDefense(10).construire();
        Pokemon pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(5).avecDefense(5).construire();


        //WHEN
        boolean result = pokemon1.estVainqueurContre(pokemon2);

        //THEN

        assertThat(result).isTrue();
    }

    @Test
    void pokemon1_vainqueur_par_attaque_egale_et_defense_superieur_sur_pokemon2(){

        //GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(10).avecDefense(10).construire();
        Pokemon pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(10).avecDefense(5).construire();
        //WHEN
        boolean result = pokemon1.estVainqueurContre(pokemon2);

        //THEN
        assertThat(result).isTrue();
    }

    @Test
    void pokemon_1_perdant_par_attaque_inferieur_sur_pokemon2(){
        //GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(5).avecDefense(5).construire();
        Pokemon pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(10).avecDefense(10).construire();

        //WHEN
        boolean result = pokemon1.estVainqueurContre(pokemon2);

        //THEN
        assertThat(result).isFalse();
    }

    @Test
    void pokemon_1_perdant_par_attaque_egale_et_defense_inferieur_sur_pokemon2(){
        //GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(10).avecDefense(5).construire();
        Pokemon pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(10).avecDefense(10).construire();
        //WHEN
        boolean result = pokemon1.estVainqueurContre(pokemon2);

        //THEN
        assertThat(result).isFalse();
    }

    @Test
    void pokemon1_vainqueur_par_attaque_egale_et_defense_egale_sur_pokemon2(){
        //GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(10).avecDefense(10).construire();
        Pokemon pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(10).avecDefense(10).construire();

        //WHEN
        boolean result = pokemon1.estVainqueurContre(pokemon2);

        //THEN
        assertThat(result).isTrue();
    }

    @Test
    void pokemon1_vainqueur_par_attaque_superieur_et_defense_inferieur_sur_pokemon2(){
        //GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(10).avecDefense(5).construire();
        Pokemon pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(5).avecDefense(10).construire();

        //WHEN
        boolean result = pokemon1.estVainqueurContre(pokemon2);

        //THEN
        assertThat(result).isTrue();
    }

}