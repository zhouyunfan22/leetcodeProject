package main.java;

public class defangIPaddr {
    public String defangIPaddr(String address) {
        String []wrongAddress=address.split("\\.");

        String wrongAddressString="";
        for(int i=0;i<4;i++){
            wrongAddressString=wrongAddressString+wrongAddress[i];
            if(i!=3){
                wrongAddressString=wrongAddressString+"[.]";
            }}
        return wrongAddressString;
    }
}
