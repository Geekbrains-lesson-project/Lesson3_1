package geekbrains.lesson3_1gb.fruits;

public interface FruitStore<T extends Fruit> {
    void addFruit(T fruit);
}