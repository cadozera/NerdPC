
package nerdpc;

public abstract class ComputadorFactory {
    public abstract Fonte colocarFonte();
    public abstract Harddisk colocarHardDisk();
    public abstract PlacaMae colocarPlacaMae();
    public abstract Processador colocarProcessador();
    public abstract Ram colocarRam();
    public abstract Vga colocarVga();
    
}
