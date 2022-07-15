package by.epam.learn.main;

import by.epam.learn.bean.Coin;

import java.lang.reflect.Field;

/**
 *Class {@code Object} is the root of the class hierarchy.
 *Every class has {@code Object} as a superclass. All objects,
 * including arrays, implement the methods of this class.
 *@author McMurphy
 *@see java.lang.Class
 *@since JDK1.0
 * */
public class MyObject {
    /**
     *Indicates whether some other object is "equal to" this one.
     * MORE COMMENTS HERE
     *@param obj the reference object with which to compare.
     *@return {@code true} if this object is the same as the obj
     *argument; {@code false} otherwise.
     *@see #hashCode()
     *@see java.util.HashMap
     */
    public boolean equals(Object obj) {
        return (this == obj);
    }
    /**
     *Creates and returns a copy of this object.
     *MORE COMMENTS HERE
     *@return a clone of this instance.
     *@exception CloneNotSupportedException if the object's class does not
     *support the {@code Cloneable} interface. Subclasses
     *that override the {@code clone} method can also
     *throw this *exception to indicate that an instance cannot be cloned.
     @see java.lang.Cloneable
     */
    protected native Object clone() throws CloneNotSupportedException;
    // more code here
    public static void main(String[] args) {
        System.out.println("check");
        Coin coin = new Coin();
        Class<? extends Coin> c = Coin.class;
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }
}
