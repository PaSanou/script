import Verificateur from '../verif/Verificateur.js'
    export default class Visa extends Verificateur{
        constructor(number){
           super();
            this._number = number;
            
         
        }
        verifier_code(){
            
            var cardno = new RegExp(/^(?:4[0-9]{12}(?:[0-9]{3})?)$/);
            if(cardno.test(this._number))
                  {
             
                //alert("Correcte");
                return true;
                  }
                else
                  {
                  //alert("Not a valid Visa credit card number!");
                  return false;
                  }
               
                 
        }
        
    }