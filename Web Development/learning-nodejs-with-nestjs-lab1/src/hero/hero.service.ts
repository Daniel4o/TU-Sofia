import { Injectable } from '@nestjs/common';
import {Hero} from './hero.model';

@Injectable()
export class HeroService {
    marvelHeroes: Hero[] = [
        {name: "Spiderman", powers:["web"], universe: "Marvel"},
        {name: "Black Panther", powers:["strength"], universe: "Marvel"},
        {name: "Thor", powers:["thunder"], universe:"Marvel"}

    ];

    dcHeroes: Hero[] = [
        {name: "Batman", powers: ["billionare"], universe: "DC"},
        {name: "Flash", powers:["speed"], universe: "DC"},
        {name: "Aquaman", powers:["water"], universe: "DC"}
    ];

    getAllHeroes(): Hero[] {
   /*     const heroes = [];
       for(const marvelHero of this.marvelHeroes) {
        heroes.push(marvelHero);
       }
       for(const dcHero of this.dcHeroes) {
        heroes.push(dcHero);
       }
       return heroes; */

       // Alternative (EcmaScript 6: Spread operator)
       const heroes = [...this.marvelHeroes, ...this.dcHeroes];
       return heroes;
    }

    getHeroesByUniverse(universe:string): Hero[] {
     /*   const heroes = [...this.marvelHeroes, ...this.dcHeroes];
       const filteredHeroes = [];
       
       for(const hero of heroes) {
        if(hero.universe === universe) {
            filteredHeroes.push(hero);
        }
       }
       return filteredHeroes; */

       // Alternative (EcmaScript 6: Filter function)
       const heroes = [...this.marvelHeroes, ...this.dcHeroes].filter(
        hero => hero.universe.toLowerCase() === universe
       );
       return heroes;
    }

    getFilteredHeroes(filters): Hero[] {

		const heroes = [...this.marvelHeroes, ...this.dcHeroes].filter((hero) => {
            // setting the the boolean true by default
            let isUniverseIncluded = true;
            let isPowersIncluded = true;
            // check if universe is presented in query params, if it exists on database as a param and return true or false
            if(filters.universe) {
                isUniverseIncluded = hero.universe.toLocaleLowerCase() === filters.universe.toLocaleLowerCase();
            }
            // check if powers is presented in query params, if it exists on database as a param and return true or false
            if(filters.powers) {
                isPowersIncluded = hero.powers.some(power => filters.powers.split(",")
                .map(power => power.toLocaleLowerCase())
                .includes(power.toLocaleLowerCase()));
            }

            //if both are presented as params and exists on database
            // or if either universe or powers is presented show result
            return isUniverseIncluded && isPowersIncluded; 
		});

		return heroes;
	}

}

