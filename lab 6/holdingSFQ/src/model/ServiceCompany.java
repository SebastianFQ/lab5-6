package model;

import java.util.ArrayList;

public class ServiceCompany extends Company{

//Relations

private ArrayList<Poll> polls;

public ServiceCompany(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, String dateOfInscription, char typeOrganization, String legalName,Building build){
super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,dateOfInscription,typeOrganization,legalName,build);
polls = new ArrayList<Poll>();
}

public ArrayList<Poll> getPolls(){
  return polls;
}

public void setPolls(ArrayList<Poll> polls){
  this.polls = polls;
}

public void addPolls(ArrayList<Poll> client){
  polls = client;
}

public String getInfor(){
String msj = "";

for(int i = 0 ; i < polls.size();i++){

msj += polls.get(i).toString1();


}

return msj;

}

public String toString(){
String msj = "";

msj += "----------------------------------------------------------------------------------------------------------------------------\n";
msj += "este es el nombre del comercio:" + getNameComercy() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "este es el nit:" + getNit() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += " esta es la direccion :" + getAddres() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "numero celular:" + getPhoneContact() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "cantidad de empleados:" + getEmployeerCant() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "cantidad de activos:" + getAmountActives() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La fecha en la que se hizo es:" + getDateOfInscription()+ "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "tipo de organizacion:" + getTypeOrganization()+ "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "este es el nombre legal:" + getLegalName()+ "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "este es el promedio de las encuestas:" + promediateFinal()+ "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "Promedio de las encuestas de 50" + promediateFinal1() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

for(int k = 0; k < polls.size();k++){
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += polls.get(k).toString1();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

}

return msj;


}

public int promediateOfThis(){

int ser = 0;
for(int i = 0; i < polls.size();i++){
  ser += polls.get(i).getServiceDoIt();

}
return ser;

}

public int promediateOfThis1(){

int ans = 0;
for(int i = 0; i < polls.size();i++){
  ans += polls.get(i).getAnswerTime();

}
return ans;

}

public int promediateOfThis2(){

int rela = 0;
for(int i = 0; i < polls.size();i++){
  rela += polls.get(i).getRelationCostXBenefit();
}
return rela;

}

public int promediateFinal(){

  int finalPolls = 0;

  finalPolls = (promediateOfThis() + promediateOfThis1() + promediateOfThis2()) / 10;

  return finalPolls;


}

public int promediateFinal1(){

int finalPolls1 = 0;

finalPolls1 = (promediateOfThis() + promediateOfThis1() + promediateOfThis2()) / 50;

return finalPolls1;


}








}
