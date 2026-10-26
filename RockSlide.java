import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

final class RockSlide extends PhysicalMove {
    public RockSlide() {
        super(Type.ROCK, 75, 90);
    }
    @Override
    protected void applyOppEffects(Pokemon target) {
        if (Math.random() <= 0.3) {
            Effect.flinch(target);
        }
    }
    @Override
    protected String describe() {
        return "использует Rock Slide";
    }
}