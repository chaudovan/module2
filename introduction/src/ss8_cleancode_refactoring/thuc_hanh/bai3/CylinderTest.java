package ss8_cleancode_refactoring.thuc_hanh.bai3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class CylinderTest {
    public static void main(String[] args) {
        double cylinder = Cylinder.getVolume(5,6);
        System.out.println(cylinder);

        cylinder = Cylinder.getVolume(4,10);
        System.out.println(cylinder);
    }


}
