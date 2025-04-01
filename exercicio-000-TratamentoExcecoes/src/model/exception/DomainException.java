package model.exception;

public class DomainException extends Exception{
    //uma classe que pode ser serializada, exige versão, pode trafegar na web, arquivos etc
    private static final long serialVerisonUID = 1L;

    public DomainException(String msg){
        super(msg);
    }
}
