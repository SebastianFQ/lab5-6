package model;

public class PublicCompany extends ServiceCompany implements Taxes{

public final static String SAWAGE_SYSTEM = "Alcantarillado" ;
public final static String ENERGY = "Energia" ;
public final static String AQUEDUCT ="Acueducto" ;

private String servicePublic;
private int suscriptorsTotally;
private int suscriptorsOneAndTwo;


//builder 


public PublicCompany(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, String dateOfInscription, char typeOrganization, String legalName,Building build,String servicePublic,int suscriptorsTotally, int suscriptorsOneAndTwo){

super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,dateOfInscription,typeOrganization,legalName,build);
this.servicePublic = servicePublic;
this.suscriptorsTotally = suscriptorsTotally;
this.suscriptorsOneAndTwo = suscriptorsOneAndTwo;

}

public String getServicePublic(){
  return servicePublic;
}

public void setServicePublic(String servicePublic){
  this.servicePublic = servicePublic;
}

public int getSuscriptorsTotally(){
  return suscriptorsTotally;
}

public void setSuscriptorsTotally(int suscriptorsTotally){
  this.suscriptorsTotally = suscriptorsTotally;
}

public int getSuscriptorsOneAndTwo(){
  return suscriptorsOneAndTwo;
}

public void setSuscriptorsOneAndTwo(int suscriptorsOneAndTwo){
  this.suscriptorsOneAndTwo = suscriptorsOneAndTwo;
}

public String toString(){
String msj = "";

msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += super.toString() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El servicio publico es:" + servicePublic + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El total de suscriptores es:" + suscriptorsTotally + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La cantidad de suscriptores uno y dos es:" +suscriptorsOneAndTwo + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El impuesto proCultura es:" + calculatedProCultura() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

return msj;


}

public double calculatedProCultura(){

double porProCultura = 0.0;

porProCultura += 40 - (suscriptorsTotally/100);

if(porProCultura < 0){

porProCultura = 0.0;

}

return porProCultura;


}



}
