package thi_thu.model;

import org.omg.CORBA.PUBLIC_MEMBER;

public class IDInvalidException extends Exception{
    public IDInvalidException(String mess){
        super(mess);
    }
}
