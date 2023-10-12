package model;

public class MyGenericClass<T, T1> {

    T x;
    T1 y;
    public MyGenericClass(T x, T1 y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T1 getY() {
        return y;
    }

    public void setY(T1 y) {
        this.y = y;
    }
}
