package model;

public class FoodCompany extends ManufacturingCompany{

public final static String ROOM_TEMPERATURE = "Temperatura ambiente" ;

public final static String REFRIGERATION = "Refrigeracion";

public final static String FREEZER = "Congelacion" ;


private String importer;
private String maker;
private String conservation;


//builder

public FoodCompany(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, String dateOfInscription, char typeOrganization, String legalName,Building build,String importer,String maker,String conservation){
super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,dateOfInscription,typeOrganization,legalName,build);
this.importer = importer;
this.maker = maker;
this.conservation = conservation;
}


//getters and setters
public String getImporter(){
  return importer;
}

public void setImporter(String importer){
	
  this.importer = importer;
}

public String getMaker(){
  return maker;
}

public void setMaker(String maker){
  this.maker = maker;
}

public String getConservation(){
  return conservation;
}

public void setConservation(String conservation){
  this.conservation = conservation;
}

public String toString(){
String msj = "";

msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += super.toString() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "este es el importador:" + importer + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "este es el fabricante:" + maker + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "esta es la conversacion:" + conservation + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

return msj;


}




}
