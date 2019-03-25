import Verificateur from '../verif/Verificateur.js'
    export default class Mastercard extends Verificateur{
        constructor(number){
            super();
             this._number = number;
        }
        verifier_code(){
            var cardno = new RegExp(/^(?:5[1-5][0-9]{14})$/);
         if(cardno.test(this._number))
        {
            alert("successful!");
             return true;
        }
         else
        {
            //alert("Not a valid Mastercard number!");
            return false;
            }
        }
    }