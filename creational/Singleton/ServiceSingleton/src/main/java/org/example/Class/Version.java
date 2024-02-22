package org.example.Class;

import org.w3c.dom.ls.LSOutput;

public class Version {
    private final int major;
    private final int minor;
    private final int revision;

    private static Version instance;

    private Version() {
        this.major = 1;
        this.minor = 0;
        this.revision = 0;
    }

    /**
     * es recomendable usar la synchronized al usar nuestra unica clase
     * al usar multiples hilos
     * @return
     */
    public synchronized static Version getInstance(){
        if(instance == null) {
            instance = new Version();
        }
        return instance;
    }
    @Override
    public String toString(){
        return  major+"."+minor+"."+revision;
    }

    /**
     * Es recomendable sobreescribir el metodo clone
     * para evitar duplicidad de instancias, si alguien intenta clonar la clase
     * retorna una excepcion
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
