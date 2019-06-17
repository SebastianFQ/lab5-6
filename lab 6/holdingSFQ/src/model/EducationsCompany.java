package model;

public class EducationsCompany extends ServiceCompany implements Taxes{

public final static String HIGH_SCHOOL = "Bachillerato" ;
public final static String UNIVERSITY = "Universidad" ;

private String numberRegistrationMEN;
private int numberYearsAcreditation;
private int nationalPositionSaber11;
private int nationalPositionSaberPro;
private String rectorName;
private String educativeSector;
private int amountStudentsStratum1and2;
private int totalAmountActivesStudent;


//builder
public EducationsCompany(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, String dateOfInscription, char typeOrganization, String legalName,Building build, String numberRegistrationMEN,int numberYearsAcreditation,int nationalPositionSaber11,int nationalPositionSaberPro,String rectorName,String educativeSector,int amountStudentsStratum1and2, int totalAmountActivesStudent){
super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,dateOfInscription,typeOrganization,legalName,build);
this.numberRegistrationMEN = numberRegistrationMEN;
this.numberYearsAcreditation = numberYearsAcreditation;
this.nationalPositionSaber11 = nationalPositionSaber11;
this.nationalPositionSaberPro = nationalPositionSaberPro;
this.rectorName = rectorName;
this.educativeSector = educativeSector;
this.amountStudentsStratum1and2 = amountStudentsStratum1and2;
this.totalAmountActivesStudent = totalAmountActivesStudent;
}


//getters & setters
public String getNumberRegistrationMEN(){
  return numberRegistrationMEN;
}

public void setNumberRegistrationMEN(String numberRegistrationMEN){
  this.numberRegistrationMEN = numberRegistrationMEN;
}

public int getNumberYearsAcreditation(){
  return numberYearsAcreditation;
}

public void setNumberYearsAcreditation(int numberYearsAcreditation){
  this.numberYearsAcreditation = numberYearsAcreditation;
}

public int getNationalPositionSaber11(){
  return nationalPositionSaber11;
}

public void setNationalPositionSaber11(int nationalPositionSaber11){
  this.nationalPositionSaber11 = nationalPositionSaber11;
}

public int getNationalPositionSaberPro(){
  return nationalPositionSaberPro;
}

public void setNationalPositionSaberPro(int nationalPositionSaberPro){
  this.nationalPositionSaberPro = nationalPositionSaberPro;
}

public String getRectorName(){
  return rectorName;
}

public void setRectorName(String rectorName){
  this.rectorName = rectorName;
}

public String getEducativeSector(){
  return educativeSector;
}

public void setEducativeSector(String educativeSector){
  this.educativeSector = educativeSector;
}

public int getAmountStudentsStratum1and2(){
  return amountStudentsStratum1and2;
}

public void setAmountStudentsStratum1and2(int amountStudentsStratum1and2){
  this.amountStudentsStratum1and2 = amountStudentsStratum1and2;
}

public int getTotalAmountActivesStudent(){
  return totalAmountActivesStudent;
}

public void setTotalAmountActivesStudent(int totalAmountActivesStudent){
  this.totalAmountActivesStudent = totalAmountActivesStudent;
}

public String toString(){
String msj = "";

msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += super.toString() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "este es el numero de registro:" + numberRegistrationMEN + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "estos son los años de acreditacion:" + numberYearsAcreditation + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "puesto en las pruebas saber 11:" + nationalPositionSaber11 + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "este es el puesto en las pruebas saber pro:" + nationalPositionSaberPro + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "nombre del rector:" +rectorName + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "sector educativo:" + educativeSector + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "numero de estudiantes en estratos 1 y 2:" + amountStudentsStratum1and2 + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "numero total de estudiantes:" +totalAmountActivesStudent + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "precio de impuesto procultura:" + calculatedProCultura() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";


return msj;


}


//methods

public double calculatedProCultura(){
double porcentaje = 0.0;

porcentaje += 20 - ( amountStudentsStratum1and2/100);

if(porcentaje < 0){

porcentaje = 0.0;

}

return porcentaje;
}





}
