package by.epam.learn.order;

public class MutableType {
    private final Integer coreMutaType;

    public MutableType(Integer core) {
        this.coreMutaType = core;
    }

    public int getCoreMutaType() {
        return coreMutaType;
    }

    @Override
    public String toString() {
        return "MutableType{" +
                "coreMutaType=" + coreMutaType +
                '}';
    }
}
