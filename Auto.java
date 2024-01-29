public class Auto {
        public String reifen;
        public String sitze;
        public String motor;
        public String motorhaube;
    
        public Auto(String reifenName, String sitzMaterial, String motorName, String motorhaubenFarbe){
            this.reifen = reifenName;
            this.sitze = sitzMaterial;
            this.motor = motorName;
            this.motorhaube = motorhaubenFarbe;
        }
    
        @Override
        public String toString()
        {
            return reifen +"\n" + sitze + "\n" + motor + "\n" + motorhaube;
        }
    
    }

