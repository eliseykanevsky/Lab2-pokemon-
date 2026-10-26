import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

final class Flamethrower extends SpecialMove {
    public Flamethrower() {
        super(Type.FIRE, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon target) {
        if (Math.random() <= 0.1) {
            Effect.burn(target);
        }
    }
    @Override
    protected String describe() {
        return "использует Flamethrower";
    }
}