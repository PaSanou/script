import Verificateur from '../verif/Verificateur.js'
    export default class American_Express extends Verificateur {
        constructor(number){
            super();
             this._number = number;
        }
        verifier_code(){
            var cardno = new RegExp(/^(?:3[47][0-9]{13})$/);
            if(cardno.test(this._number))
                  {
                return true;
                  }
                else
                  {
                 // alert("Not a valid Amercican Express credit card number!");
                  return false;
                  }
          }

    }