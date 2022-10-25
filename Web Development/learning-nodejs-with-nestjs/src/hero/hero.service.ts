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
 }

