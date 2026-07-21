package com.base.engine;

public class Vector2f {

    private float x;
    private float y;

    public Vector2f(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float length(){
        return (float)Math.sqrt(x*x + y*y );
    }

    public float dot(Vector2f vector){
        return x * vector.getX() + y * vector.getY();
    }

    public Vector2f normalize(){
        float lenght = length();
        x/= lenght;
        y/= lenght;

        return this;
    }

    public Vector2f rotate (float angle){
        double rad = Math.toRadians(angle);
        double cos = Math.cos(rad);
        double sin = Math.sin(rad);

        return new Vector2f((float)(x*cos - y*sin), (float)(x*sin + y*cos));
    }

    public Vector2f add(Vector2f vector){
        return new Vector2f(x + vector.getX(), y + vector.getY());
    }

    public Vector2f add(float vector){
        return new Vector2f(x + vector, y + vector);
    }

    public Vector2f sub(Vector2f vector){
        return new Vector2f(x - vector.getX(), y - vector.getY());
    }

    public Vector2f sub(float vector){
        return new Vector2f(x - vector, y - vector);
    }

    public Vector2f multiply(Vector2f vector){
        return new Vector2f(x * vector.getX(), y * vector.getY());
    }

    public Vector2f multiply(float vector){
        return new Vector2f(x * vector, y * vector);
    }

    public Vector2f divide(Vector2f vector){
        return new Vector2f(x / vector.getX(), y / vector.getY());
    }

    public Vector2f divide(float vector){
        return new Vector2f(x / vector, y / vector);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public String toString(){
        return "(" + x + " " + y + ")";
    }
}
