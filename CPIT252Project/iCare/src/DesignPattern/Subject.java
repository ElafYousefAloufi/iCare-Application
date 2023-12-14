
package DesignPattern;
public interface Subject {

    public void registers(Observer o);

    public void unregisters(Observer o);

    public void notifyAllRegisters();

}
