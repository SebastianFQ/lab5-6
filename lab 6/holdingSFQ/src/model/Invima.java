package model;

public class Invima extends ManufacturingCompany implements Consuptiom{

public final static char FABRICATION_EXPO = 'X';
public final static char FABRICATION_SELL = 'Y';
public final static char IMPORT_SELL = 'Z';
public final static String VALID = "Vigente";
public final static String NORENEWED = "No renovado";

private String sanitaryRegistration;
private String state;
private String expiration;
private char modality;

//builder

public Invima(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, String dateOfInscription, char typeOrganization, String legalName,Building build,String sanitaryRegistration, String state, String expiration, char modality){
	
super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,dateOfInscription,typeOrganization,legalName,build);

  this.sanitaryRegistration = sanitaryRegistration;
  
  this.state = state;
  
  this.expiration = expiration;
  
  this.modality = modality;
}
//getters & setters
public String getSanitaryRegistration(){
	
  return sanitaryRegistration;
}

public void setSanitaryRegistration(String sanitaryRegistration){
	
  this.sanitaryRegistration = sanitaryRegistration;
}

public String getState(){
	
  return state;
}

public void setState(String state){
	
  this.state = state;
}

public String getExpiration(){
	
  return expiration;
}

public void setExpiration(String expiration){
	
  this.expiration = expiration;
}

public char getModality(){
	
return modality;
}

public void setModality(char modality){
	
  this.modality = modality;
}

public String toString(){
String msj = "";

msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += super.toString() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "este es el registro sanitario:" + sanitaryRegistration + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "este es el estado:" + state + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "esta es la expiracion:" + expiration + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "esta es la modalidad:" + modality + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "Los arboles para sembrar son:" + calculatedThingXArbol() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

return msj;


}

//methods 

public int calculatedThingXArbol(){

int amountTree = 0;

for(int i = 0; i < getProducts().size(); i++){
  Product m = getProducts().get(i);
  if(m.getWaterAmount() > 1 && m.getWaterAmount()  < 140){

    amountTree = 6;

  }else if(m.getWaterAmount()  >41&& m.getWaterAmount()  < 800){

      amountTree = 25;

    }else if(m.getWaterAmount() >800){

          amountTree = 200;

        }
      }

return amountTree;

}


}
