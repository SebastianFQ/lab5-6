package model;
import java.util.ArrayList;

public class Holding{

//Relations

private ArrayList<Company> companies;
private Building principalOfThis;


//buider

public Holding(Building principalOfThis){
	
  this.principalOfThis = principalOfThis;
  
companies = new ArrayList<Company>();
}
//getters & setters

public Building getBuilding(){
	
  return principalOfThis;
}

public void setBuilding(Building principalOfThis){
	
  this.principalOfThis = principalOfThis;
}


// methods 
public void addCompany(Company m){
	

  companies.add(m);

}

public String showInfo(){
	
String msj = "";

for(int i = 0; i < companies.size(); i++){
	

msj += companies.get(i).toString();


}
return msj;
}


public void addCompanyProducts(Company k,ArrayList<Product> l){
	

  companies.add(k);
  
  ((ManufacturingCompany) k).addProduct(l);
  


}

public void addCompanyWithPolls(Company k, ArrayList<Poll> polls){
	
	

companies.add(k);


((ServiceCompany)k).addPolls(polls);


}

public String getCompaniesNames(){
	
  String msj = "";

	for(int i = 0; i < companies.size();i++){
		

    	if(companies.get(i) instanceof ServiceCompany){
			

        msj += companies.get(i).getNameComercy();

      }


  }

return msj;

}

public String getCompanyWithProducts(String nombre){
	
String msj = "";

for(int i = 0; i < companies.size();i++){
	

if(companies.get(i) instanceof ManufacturingCompany){
	

  if(companies.get(i).getNameComercy().equals(nombre)){
	  

msj += ((ManufacturingCompany)companies.get(i)).getInformation();

}
}


}
return msj;

}

public String getCompanyWithPolls(String nombre1){
	
String msj = "";

for(int i = 0; i < companies.size();i++){
	

if(companies.get(i) instanceof ServiceCompany){
	
  if(companies.get(i).getNameComercy().equals(nombre1)){
	  

    msj += ((ServiceCompany) companies.get(i)).getInfor();

  }

}

}

return msj;


}

public ArrayList<Product> getProductWithCompany(String nombre){
	

ArrayList<Product> m = null;


  for(int i = 0; i < companies.size();i++){
	  

if(companies.get(i) instanceof ManufacturingCompany){
	
	

  if(companies.get(i).getNameComercy().equals(nombre)){


    m =  ((ManufacturingCompany)companies.get(i)).getProducts();

}

  }
}
return m;
}

public ArrayList<Poll> getPollsWithCompany(String nombre1){

ArrayList<Poll> k = null;

for(int i = 0; i < companies.size();i++){

if(companies.get(i) instanceof ServiceCompany){
  if(companies.get(i).getNameComercy().equals(nombre1)){

    k = ((ServiceCompany)companies.get(i)).getPolls();

  }

}

}

return k;

}

public void addEmployeerToCubicules(String nameCom,String nameEm,String positionEm,String emailEm){

for(int i = 0; i < companies.size();i++){
	
  if(nameCom.equals(companies.get(i).getNameComercy())){
	  
    if(companies.get(i).getBuilding1().getEmployeer() !=null){
		
      companies.get(i).getBuilding1().assigTheEmploInCub(nameEm,positionEm,emailEm);
    }
  }
}

}

public void addBuildingToCompany(String nameCom,Building numberPisos){

for(int i = 0; i < companies.size();i++){
	
  if(companies.get(i).getNameComercy().equals(nameCom)){
	  
    if(companies.get(i).getBuilding1().getEmployeer() == null){
		
        companies.get(i).setBuilding1(numberPisos);
    }
  }

}

}

public String showBuildingL(String nombre3,String nombreEmpleado){
String msj = "";

for(int i = 0; i < companies.size();i++){
if(companies.get(i).getNameComercy().equals(nombre3)){

msj += companies.get(i).getBuilding1().recorridoL(nombreEmpleado);

}

}
return msj;
}

public String showBuildingZ(String nombre3,String nombreEmpleado){
String msj = "";

for(int i = 0; i < companies.size();i++){
if(companies.get(i).getNameComercy().equals(nombre3)){

msj += companies.get(i).getBuilding1().recorridoZ(nombreEmpleado);

}

}
return msj;
}

public String showBuildingEspiral(String nombre3,String cargo1){
String msj = "";

for(int i = 0; i < companies.size();i++){
if(companies.get(i).getNameComercy().equals(nombre3)){
	

msj += companies.get(i).getBuilding1().espiral(cargo1);

}

}
return msj;
}

public String showBuildingE(String nombre3,String nombreEmpleado){
	
String msj = "";

for(int i = 0; i < companies.size();i++){
if(companies.get(i).getNameComercy().equals(nombre3)){
	

msj += companies.get(i).getBuilding1().espiralE(nombreEmpleado);

}

}
return msj;
}

public String showBuildingO(String nombre3,String nombreEmpleado){
String msj = "";

for(int i = 0; i < companies.size();i++){
if(companies.get(i).getNameComercy().equals(nombre3)){

msj += companies.get(i).getBuilding1().espiralO(nombreEmpleado);

}

}
return msj;
}

public String showBuildingX(String nombre3,String nombreEmpleado){
String msj = "";

for(int i = 0; i < companies.size();i++){
	
if(companies.get(i).getNameComercy().equals(nombre3)){
	

msj += companies.get(i).getBuilding1().espiralXfila(nombreEmpleado);

}

}
return msj;
}


}
