package Порождающие.AbstractFactory;

public class ElfSquadronFactory extends SquadronFactory{


    @Override
    Mage createMage() {
        return new ElfMag();
    }

    @Override
    Archer createArcher() {
        return new ElfArcher();
    }

    @Override
    Warrior createWarrior() {
        return new ElfWarrior();
    }
}
