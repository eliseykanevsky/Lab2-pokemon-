import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

final class FurySwipes extends PhysicalMove {
    public FurySwipes() {
        super(Type.NORMAL, 18, 80, 0, 1);
    }
    @Override
    protected String describe() {
        return "использует Fury Swipes";
    }
}