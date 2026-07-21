package com.base.engine;

public class Vector3f {

    private float x;
    private float y;
    private float z;

    public Vector3f(float x,float y, float z) {
        this.x = x;
        this.z = z;
        this.y = y;
    }

    public float length(){
        return (float)Math.sqrt(x*x + y*y + z*z );

    }

    public float dot(Vector3f vector){
        return x*vector.getX() + y*vector.getY() + z*vector.getZ();
    }

    public Vector3f normalize(){
        float lenght = length();
        x/= lenght;
        y/= lenght;
        z/= lenght;

        return this;
    }

    public Vector3f rotate(){
        return null;
    }

    public Vector3f add(Vector3f vector){
        return new Vector3f(x + vector.getX(), y + vector.getY(), z + vector.getZ());
    }

    public Vector3f add(float vector){
        return new Vector3f(x + vector, y + vector, z + vector );
    }

    public Vector3f sub(Vector3f vector){
        return new Vector3f(x - vector.getX(), y - vector.getY(), z - vector.getZ());
    }

    public Vector3f sub(float vector){
        return new Vector3f(x - vector, y - vector, z - vector );
    }
    public Vector3f multiply(Vector3f vector){
        return new Vector3f(x * vector.getX(), y * vector.getY(), z * vector.getZ());
    }

    public Vector3f multiply(float vector){
        return new Vector3f(x * vector, y * vector, z * vector );
    }
    public Vector3f divide(Vector3f vector){
        return new Vector3f(x / vector.getX(), y / vector.getY(), z / vector.getZ());
    }

    public Vector3f divide(float vector){
        return new Vector3f(x / vector, y / vector, z / vector );
    }

    public Vector3f cross(Vector3f vector){
        float x_ = y * vector.getZ() - z * vector.getY();
        float y_ = z * vector.getX() - x * vector.getZ();
        float z_ = x * vector.getY() - y * vector.getX();

        return new Vector3f(x_, y_, z_);
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

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
}
