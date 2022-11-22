import { Controller, Get, Param, Query, Req } from '@nestjs/common';
import { HeroService } from './hero.service';

@Controller("hero")
export class HeroController {
    constructor(private heroService: HeroService) {};

    @Get()
    getHeroes() {
        return this.heroService.getAllHeroes;
    }

    @Get('filters')
    getFilteredHeroes(@Query() params) {
        return this.heroService.getFilteredHeroes(params);
    }
    
    @Get(':universe')
    getHeroesByUniverse(@Param('universe') universe: string) {
        return this.heroService.getHeroesByUniverse(universe.toLowerCase())
    }

}

