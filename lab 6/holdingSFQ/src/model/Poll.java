package model;

public class Poll{

private int serviceDoIt;
private int answerTime;
private int relationCostXBenefit;


//builder 

public Poll(int serviceDoIt,int answerTime,int relationCostXBenefit){
  this.serviceDoIt = serviceDoIt;
  this.answerTime = answerTime;
  this.relationCostXBenefit = relationCostXBenefit;
}

//getters & setters 

public int getServiceDoIt(){
  return serviceDoIt;
}

public void setServiceDoIt(int serviceDoIt){
  this.serviceDoIt = serviceDoIt;
}

public int getAnswerTime(){
  return answerTime;
}

public void setAnswerTime(int answerTime){
  this.answerTime = answerTime;
}

public int getRelationCostXBenefit(){
  return relationCostXBenefit;
}

public void setRelationCostXBenefit(int relationCostXBenefit){
  this.relationCostXBenefit = relationCostXBenefit;
}

public String toString1(){

String msj = "";

msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El servicio hecho es :" + serviceDoIt + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El tiempo de respuesta es:" + answerTime + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El costo de relacion por beneficio es:" + relationCostXBenefit + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

return msj;

}

}
